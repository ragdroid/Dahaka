package com.ragdroid.dahaka.activity.login;

import com.ragdroid.dahaka.mvp.BasePresenter;
import com.ragdroid.dahaka.mvp.BaseView;

/**
 * Created by garimajain on 13/08/17.
 */

public interface LoginContract {

    interface View extends BaseView {

    }

    interface Presenter extends BasePresenter {
        void onSubmitClicked(LoginModel loginModel);
    }

}
