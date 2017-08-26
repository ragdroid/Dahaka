package com.ragdroid.dahaka.app

import com.ragdroid.dahaka.util.BaseSchedulerProvider
import com.ragdroid.dahaka.util.SchedulerProvider

import dagger.Module
import dagger.Provides

/**
 * Created by garimajain on 24/08/17.
 */
@Module
class SchedulerModule {

    @Provides
    internal fun providerSchedulerProvider(provider: SchedulerProvider): BaseSchedulerProvider {
        return provider
    }

}
