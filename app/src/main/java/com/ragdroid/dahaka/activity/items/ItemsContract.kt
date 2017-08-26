package com.ragdroid.dahaka.activity.items

import com.ragdroid.dahaka.mvp.BasePresenter
import com.ragdroid.dahaka.mvp.BaseView

/**
 * Created by garimajain on 13/08/17.
 */

interface ItemsContract {

    interface View : BaseView {

        fun showModel(model: ItemsModel)
    }

    interface Presenter : BasePresenter<View>

}
