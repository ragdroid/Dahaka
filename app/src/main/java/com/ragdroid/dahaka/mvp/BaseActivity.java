package com.ragdroid.dahaka.mvp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.ragdroid.dahaka.activity.login.LoginActivity;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.HasSupportFragmentInjector;

/**
 * Created by garimajain on 13/08/17.
 */

public abstract class BaseActivity<T extends BasePresenter> extends AppCompatActivity implements BaseView,
        HasSupportFragmentInjector {

    public T getPresenter() {
        return presenter;
    }

    @Inject DispatchingAndroidInjector<Fragment> injector;

    @Inject
    T presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        androidInject();
        super.onCreate(savedInstanceState);
        presenter.onViewAdded(this);
    }

    protected void androidInject() {
        AndroidInjection.inject(this);
    }

    @Override
    public void showMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        presenter.onViewRemoved();
        super.onDestroy();
    }

    @Override
    public void finishView() {
        startActivity(new Intent(this, LoginActivity.class));
        finish();
    }
    @Override
    public AndroidInjector<Fragment> supportFragmentInjector() {
        return injector;
    }

}
