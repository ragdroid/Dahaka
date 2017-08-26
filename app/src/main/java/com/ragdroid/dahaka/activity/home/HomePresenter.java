package com.ragdroid.dahaka.activity.home;

import com.ragdroid.dahaka.mvp.BasePresenterImpl;
import com.ragdroid.dahaka.util.BaseSchedulerProvider;

import javax.inject.Inject;

/**
 * Created by garimajain on 19/08/17.
 */

public class HomePresenter extends BasePresenterImpl<HomeContract.View> implements HomeContract.Presenter  {

    private final BaseSchedulerProvider schedulerProvider;

    @Inject
    public HomePresenter(BaseSchedulerProvider provider) {
        this.schedulerProvider = provider;
    }
}
