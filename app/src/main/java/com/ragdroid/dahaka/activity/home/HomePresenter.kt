package com.ragdroid.dahaka.activity.home

import com.ragdroid.dahaka.mvp.BasePresenterImpl
import com.ragdroid.dahaka.util.BaseSchedulerProvider

import javax.inject.Inject

/**
 * Created by garimajain on 19/08/17.
 */

class HomePresenter @Inject
constructor(private val schedulerProvider: BaseSchedulerProvider) : BasePresenterImpl<HomeContract.View>(), HomeContract.Presenter
