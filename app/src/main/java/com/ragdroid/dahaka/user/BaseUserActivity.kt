package com.ragdroid.dahaka.user

import android.os.Bundle

import com.ragdroid.dahaka.app.AppComponent
import com.ragdroid.dahaka.app.UserManager
import com.ragdroid.dahaka.mvp.BaseActivity
import com.ragdroid.dahaka.mvp.BasePresenter


/**
 * Created by garimajain on 18/08/17.
 */

abstract class BaseUserActivity<T : BasePresenter<*>> : BaseActivity<T>() {

    internal var userManager: UserManager

    protected override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (!userManager.isLoggedIn) {
            finishView()
        }
    }

    protected override fun initDagger(appComponent: AppComponent) {
        userManager = appComponent.userManager
        inject(userManager.userComponent)
    }

    protected fun logoutUser() {
        userManager.logOut()
        finishView()
    }

    protected abstract fun inject(userComponent: UserComponent?)
}
