package com.ragdroid.dahaka.mvp

/**
 * Created by garimajain on 13/08/17.
 */

interface BasePresenter<T : BaseView> {

    fun onViewAdded(view: T)

    fun onViewRemoved()

}
