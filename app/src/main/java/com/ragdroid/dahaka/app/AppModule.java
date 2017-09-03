package com.ragdroid.dahaka.app;

import com.ragdroid.dahaka.util.BaseSchedulerProvider;
import com.ragdroid.dahaka.util.SchedulerProvider;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/**
 * Created by garimajain on 13/08/17.
 */
@Module
public abstract class AppModule {

    @Binds
    abstract BaseSchedulerProvider providerSchedulerProvider(SchedulerProvider provider);
}
