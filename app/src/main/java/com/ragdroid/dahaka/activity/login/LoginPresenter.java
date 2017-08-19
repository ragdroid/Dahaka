package com.ragdroid.dahaka.activity.login;

import com.ragdroid.dahaka.activity.ActivityScope;
import com.ragdroid.dahaka.api.entity.Pokemon;
import com.ragdroid.dahaka.app.UserManager;
import com.ragdroid.dahaka.mvp.BasePresenterImpl;
import com.ragdroid.dahaka.util.BaseSchedulerProvider;
import com.ragdroid.dahaka.util.TextUtil;

import javax.inject.Inject;

import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

/**
 * Created by garimajain on 13/08/17.
 */
@ActivityScope
public class LoginPresenter extends BasePresenterImpl<LoginContract.View> implements LoginContract.Presenter {

    private final UserManager userManager;
    private final BaseSchedulerProvider schedulerProvider;
    private LoginModel loginModel;

    @Inject
    public LoginPresenter(UserManager userManager, BaseSchedulerProvider schedulerProvider) {
        this.userManager = userManager;
        this.schedulerProvider = schedulerProvider;
    }

    @Override
    public void onViewAdded(LoginContract.View view) {
        super.onViewAdded(view);
        getView().setModel(loginModel = new LoginModel());
    }

    @Override
    public void onSubmitClicked() {
        if (TextUtil.isEmpty(loginModel.getUserName())) {
            getView().showMessage("Please enter username or id");
            return;
        }
        loginModel.setSubmitEnabled(false);
        loginModel.setLoading(true);
        Disposable disposable = userManager.loginWithUserName(loginModel.getUserName().toLowerCase())
                .subscribeOn(schedulerProvider.io())
                .observeOn(schedulerProvider.ui())
                .doFinally(() -> {
                    loginModel.setSubmitEnabled(true);
                    loginModel.setLoading(false);
                })
                .subscribe(pokemon -> {
                    getView().showMessage("Login Successful");
                    getView().showHome();
                }, throwable -> {
                    throwable.printStackTrace();
                    getView().showMessage(throwable.getMessage());
                });
        compositeDisposable.add(disposable);

    }
}
