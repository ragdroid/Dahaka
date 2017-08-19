package com.ragdroid.dahaka.activity.items;

import com.ragdroid.dahaka.mvp.BasePresenter;
import com.ragdroid.dahaka.mvp.BaseView;

/**
 * Created by garimajain on 13/08/17.
 */

public interface ItemsContract {

    interface View extends BaseView {

        void showModel(ItemsModel model);
    }

    interface Presenter extends BasePresenter<View> {

    }

}
