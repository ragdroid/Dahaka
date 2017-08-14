package com.ragdroid.dahaka.activity.login;

import com.ragdroid.dahaka.activity.ActivityScope;

import dagger.BindsInstance;
import dagger.Subcomponent;

/**
 * Created by garimajain on 13/08/17.
 */
@ActivityScope
@Subcomponent(modules = LoginModule.class)
public interface LoginComponent {


    LoginActivity inject(LoginActivity loginActivity);

    @Subcomponent.Builder
    interface Builder {
        LoginComponent build();

        @BindsInstance
        Builder loginActivity(LoginActivity loginActivity);
    }

}
