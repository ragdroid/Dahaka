package com.ragdroid.dahaka.activity.home;

import com.ragdroid.dahaka.activity.home.moves.MovesFragment;
import com.ragdroid.dahaka.activity.home.profile.ProfileFragment;
import com.ragdroid.dahaka.activity.home.stats.StatsFragment;

import dagger.BindsInstance;
import dagger.Subcomponent;

/**
 * Created by garimajain on 17/08/17.
 */
@Subcomponent(modules = HomeModule.class)
public interface HomeComponent {

    void inject(ProfileFragment profileFragment);

    void inject(MovesFragment movesFragment);

    void inject(StatsFragment statsFragment);

    void inject(HomeActivity homeActivity);

    @Subcomponent.Builder
    interface Builder {

        @BindsInstance
        HomeComponent.Builder activity(HomeActivity homeActivity);
        HomeComponent build();

    }
}
