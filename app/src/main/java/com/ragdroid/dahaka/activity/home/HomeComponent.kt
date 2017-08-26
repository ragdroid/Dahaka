package com.ragdroid.dahaka.activity.home

import com.ragdroid.dahaka.activity.home.moves.MovesFragment
import com.ragdroid.dahaka.activity.home.profile.ProfileFragment
import com.ragdroid.dahaka.activity.home.stats.StatsFragment

import dagger.BindsInstance
import dagger.Subcomponent

/**
 * Created by garimajain on 17/08/17.
 */
@Subcomponent(modules = arrayOf(HomeModule::class))
interface HomeComponent {

    fun inject(profileFragment: ProfileFragment)

    fun inject(movesFragment: MovesFragment)

    fun inject(statsFragment: StatsFragment)

    fun inject(homeActivity: HomeActivity)

    @Subcomponent.Builder
    interface Builder {

        @BindsInstance
        fun activity(homeActivity: HomeActivity): HomeComponent.Builder

        fun build(): HomeComponent

    }
}
