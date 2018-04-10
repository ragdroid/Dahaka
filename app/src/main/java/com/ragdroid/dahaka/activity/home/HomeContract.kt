package com.ragdroid.dahaka.activity.home

import com.ragdroid.dahaka.mvp.BasePresenter
import com.ragdroid.dahaka.mvp.BaseView

/**
 * Created by garimajain on 13/08/17.
 */

interface HomeContract {

    interface View : BaseView

    interface Presenter : BasePresenter<View>

}
