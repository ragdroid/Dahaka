package com.ragdroid.dahaka.activity

import com.ragdroid.dahaka.activity.home.moves.MovesFragment
import com.ragdroid.dahaka.activity.home.profile.ProfileFragment
import com.ragdroid.dahaka.activity.home.stats.StatsFragment

/**
 * Created by garimajain on 19/08/17.
 */

interface FragmentInjector {
    fun inject(profileFragment: ProfileFragment)

    fun inject(movesFragment: MovesFragment)

    fun inject(statsFragment: StatsFragment)
}
