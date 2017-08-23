package com.ragdroid.dahaka.user;

import com.ragdroid.dahaka.activity.home.HomeComponent;
import com.ragdroid.dahaka.activity.home.moves.MovesFragment;
import com.ragdroid.dahaka.activity.home.profile.ProfileFragment;
import com.ragdroid.dahaka.activity.home.stats.StatsFragment;
import com.ragdroid.dahaka.activity.items.ItemsComponent;
import com.ragdroid.dahaka.api.entity.Pokemon;
import com.ragdroid.dahaka.app.AppComponent;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;

/**
 * Created by garimajain on 13/08/17.
 */
@Component(dependencies = {AppComponent.class}, modules = UserModule.class)
@UserScope
public interface UserComponent {

    HomeComponent.Builder homeComponentBuilder();
    ItemsComponent.Builder itemsComponentBuilder();


    @Component.Builder
    interface Builder {

        Builder appComponent(AppComponent appComponent);
        @BindsInstance
        Builder pokeMon(Pokemon pokemon);
        UserComponent build();

    }

}
