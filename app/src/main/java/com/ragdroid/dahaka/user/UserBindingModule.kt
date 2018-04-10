package com.ragdroid.dahaka.user


import com.ragdroid.dahaka.activity.home.HomeActivity
import com.ragdroid.dahaka.activity.home.HomeModule
import com.ragdroid.dahaka.activity.items.ItemsActivity
import com.ragdroid.dahaka.activity.items.ItemsModule

import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

/**
 * Created by garimajain on 13/08/17.
 */
@Module
abstract class UserBindingModule {


    @ContributesAndroidInjector(modules = arrayOf(HomeModule::class, AndroidSupportInjectionModule::class))
    internal abstract fun homeActivity(): HomeActivity

    @ContributesAndroidInjector(modules = arrayOf(ItemsModule::class))
    internal abstract fun itemsActivity(): ItemsActivity
}
