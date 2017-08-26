package com.ragdroid.dahaka.user

import com.ragdroid.dahaka.activity.home.HomeComponent
import com.ragdroid.dahaka.activity.home.moves.MovesFragment
import com.ragdroid.dahaka.activity.home.profile.ProfileFragment
import com.ragdroid.dahaka.activity.home.stats.StatsFragment
import com.ragdroid.dahaka.activity.items.ItemsComponent
import com.ragdroid.dahaka.api.entity.Pokemon
import com.ragdroid.dahaka.app.AppComponent

import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent

/**
 * Created by garimajain on 13/08/17.
 */
@Component(dependencies = arrayOf(AppComponent::class), modules = arrayOf(UserModule::class))
@UserScope
interface UserComponent {

    fun homeComponentBuilder(): HomeComponent.Builder
    fun itemsComponentBuilder(): ItemsComponent.Builder


    @Component.Builder
    interface Builder {

        fun appComponent(appComponent: AppComponent): Builder
        @BindsInstance
        fun pokeMon(pokemon: Pokemon): Builder

        fun build(): UserComponent

    }

}
