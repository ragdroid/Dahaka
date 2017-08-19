package com.ragdroid.dahaka.user;

import com.ragdroid.dahaka.activity.home.HomeComponent;
import com.ragdroid.dahaka.activity.home.moves.MovesFragment;
import com.ragdroid.dahaka.activity.home.profile.ProfileFragment;
import com.ragdroid.dahaka.activity.home.stats.StatsFragment;
import com.ragdroid.dahaka.activity.items.ItemsComponent;
import com.ragdroid.dahaka.api.entity.Pokemon;

import dagger.BindsInstance;
import dagger.Subcomponent;

/**
 * Created by garimajain on 13/08/17.
 */
@Subcomponent(modules = UserModule.class)
public interface UserComponent {

    HomeComponent.Builder homeComponentBuilder();
    ItemsComponent.Builder itemsComponentBuilder();


    @Subcomponent.Builder
    interface Builder {

        @BindsInstance
        Builder pokeMon(Pokemon pokemon);
        UserComponent build();

    }

}
