package com.ragdroid.dahaka.app


import com.ragdroid.dahaka.DahakaApplication
import com.ragdroid.dahaka.api.entity.Pokemon
import com.ragdroid.dahaka.user.DaggerUserComponent
import com.ragdroid.dahaka.user.PokemonService
import com.ragdroid.dahaka.user.UserComponent

import javax.inject.Inject
import javax.inject.Singleton

import io.reactivex.Flowable
import io.reactivex.Maybe
import io.reactivex.functions.Consumer

/**
 * Created by garimajain on 13/08/17.
 */
@Singleton
class UserManager @Inject
constructor(private val service: PokemonService) {

    private var pokemonCache: Pokemon? = null

    var userComponent: UserComponent? = null
        private set

    fun loginWithUserName(userName: String): Flowable<Pokemon> {
        return pokemonMaybeFromCache
                .concatWith(service.getPokemon(userName).toMaybe())
                .take(1)
                .doOnNext { pokemon -> createUserSession(pokemon) }
    }

    private fun createUserSession(pokemon: Pokemon) {
        userComponent = DaggerUserComponent.builder()
                .appComponent(DahakaApplication.app.appComponent)
                .pokeMon(pokemon)
                .build()
    }


    private val pokemonMaybeFromCache: Maybe<Pokemon>
        get() = if (pokemonCache != null) {
            Maybe.just(pokemonCache!!)
        } else {
            Maybe.empty()
        }

    val isLoggedIn: Boolean
        get() = userComponent != null

    fun logOut() {
        pokemonCache = null
        userComponent = null
    }


}
