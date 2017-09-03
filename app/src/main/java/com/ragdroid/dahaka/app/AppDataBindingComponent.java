package com.ragdroid.dahaka.app;

import android.app.Application;
import android.databinding.DataBindingComponent;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

/**
 * Created just for the purpose of injecting the {@code RequestManager}
 * Created by garimajain on 20/08/17.
 */
@Singleton
@Component(modules = AppDataBindingModule.class)
public interface AppDataBindingComponent extends DataBindingComponent  {

    @Component.Builder
    interface Builder {

        AppDataBindingComponent build();

        @BindsInstance
        Builder application(Application application);
    }
}
