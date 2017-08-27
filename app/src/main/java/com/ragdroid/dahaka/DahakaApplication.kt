package com.ragdroid.dahaka

import android.app.Activity
import android.app.Application
import android.databinding.DataBindingComponent
import android.databinding.DataBindingUtil

import com.ragdroid.dahaka.app.AppComponent
import com.ragdroid.dahaka.app.DaggerAppComponent
import com.ragdroid.dahaka.app.DaggerAppDataBindingComponent

import javax.inject.Inject

import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector

/**
 * Created by garimajain on 13/08/17.
 */

class DahakaApplication : Application(), HasActivityInjector {

    @Inject internal lateinit var activityInjector: DispatchingAndroidInjector<Activity>

    lateinit var appComponent: AppComponent
        private set

    override fun onCreate() {
        super.onCreate()
        app = this
        DataBindingUtil.setDefaultComponent(buildDataBindingComponent())
        appComponent = DaggerAppComponent.builder().application(this).build()
        appComponent.inject(this)
    }

    private fun buildDataBindingComponent(): DataBindingComponent {
        return DaggerAppDataBindingComponent.builder().application(this).build()
    }

    override fun activityInjector(): AndroidInjector<Activity> {
        return activityInjector
    }

    companion object {
        lateinit var app: DahakaApplication
            private set
    }
}
