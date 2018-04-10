package com.ragdroid.dahaka.activity.home.profile

import com.ragdroid.dahaka.mvp.BasePresenter
import com.ragdroid.dahaka.mvp.BaseView

/**
 * Created by garimajain on 13/08/17.
 */

interface ProfileContract {

    interface View : BaseView {

        fun showModel(model: ProfileModel)
    }

    interface Presenter : BasePresenter<View>

}
