package com.ragdroid.dahaka.activity.login

import com.ragdroid.dahaka.activity.ActivityScope

import dagger.BindsInstance
import dagger.Subcomponent

/**
 * Created by garimajain on 13/08/17.
 */
@ActivityScope
@Subcomponent(modules = arrayOf(LoginModule::class))
interface LoginComponent {


    fun inject(loginActivity: LoginActivity): LoginActivity

    @Subcomponent.Builder
    interface Builder {
        fun build(): LoginComponent

        @BindsInstance
        fun loginActivity(loginActivity: LoginActivity): Builder
    }

}
