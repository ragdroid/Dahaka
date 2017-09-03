package com.ragdroid.dahaka;


import com.ragdroid.dahaka.app.DaggerTestComponent;
import com.ragdroid.dahaka.app.TestComponent;

/**
 * Created by garimajain on 28/08/17.
 */

public class DahakaTestApplication extends DahakaApplication {

    public TestComponent getTestComponent() {
        return testComponent;
    }

    private TestComponent testComponent;

    @Override
    protected void createComponent() {
        testComponent = DaggerTestComponent.builder().application(this).build();
        testComponent.inject(this);
    }

}
