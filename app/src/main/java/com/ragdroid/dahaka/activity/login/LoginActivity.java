package com.ragdroid.dahaka.activity.login;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.ragdroid.dahaka.DahakaApplication;
import com.ragdroid.dahaka.R;
import com.ragdroid.dahaka.databinding.ActivityLoginBinding;
import com.ragdroid.dahaka.mvp.BaseActivity;

public class LoginActivity extends BaseActivity<LoginContract.Presenter> implements LoginContract.View {

    private LoginComponent loginComponent;
    private ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        binding.setModel(new LoginModel());
        binding.setPresenter(getPresenter());
    }

    @Override
    protected void initDagger() {
        loginComponent = ((DahakaApplication) getApplication()).getAppComponent()
                .loginBuilder()
                .loginActivity(this)
                .build();
        loginComponent.inject(this);
    }

}
