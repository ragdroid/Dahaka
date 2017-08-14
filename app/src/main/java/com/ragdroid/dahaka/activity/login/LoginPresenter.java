package com.ragdroid.dahaka.activity.login;

import com.ragdroid.dahaka.activity.ActivityScope;
import com.ragdroid.dahaka.api.entity.Pokemon;
import com.ragdroid.dahaka.app.UserManager;
import com.ragdroid.dahaka.mvp.BasePresenterImpl;
import com.ragdroid.dahaka.user.UserScope;
import com.ragdroid.dahaka.util.BaseSchedulerProvider;
import com.ragdroid.dahaka.util.TextUtil;

import javax.inject.Inject;

import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/**
 * Created by garimajain on 13/08/17.
 */
@ActivityScope
public class LoginPresenter extends BasePresenterImpl implements LoginContract.Presenter {

    private final UserManager userManager;
    private final BaseSchedulerProvider schedulerProvider;

    @Inject
    public LoginPresenter(UserManager userManager, BaseSchedulerProvider schedulerProvider) {
        this.userManager = userManager;
        this.schedulerProvider = schedulerProvider;
    }

    @Override
    public void onSubmitClicked(LoginModel loginModel) {
        if (TextUtil.isEmpty(loginModel.getUserName())) {
            getView().showMessage("Please enter username or id");
            return;
        }
        Disposable disposable = userManager.loginWithUserName(loginModel.getUserName())
                .subscribeOn(schedulerProvider.io())
                .observeOn(schedulerProvider.ui())
                .subscribe(new Consumer<Pokemon>() {
                    @Override
                    public void accept(Pokemon pokemon) throws Exception {
                        getView().showMessage("Login Successful");
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        throwable.printStackTrace();
                        getView().showMessage(throwable.getMessage());
                    }
                });
        compositeDisposable.add(disposable);

    }
}
