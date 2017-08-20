package com.ragdroid.dahaka.activity;

import com.ragdroid.dahaka.activity.login.LoginActivity;
import com.ragdroid.dahaka.activity.login.LoginModule;
import com.ragdroid.dahaka.user.UserComponent;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by garimajain on 20/08/17.
 */
@Module(subcomponents = UserComponent.class)
public abstract class AppBindingModule {

    @ContributesAndroidInjector(modules = LoginModule.class)
    @ActivityScope
    abstract LoginActivity loginActivity();
}
