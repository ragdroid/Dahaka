package com.ragdroid.dahaka.app;

import com.ragdroid.dahaka.util.BaseSchedulerProvider;
import com.ragdroid.dahaka.util.SchedulerProvider;

import dagger.Module;
import dagger.Provides;

/**
 * Created by garimajain on 24/08/17.
 */
@Module
public class SchedulerModule {

    @Provides
    BaseSchedulerProvider providerSchedulerProvider(SchedulerProvider provider) {
        return provider;
    }

}
