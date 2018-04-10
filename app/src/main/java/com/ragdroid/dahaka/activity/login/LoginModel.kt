package com.ragdroid.dahaka.activity.login

import android.databinding.BaseObservable
import android.databinding.Bindable

import com.ragdroid.dahaka.BR

/**
 * Created by garimajain on 13/08/17.
 */

class LoginModel : BaseObservable() {

    @get:Bindable
    var userName: String? = null
        set(userName) {
            field = userName
            notifyPropertyChanged(BR.userName)
        }
    @get:Bindable
    var isSubmitEnabled = true
        set(submitEnabled) {
            field = submitEnabled
            notifyPropertyChanged(BR.submitEnabled)
        }
    @get:Bindable
    var isLoading: Boolean = false
        set(loading) {
            field = loading
            notifyPropertyChanged(BR.loading)
        }
}
