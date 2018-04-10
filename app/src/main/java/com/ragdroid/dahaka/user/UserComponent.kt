package com.ragdroid.dahaka.user


import com.ragdroid.dahaka.api.entity.Pokemon
import com.ragdroid.dahaka.app.AppComponent
import com.ragdroid.dahaka.app.UserManager

import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.support.AndroidSupportInjectionModule

/**
 * Created by garimajain on 13/08/17.
 */
@UserScope
@Component(dependencies = arrayOf(AppComponent::class), modules = arrayOf(UserBindingModule::class, AndroidSupportInjectionModule::class))
interface UserComponent : AndroidInjector<DaggerApplication> {
    fun inject(userManager: UserManager)


    @Component.Builder
    interface Builder {

        fun appComponent(appComponent: AppComponent): Builder

        fun build(): UserComponent
        @BindsInstance
        fun pokeMon(pokemon: Pokemon): Builder
    }

}
