package com.ragdroid.dahaka.user

import android.os.Bundle

import com.ragdroid.dahaka.app.AppComponent
import com.ragdroid.dahaka.app.UserManager
import com.ragdroid.dahaka.mvp.BaseActivity
import com.ragdroid.dahaka.mvp.BasePresenter
import com.ragdroid.dahaka.mvp.BaseView


/**
 * Created by garimajain on 18/08/17.
 */

abstract class BaseUserActivity<T : BasePresenter<V>, V : BaseView> : BaseActivity<T, V>() {

    internal lateinit var userManager: UserManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (!userManager.isLoggedIn) {
            finishView()
        }
    }

    override fun initDagger(appComponent: AppComponent) {
        userManager = appComponent.userManager
        userManager.userComponent?.let { inject(it) }
    }

    protected fun logoutUser() {
        userManager.logOut()
        finishView()
    }

    protected abstract fun inject(userComponent: UserComponent)
}
