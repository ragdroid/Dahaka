package com.ragdroid.dahaka.activity.home;

import com.ragdroid.dahaka.activity.home.moves.MovesContract;
import com.ragdroid.dahaka.activity.home.moves.MovesPresenter;
import com.ragdroid.dahaka.activity.home.profile.ProfileContract;
import com.ragdroid.dahaka.activity.home.profile.ProfilePresenter;
import com.ragdroid.dahaka.activity.home.stats.StatsContract;
import com.ragdroid.dahaka.activity.home.stats.StatsPresenter;

import dagger.Binds;
import dagger.Module;

/**
 * Created by garimajain on 17/08/17.
 */
@Module
public abstract class HomeModule {

    @Binds
    public abstract HomeContract.Presenter provideHomePresenter(HomePresenter presenter);

    @Binds
    public abstract ProfileContract.Presenter provideProfilePresenter(ProfilePresenter presenter);

    @Binds
    public abstract StatsContract.Presenter provideStatsPresenter(StatsPresenter presenter);

    @Binds
    public abstract MovesContract.Presenter provideMovesPresenter(MovesPresenter presenter);

}
