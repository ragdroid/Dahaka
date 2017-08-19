package com.ragdroid.dahaka.activity.home.stats;

import com.ragdroid.dahaka.mvp.BasePresenter;
import com.ragdroid.dahaka.mvp.BaseView;

/**
 * Created by garimajain on 13/08/17.
 */

public interface StatsContract {

    interface View extends BaseView {

        void showModel(StatsModel statsModel);
    }

    interface Presenter extends BasePresenter<View> {

    }

}
