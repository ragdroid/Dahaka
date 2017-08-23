package com.ragdroid.dahaka.app;

import android.app.Application;
import android.databinding.DataBindingComponent;

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
public interface AppComponent extends DataBindingComponent {


    LoginComponent.Builder loginBuilder();

    UserManager getUserManager();

    @Component.Builder
    interface Builder {

        AppComponent build();

        @BindsInstance
        Builder application(Application application);
        Builder apiModule(ApiModule apiModule);
    }

}
