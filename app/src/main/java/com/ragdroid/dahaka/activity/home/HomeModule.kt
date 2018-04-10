package com.ragdroid.dahaka.activity.home

import com.ragdroid.dahaka.activity.home.moves.MovesContract
import com.ragdroid.dahaka.activity.home.moves.MovesFragment
import com.ragdroid.dahaka.activity.home.moves.MovesPresenter
import com.ragdroid.dahaka.activity.home.profile.ProfileContract
import com.ragdroid.dahaka.activity.home.profile.ProfileFragment
import com.ragdroid.dahaka.activity.home.profile.ProfilePresenter
import com.ragdroid.dahaka.activity.home.stats.StatsContract
import com.ragdroid.dahaka.activity.home.stats.StatsFragment
import com.ragdroid.dahaka.activity.home.stats.StatsPresenter

import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by garimajain on 17/08/17.
 */
@Module
abstract class HomeModule {

    @ContributesAndroidInjector
    internal abstract fun profileFragment(): ProfileFragment

    @ContributesAndroidInjector
    internal abstract fun movesFragment(): MovesFragment

    @ContributesAndroidInjector
    internal abstract fun statisticsFragment(): StatsFragment


    @Binds
    abstract fun provideHomePresenter(presenter: HomePresenter): HomeContract.Presenter

    @Binds
    abstract fun provideProfilePresenter(presenter: ProfilePresenter): ProfileContract.Presenter

    @Binds
    abstract fun provideStatsPresenter(presenter: StatsPresenter): StatsContract.Presenter

    @Binds
    abstract fun provideMovesPresenter(presenter: MovesPresenter): MovesContract.Presenter

}
