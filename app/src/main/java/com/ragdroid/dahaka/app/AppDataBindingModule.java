package com.ragdroid.dahaka.app;

import android.app.Application;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by garimajain on 20/08/17.
 */
@Module
public class AppDataBindingModule {
    @Provides
    @Singleton
    public RequestManager provideGlideRequestManager(Application application) {
        return Glide.with(application);
    }
}
