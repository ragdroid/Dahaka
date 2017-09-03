package com.ragdroid.dahaka.activity.login;

import com.ragdroid.dahaka.api.entity.Pokemon;

/**
 * Created by garimajain on 31/08/17.
 */

public class TestDataFactory {

    public static Pokemon getDummyPokemon() {
        Pokemon pokemon = new Pokemon();
        Pokemon.Sprites sprites = new Pokemon.Sprites();
        sprites.setFrontDefault("");
        pokemon.setSprites(sprites);
        return pokemon;
    }

}
