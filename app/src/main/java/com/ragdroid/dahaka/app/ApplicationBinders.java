package com.ragdroid.dahaka.app;

import com.ragdroid.dahaka.activity.login.LoginComponent;
import com.ragdroid.dahaka.user.UserComponent;

import dagger.Module;

/**
 * Created by garimajain on 13/08/17.
 */
@Module(subcomponents = {LoginComponent.class})
public class ApplicationBinders {
}
