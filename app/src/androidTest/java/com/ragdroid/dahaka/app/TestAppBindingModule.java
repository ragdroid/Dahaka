package com.ragdroid.dahaka.app;

import android.app.Activity;

import com.ragdroid.dahaka.activity.ActivityScope;
import com.ragdroid.dahaka.activity.login.LoginActivity;
import com.ragdroid.dahaka.activity.login.LoginModule;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * Created by garimajain on 31/08/17.
 */

@Module(subcomponents = TestAppBindingModule.LoginActivitySubcomponent.class)
public abstract class TestAppBindingModule {
    private TestAppBindingModule() {}

    @Binds
    @IntoMap
    @ActivityKey(LoginActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
            LoginActivitySubcomponent.Builder builder);

    @Subcomponent(modules = LoginModule.class)
    @ActivityScope
    public interface LoginActivitySubcomponent extends AndroidInjector<LoginActivity> {
        @Subcomponent.Builder
        abstract class Builder extends AndroidInjector.Builder<LoginActivity> {}
    }
}
