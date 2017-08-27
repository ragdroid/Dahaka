package com.ragdroid.dahaka.app

import android.app.Application

import com.ragdroid.dahaka.DahakaApplication
import com.ragdroid.dahaka.activity.AppBindingModule
import com.ragdroid.dahaka.api.ApiModule
import com.ragdroid.dahaka.user.UserComponent
import com.ragdroid.dahaka.util.BaseSchedulerProvider

import javax.inject.Singleton

import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.support.AndroidSupportInjectionModule

/**
 * Created by garimajain on 13/08/17.
 */
@Singleton
@Component(modules = arrayOf(AppModule::class, ApiModule::class,
        AppBindingModule::class, AndroidSupportInjectionModule::class))
interface AppComponent : AndroidInjector<DaggerApplication> {

    val userManager: UserManager

    fun schedulerProvider(): BaseSchedulerProvider

    fun inject(instance: DahakaApplication)

    @Component.Builder
    interface Builder {

        fun build(): AppComponent

        @BindsInstance
        fun application(application: Application): Builder

        fun apiModule(apiModule: ApiModule): Builder
    }

}
