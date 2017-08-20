package com.ragdroid.dahaka.user;

import android.app.Activity;

import dagger.android.AndroidInjector;
import dagger.android.HasActivityInjector;

/**
 * Normally `Application` class is supposed to be an `ActivityInjector` after implementing
 * `HasActivityInjector` but we want to pass our `ActivityInjector` ourselves, which is a custom
 * class called `UserManager`
 *
 * Created by garimajain on 20/08/17.
 */

public class UserInjection {


    /**
     * Injects {@code activity} with an associated {@link AndroidInjector} passed,
     *
     */
    public static void inject(Activity activity, HasActivityInjector injector) {
        injector.activityInjector().inject(activity);
    }
}
