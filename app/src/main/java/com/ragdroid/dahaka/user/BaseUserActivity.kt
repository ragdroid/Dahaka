package com.ragdroid.dahaka.user

import android.os.Bundle

import com.ragdroid.dahaka.DahakaApplication
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

    override fun androidInject() {
        userManager = (application as DahakaApplication)
                .appComponent.userManager
        UserInjection.inject(this, userManager)
    }

    protected fun logoutUser() {
        userManager.logOut()
        finishView()
    }


}
