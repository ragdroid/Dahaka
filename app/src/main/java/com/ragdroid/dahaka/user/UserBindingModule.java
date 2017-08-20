package com.ragdroid.dahaka.user;


import com.ragdroid.dahaka.activity.home.HomeActivity;
import com.ragdroid.dahaka.activity.home.HomeModule;
import com.ragdroid.dahaka.activity.items.ItemsActivity;
import com.ragdroid.dahaka.activity.items.ItemsModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by garimajain on 13/08/17.
 */
@Module
public abstract class UserBindingModule {


    @ContributesAndroidInjector(modules = {HomeModule.class, AndroidSupportInjectionModule.class})
    abstract HomeActivity homeActivity();

    @ContributesAndroidInjector(modules = {ItemsModule.class})
    abstract ItemsActivity itemsActivity();
}
