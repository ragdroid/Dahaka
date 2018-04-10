package com.ragdroid.dahaka.api

import android.app.Application

import com.google.gson.FieldNamingPolicy
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.ragdroid.dahaka.user.PokemonService
import java.util.concurrent.TimeUnit

import javax.inject.Singleton

import dagger.Module
import dagger.Provides
import okhttp3.Cache
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by garimajain on 13/08/17.
 */
@Module
class ApiModule {

    val loggingInterceptor: HttpLoggingInterceptor
        @Provides
        @Singleton
        get() {
            val loggingInterceptor = HttpLoggingInterceptor()
            loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
            return loggingInterceptor
        }

    protected val baseUrl: String
        get() = "http://pokeapi.co/api/v2/"


    @Provides
    @Singleton
    internal fun provideGson(): Gson {
        val gsonBuilder = GsonBuilder()
        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
        return gsonBuilder.create()
    }

    @Provides
    @Singleton
    internal fun provideOkhttpCache(application: Application): Cache {
        return Cache(application.cacheDir, CACHE_SIZE)
    }

    @Provides
    @Singleton
    internal fun provideCacheOverrideInterceptor(): Interceptor {
        return Interceptor { chain ->
            val maxStale = 60 * 60 * 24 * 7 // tolerate 1-week stale
            chain.proceed(chain.request())
                    .newBuilder()
                    .header("Cache-Control", "public, only-if-cached, max-age=" + maxStale)
                    .build()
        }
    }

    @Provides
    @Singleton
    internal fun provideOkHttpClient(loggingInterceptor: HttpLoggingInterceptor, cache: Cache,
                                     cacheOverrideInterceptor: Interceptor): OkHttpClient {
        val builder = OkHttpClient.Builder()
                .cache(cache)
                .addInterceptor(loggingInterceptor)
                .connectTimeout(60, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)
                .writeTimeout(60, TimeUnit.SECONDS)
                .addNetworkInterceptor(cacheOverrideInterceptor)
        return builder
                .build()

    }


    @Provides
    @Singleton
    internal fun provideRetrofit(gson: Gson, okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .baseUrl(baseUrl)
                .client(okHttpClient)
                .build()
    }

    @Provides
    @Singleton
    fun providePokemonService(retrofit: Retrofit): PokemonService {
        return retrofit.create(PokemonService::class.java)
    }

    companion object {


        private val CACHE_SIZE = (10 * 1024 * 1024).toLong() //10 MB
    }


}
