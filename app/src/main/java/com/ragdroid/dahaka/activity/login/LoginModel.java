package com.ragdroid.dahaka.activity.login;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.ragdroid.dahaka.BR;

/**
 * Created by garimajain on 13/08/17.
 */

public class LoginModel extends BaseObservable {

    private String userName;
    private boolean submitEnabled = true;
    private boolean loading;

    @Bindable
    public boolean isSubmitEnabled() {
        return submitEnabled;
    }

    public void setSubmitEnabled(boolean submitEnabled) {
        this.submitEnabled = submitEnabled;
        notifyPropertyChanged(BR.submitEnabled);
    }

    @Bindable
    public boolean isLoading() {
        return loading;
    }

    public void setLoading(boolean loading) {
        this.loading = loading;
        notifyPropertyChanged(BR.loading);
    }

    @Bindable
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
        notifyPropertyChanged(BR.userName);
    }
}
