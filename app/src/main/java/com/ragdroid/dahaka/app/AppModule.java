package com.ragdroid.dahaka.app;

import android.app.Application;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by garimajain on 13/08/17.
 */
@Module(includes = SchedulerModule.class)
public class AppModule {

    @Provides
    @Singleton
    public RequestManager provideGlideRequestManager(Application application) {
        return Glide.with(application);
    }

}
