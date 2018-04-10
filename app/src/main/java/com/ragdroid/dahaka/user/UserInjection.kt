package com.ragdroid.dahaka.user

import android.app.Activity

import dagger.android.AndroidInjector
import dagger.android.HasActivityInjector

/**
 * Normally `Application` class is supposed to be an `ActivityInjector` after implementing
 * `HasActivityInjector` but we want to pass our `ActivityInjector` ourselves, which is a custom
 * class called `UserManager`
 *
 * Created by garimajain on 20/08/17.
 */

object UserInjection {


    /**
     * Injects `activity` with an associated [AndroidInjector] passed,
     *
     */
    fun inject(activity: Activity, injector: HasActivityInjector) {
        injector.activityInjector().inject(activity)
    }
}
