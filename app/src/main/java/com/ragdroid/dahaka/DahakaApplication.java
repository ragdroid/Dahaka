package com.ragdroid.dahaka;

import android.app.Application;
import android.databinding.DataBindingUtil;

import com.ragdroid.dahaka.app.AppComponent;
import com.ragdroid.dahaka.app.DaggerAppComponent;

/**
 * Created by garimajain on 13/08/17.
 */

public class DahakaApplication extends Application {


    static DahakaApplication app;

    public static DahakaApplication getApp() {
        return app;
    }

    private AppComponent appComponent;

    public AppComponent getAppComponent() {
        return appComponent;
    }


    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        appComponent = DaggerAppComponent.builder().application(this).build();
        DataBindingUtil.setDefaultComponent(appComponent);
    }

}
