package com.ragdroid.dahaka.mvp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.ragdroid.dahaka.DahakaApplication;
import com.ragdroid.dahaka.activity.login.LoginActivity;
import com.ragdroid.dahaka.app.AppComponent;

import javax.inject.Inject;

/**
 * Created by garimajain on 13/08/17.
 */

public abstract class BaseActivity<T extends BasePresenter> extends AppCompatActivity implements BaseView {

    public T getPresenter() {
        return presenter;
    }

    @Inject
    T presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initDagger(((DahakaApplication) getApplication()).getAppComponent());
        presenter.onViewAdded(this);
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

    protected abstract void initDagger(AppComponent appComponent);
}
