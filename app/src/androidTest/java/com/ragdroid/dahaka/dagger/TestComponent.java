package com.ragdroid.dahaka.dagger;

import android.app.Application;

import com.ragdroid.dahaka.activity.AppBindingModule;
import com.ragdroid.dahaka.activity.login.LoginActivityTest;
import com.ragdroid.dahaka.app.UserManager;
import com.ragdroid.dahaka.user.UserComponent;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by garimajain on 28/08/17.
 */
@Singleton
@Component(modules = {
        MockAppModule.class,
        MockApiModule.class,
        AppBindingModule.class,
        AndroidSupportInjectionModule.class})
public interface TestComponent extends AndroidInjector<DaggerApplication> {


    UserComponent.Builder userBuilder();

    UserManager getUserManager();

    void inject(DahakaTestApplication instance);

    void inject(LoginActivityTest loginActivityTest);

    @Component.Builder
    interface Builder {

        TestComponent build();

        @BindsInstance
        Builder application(Application application);
    }

}

