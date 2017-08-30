package com.ragdroid.dahaka.user;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.ragdroid.dahaka.DahakaApplication;
import com.ragdroid.dahaka.app.UserManager;
import com.ragdroid.dahaka.mvp.BaseActivity;
import com.ragdroid.dahaka.mvp.BasePresenter;

import javax.inject.Inject;

import dagger.android.AndroidInjection;


/**
 * Created by garimajain on 18/08/17.
 */

public abstract class BaseUserActivity<T extends BasePresenter> extends BaseActivity<T> {

    @Inject UserManager userManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (!userManager.isLoggedIn()) {
            finishView();
        }
    }

    @Override
    protected void androidInject() {
        AndroidInjection.inject(this);
    }

    protected void logoutUser() {
        userManager.logOut();
        finishView();
    }


}
