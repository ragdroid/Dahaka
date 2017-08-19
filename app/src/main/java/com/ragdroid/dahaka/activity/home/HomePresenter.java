package com.ragdroid.dahaka.activity.home;

import com.ragdroid.dahaka.mvp.BasePresenterImpl;

import javax.inject.Inject;

/**
 * Created by garimajain on 19/08/17.
 */

public class HomePresenter extends BasePresenterImpl<HomeContract.View> implements HomeContract.Presenter  {

    @Inject
    public HomePresenter() {

    }
}
