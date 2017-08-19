package com.ragdroid.dahaka.app;

import android.app.Application;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.ragdroid.dahaka.util.BaseSchedulerProvider;
import com.ragdroid.dahaka.util.SchedulerProvider;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by garimajain on 13/08/17.
 */
@Module
public class AppModule {

    @Provides
    BaseSchedulerProvider providerSchedulerProvider(SchedulerProvider provider) {
        return provider;
    }

    @Provides
    @Singleton
    public RequestManager provideGlideRequestManager(Application application) {
        return Glide.with(application);
    }

}
