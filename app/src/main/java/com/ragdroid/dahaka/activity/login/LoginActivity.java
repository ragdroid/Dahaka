package com.ragdroid.dahaka.activity.login;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.ragdroid.dahaka.R;
import com.ragdroid.dahaka.activity.home.HomeActivity;
import com.ragdroid.dahaka.app.AppComponent;
import com.ragdroid.dahaka.databinding.ActivityLoginBinding;
import com.ragdroid.dahaka.mvp.BaseActivity;

public class LoginActivity extends BaseActivity<LoginContract.Presenter> implements LoginContract.View {

    private LoginComponent loginComponent;
    private ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        super.onCreate(savedInstanceState);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle(R.string.title_activity_login);
        binding.setPresenter(getPresenter());
    }

    @Override
    protected void initDagger(AppComponent appComponent) {
        loginComponent = appComponent
                .loginBuilder()
                .loginActivity(this)
                .build();
        loginComponent.inject(this);
    }

    @Override
    public void showHome() {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void setModel(LoginModel loginModel) {
        binding.setModel(loginModel);
    }
}
