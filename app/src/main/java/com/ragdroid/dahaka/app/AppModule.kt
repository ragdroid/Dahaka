package com.ragdroid.dahaka.app

import android.app.Application

import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager

import javax.inject.Singleton

import dagger.Module
import dagger.Provides

/**
 * Created by garimajain on 13/08/17.
 */
@Module(includes = arrayOf(SchedulerModule::class))
class AppModule {

    @Provides
    @Singleton
    fun provideGlideRequestManager(application: Application): RequestManager {
        return Glide.with(application)
    }

}
