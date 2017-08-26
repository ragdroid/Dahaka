package com.ragdroid.dahaka.app

import android.app.Application
import android.databinding.DataBindingComponent
import com.ragdroid.dahaka.DahakaApplication

import com.ragdroid.dahaka.activity.login.LoginComponent
import com.ragdroid.dahaka.api.ApiModule
import com.ragdroid.dahaka.user.UserComponent
import com.ragdroid.dahaka.util.BaseSchedulerProvider

import javax.inject.Singleton

import dagger.BindsInstance
import dagger.Component

/**
 * Created by garimajain on 13/08/17.
 */
@Singleton
@Component(modules = arrayOf(AppModule::class, ApiModule::class))
interface AppComponent {


    fun loginBuilder(): LoginComponent.Builder

    val userManager: UserManager

    val bindingProvider: DataBindingProvider

    fun schedulerProvider(): BaseSchedulerProvider

    @Component.Builder
    interface Builder {

        fun build(): AppComponent

        @BindsInstance
        fun application(application: Application): Builder

        fun apiModule(apiModule: ApiModule): Builder
    }

}
