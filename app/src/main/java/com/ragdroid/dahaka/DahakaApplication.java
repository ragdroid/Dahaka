package com.ragdroid.dahaka;
import android.app.Activity;
import android.app.Application;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;

import com.ragdroid.dahaka.app.AppComponent;
import com.ragdroid.dahaka.app.DaggerAppComponent;
import com.ragdroid.dahaka.app.DaggerAppDataBindingComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

/**
 * Created by garimajain on 13/08/17.
 */

public class DahakaApplication extends Application implements HasActivityInjector {

    @Inject DispatchingAndroidInjector<Activity> activityInjector;

    public static DahakaApplication getApp() {
        return app;
    }

    private static DahakaApplication app;

    public AppComponent getAppComponent() {
        return appComponent;
    }

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        DataBindingUtil.setDefaultComponent(buildDataBindingComponent());
        appComponent = DaggerAppComponent.builder().application(this).build();
        appComponent.inject(this);
    }

    private DataBindingComponent buildDataBindingComponent() {
        return DaggerAppDataBindingComponent.builder().application(this).build();
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return activityInjector;
    }
}
