package com.ragdroid.dahaka.activity.home.stats

import com.ragdroid.dahaka.mvp.BasePresenter
import com.ragdroid.dahaka.mvp.BaseView

/**
 * Created by garimajain on 13/08/17.
 */

interface StatsContract {

    interface View : BaseView {

        fun showModel(statsModel: StatsModel)
    }

    interface Presenter : BasePresenter<View>

}
