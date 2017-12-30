package com.ragdroid.dahaka.api;

import com.ragdroid.dahaka.user.PokemonService;

import org.mockito.Mockito;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by garimajain on 28/08/17.
 */
@Module
public class MockApiModule {

    @Provides
    @Singleton
    static PokemonService providePokemonService() {
        return Mockito.mock(PokemonService.class);
    }


}
