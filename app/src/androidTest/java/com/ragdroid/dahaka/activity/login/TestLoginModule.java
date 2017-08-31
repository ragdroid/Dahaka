package com.ragdroid.dahaka.activity.login;

import com.ragdroid.dahaka.activity.ActivityScope;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import dagger.Module;
import dagger.Provides;

import static org.mockito.Mockito.doCallRealMethod;

/**
 * Created by garimajain on 31/08/17.
 */
@Module
public class TestLoginModule {

    @Mock LoginPresenter loginPresenter;

    public TestLoginModule() {
        MockitoAnnotations.initMocks(this);
    }

    @Provides
    @ActivityScope
    public LoginContract.Presenter provideLoginPresenter() {
        doCallRealMethod().when(loginPresenter).onSubmitClicked();
        return loginPresenter;
    }

}
