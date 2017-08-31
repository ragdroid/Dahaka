package com.ragdroid.dahaka.app;

import com.ragdroid.dahaka.activity.ActivityScope;
import com.ragdroid.dahaka.activity.AppBindingModule;
import com.ragdroid.dahaka.activity.login.LoginActivity;
import com.ragdroid.dahaka.activity.login.LoginModule;
import com.ragdroid.dahaka.activity.login.TestLoginModule;

import dagger.android.ContributesAndroidInjector;

/**
 * Created by garimajain on 31/08/17.
 */

public abstract class TestAppBindingModule extends AppBindingModule {

    @ContributesAndroidInjector(modules = TestLoginModule.class)
    @ActivityScope
    abstract LoginActivity loginActivity();
}
