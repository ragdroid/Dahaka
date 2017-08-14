package com.ragdroid.dahaka.activity.login;

import dagger.Binds;
import dagger.Module;

/**
 * Created by garimajain on 13/08/17.
 */
@Module
public abstract class LoginModule {

    @Binds
    public abstract LoginContract.Presenter provideLoginPresenter(LoginPresenter loginPresenter);

}
