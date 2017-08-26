package com.ragdroid.dahaka

import android.app.Application
import android.databinding.DataBindingUtil

import com.ragdroid.dahaka.app.AppComponent
import com.ragdroid.dahaka.app.DaggerAppComponent

/**
 * Created by garimajain on 13/08/17.
 */

class DahakaApplication : Application() {

    var appComponent: AppComponent? = null
        private set


    override fun onCreate() {
        super.onCreate()
        app = this
        appComponent = DaggerAppComponent.builder().application(this).build()
        DataBindingUtil.setDefaultComponent(appComponent)
    }

    companion object {


        var app: DahakaApplication
            internal set
    }

}
