package com.ragdroid.dahaka.activity.login;

import com.ragdroid.dahaka.mvp.BasePresenter;
import com.ragdroid.dahaka.mvp.BaseView;

/**
 * Created by garimajain on 13/08/17.
 */

public interface LoginContract {

    interface View extends BaseView {

        void showHome();

        void setModel(LoginModel loginModel);
    }

    interface Presenter extends BasePresenter<View> {
        void onSubmitClicked();
    }

}
