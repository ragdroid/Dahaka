package com.ragdroid.dahaka.mvp

import io.reactivex.disposables.CompositeDisposable

/**
 * Created by garimajain on 13/08/17.
 */

open class BasePresenterImpl<T : BaseView> : BasePresenter<T> {

    protected var compositeDisposable = CompositeDisposable()

    var view: T? = null
        private set

    override fun onViewAdded(view: T) {
        this.view = view
    }

    override fun onViewRemoved() {
        compositeDisposable.clear()
        view = null
    }
}
