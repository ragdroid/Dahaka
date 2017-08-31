package com.ragdroid.dahaka.api;

import com.ragdroid.dahaka.user.PokemonService;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by garimajain on 28/08/17.
 */
@Module
public class MockApiModule {

    @Mock PokemonService pokemonService;

    public MockApiModule() {
        MockitoAnnotations.initMocks(this);
    }

    @Provides
    @Singleton
    public PokemonService providePokemonService() {
        return pokemonService;
    }


}
