package com.ragdroid.dahaka.dagger;

import com.ragdroid.dahaka.user.PokemonService;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

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
