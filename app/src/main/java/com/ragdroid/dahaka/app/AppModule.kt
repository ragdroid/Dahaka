package com.ragdroid.dahaka.app

import android.app.Application
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.ragdroid.dahaka.util.BaseSchedulerProvider
import com.ragdroid.dahaka.util.SchedulerProvider

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by garimajain on 13/08/17.
 */
@Module
class AppModule {

    @Provides
    internal fun providerSchedulerProvider(provider: SchedulerProvider): BaseSchedulerProvider {
        return provider
    }

    @Provides
    @Singleton
    fun provideGlideRequestManager(application: Application): RequestManager = Glide.with(application)


}
