package com.ragdroid.dahaka.activity.home

import com.ragdroid.dahaka.activity.home.moves.MovesContract
import com.ragdroid.dahaka.activity.home.moves.MovesPresenter
import com.ragdroid.dahaka.activity.home.profile.ProfileContract
import com.ragdroid.dahaka.activity.home.profile.ProfilePresenter
import com.ragdroid.dahaka.activity.home.stats.StatsContract
import com.ragdroid.dahaka.activity.home.stats.StatsPresenter

import dagger.Binds
import dagger.Module

/**
 * Created by garimajain on 17/08/17.
 */
@Module
abstract class HomeModule {

    @Binds
    abstract fun provideHomePresenter(presenter: HomePresenter): HomeContract.Presenter

    @Binds
    abstract fun provideProfilePresenter(presenter: ProfilePresenter): ProfileContract.Presenter

    @Binds
    abstract fun provideStatsPresenter(presenter: StatsPresenter): StatsContract.Presenter

    @Binds
    abstract fun provideMovesPresenter(presenter: MovesPresenter): MovesContract.Presenter

}
