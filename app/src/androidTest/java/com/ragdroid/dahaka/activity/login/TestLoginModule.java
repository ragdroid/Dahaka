package com.ragdroid.dahaka.activity.login;

import com.ragdroid.dahaka.activity.ActivityScope;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import dagger.Module;
import dagger.Provides;

import static org.mockito.Mockito.doCallRealMethod;

/**
 * Created by garimajain on 31/08/17.
 */
@Module
public class TestLoginModule {

    @Provides
    @ActivityScope
    public static LoginContract.Presenter provideLoginPresenter() {
        LoginPresenter loginPresenter = Mockito.mock(LoginPresenter.class);
        doCallRealMethod().when(loginPresenter).onSubmitClicked();
        return loginPresenter;
    }

}
