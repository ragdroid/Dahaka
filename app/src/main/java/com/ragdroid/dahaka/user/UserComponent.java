package com.ragdroid.dahaka.user;

import com.ragdroid.dahaka.api.entity.Pokemon;

import dagger.BindsInstance;
import dagger.Subcomponent;

/**
 * Created by garimajain on 13/08/17.
 */
@Subcomponent(modules = UserModule.class)
public interface UserComponent {

    @Subcomponent.Builder
    interface Builder {

        @BindsInstance
        Builder pokeMon(Pokemon pokemon);
        UserComponent build();

    }

}
