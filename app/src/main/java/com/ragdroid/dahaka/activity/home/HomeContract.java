package com.ragdroid.dahaka.activity.home;

import com.ragdroid.dahaka.mvp.BasePresenter;
import com.ragdroid.dahaka.mvp.BaseView;

/**
 * Created by garimajain on 13/08/17.
 */

public interface HomeContract {

    interface View extends BaseView {

    }

    interface Presenter extends BasePresenter<View> {

    }

}
