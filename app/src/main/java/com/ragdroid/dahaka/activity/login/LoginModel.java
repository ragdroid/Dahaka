package com.ragdroid.dahaka.activity.login;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.ragdroid.dahaka.BR;

/**
 * Created by garimajain on 13/08/17.
 */

public class LoginModel extends BaseObservable {

    private String userName;

    @Bindable
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
        notifyPropertyChanged(BR.userName);
    }
}
