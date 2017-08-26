package com.ragdroid.dahaka.activity.login

import com.ragdroid.dahaka.activity.ActivityScope
import com.ragdroid.dahaka.api.entity.Pokemon
import com.ragdroid.dahaka.app.UserManager
import com.ragdroid.dahaka.mvp.BasePresenterImpl
import com.ragdroid.dahaka.util.BaseSchedulerProvider
import com.ragdroid.dahaka.util.TextUtil

import javax.inject.Inject

import io.reactivex.disposables.Disposable
import io.reactivex.functions.Action
import io.reactivex.functions.Consumer

/**
 * Created by garimajain on 13/08/17.
 */
@ActivityScope
class LoginPresenter @Inject
constructor(private val userManager: UserManager, private val schedulerProvider: BaseSchedulerProvider) : BasePresenterImpl<LoginContract.View>(), LoginContract.Presenter {
    private var loginModel: LoginModel? = null

    override fun onViewAdded(view: LoginContract.View) {
        super.onViewAdded(view)
        getView().setModel(loginModel = LoginModel())
    }

    override fun onSubmitClicked() {
        if (TextUtil.isEmpty(loginModel!!.userName)) {
            view.showMessage("Please enter username or id")
            return
        }
        loginModel!!.isSubmitEnabled = false
        loginModel!!.isLoading = true
        val disposable = userManager.loginWithUserName(loginModel!!.userName!!.toLowerCase())
                .subscribeOn(schedulerProvider.io())
                .observeOn(schedulerProvider.ui())
                .doFinally {
                    loginModel!!.isSubmitEnabled = true
                    loginModel!!.isLoading = false
                }
                .subscribe({ pokemon ->
                    view.showMessage("Login Successful")
                    view.showHome()
                }) { throwable ->
                    throwable.printStackTrace()
                    view.showMessage(throwable.message)
                }
        compositeDisposable.add(disposable)

    }
}
