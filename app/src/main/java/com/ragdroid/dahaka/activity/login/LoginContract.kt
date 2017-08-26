package com.ragdroid.dahaka.activity.login

import com.ragdroid.dahaka.mvp.BasePresenter
import com.ragdroid.dahaka.mvp.BaseView

/**
 * Created by garimajain on 13/08/17.
 */

interface LoginContract {

    interface View : BaseView {

        fun showHome()

        fun setModel(loginModel: LoginModel)
    }

    interface Presenter : BasePresenter<View> {
        fun onSubmitClicked()
    }

}
