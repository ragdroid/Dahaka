package com.ragdroid.dahaka.app

import android.app.Activity

import com.ragdroid.dahaka.DahakaApplication
import com.ragdroid.dahaka.api.entity.Pokemon
import com.ragdroid.dahaka.user.DaggerUserComponent
import com.ragdroid.dahaka.user.PokemonService
import com.ragdroid.dahaka.user.UserComponent

import javax.inject.Inject
import javax.inject.Singleton

import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import io.reactivex.Flowable
import io.reactivex.Maybe

/**
 * Created by garimajain on 13/08/17.
 */
@Singleton
class UserManager @Inject
constructor(private val service: PokemonService) : HasActivityInjector {
    @Inject internal lateinit var activityInjector: DispatchingAndroidInjector<Activity>

    private var pokemonCache: Pokemon? = null

    private var userComponent: UserComponent? = null

    fun loginWithUserName(userName: String): Flowable<Pokemon> {
        return pokemonMaybeFromCache
                .concatWith(service.getPokemon(userName).toMaybe())
                .take(1)
                .doOnNext({this.createUserSession(it)})
    }

    private fun createUserSession(pokemon: Pokemon) {
        userComponent = DaggerUserComponent.builder()
                .appComponent(DahakaApplication.app.appComponent)
                .pokeMon(pokemon)
                .build()
        userComponent?.inject(this)
    }


    private val pokemonMaybeFromCache: Maybe<Pokemon>
        get() {
            if (pokemonCache != null) {
                return Maybe.just(pokemonCache!!)
            } else {
                return Maybe.empty<Pokemon>()
            }
        }

    val isLoggedIn: Boolean
        get() = userComponent != null

    fun logOut() {
        pokemonCache = null
        userComponent = null
    }

    override fun activityInjector(): AndroidInjector<Activity> {
        return activityInjector
    }
}
