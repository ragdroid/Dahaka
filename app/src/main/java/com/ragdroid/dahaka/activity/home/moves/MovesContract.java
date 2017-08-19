package com.ragdroid.dahaka.activity.home.moves;

import com.ragdroid.dahaka.mvp.BasePresenter;
import com.ragdroid.dahaka.mvp.BaseView;

/**
 * Created by garimajain on 13/08/17.
 */

public interface MovesContract {

    interface View extends BaseView {

        void showModel(MovesModel statsModel);
    }

    interface Presenter extends BasePresenter<View> {

    }

}
