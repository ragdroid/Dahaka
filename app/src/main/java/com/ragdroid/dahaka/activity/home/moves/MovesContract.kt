package com.ragdroid.dahaka.activity.home.moves

import com.ragdroid.dahaka.mvp.BasePresenter
import com.ragdroid.dahaka.mvp.BaseView

/**
 * Created by garimajain on 13/08/17.
 */

interface MovesContract {

    interface View : BaseView {

        fun showModel(statsModel: MovesModel)
    }

    interface Presenter : BasePresenter<View>

}
