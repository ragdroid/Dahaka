package com.ragdroid.dahaka.app;

import android.app.Application;

import com.ragdroid.dahaka.activity.login.LoginComponent;
import com.ragdroid.dahaka.api.ApiModule;
import com.ragdroid.dahaka.user.UserComponent;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

/**
 * Created by garimajain on 13/08/17.
 */
@Singleton
@Component(modules = {AppModule.class, ApiModule.class})
public interface AppComponent {


    LoginComponent.Builder loginBuilder();
    UserComponent.Builder userBuilder();

    @Component.Builder
    interface Builder {

        AppComponent build();

        @BindsInstance
        Builder application(Application application);
        Builder apiModule(ApiModule apiModule);
    }

}
