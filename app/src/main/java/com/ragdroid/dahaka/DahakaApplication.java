package com.ragdroid.dahaka;

import android.app.Application;

import com.ragdroid.dahaka.activity.login.LoginComponent;
import com.ragdroid.dahaka.app.AppComponent;
import com.ragdroid.dahaka.app.DaggerAppComponent;

/**
 * Created by garimajain on 13/08/17.
 */

public class DahakaApplication extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder().application(this).build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
