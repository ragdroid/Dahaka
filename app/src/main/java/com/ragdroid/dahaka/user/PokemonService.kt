package com.ragdroid.dahaka.user

import com.ragdroid.dahaka.api.entity.Pokemon

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path

/**
 * Created by garimajain on 05/03/17.
 */
@UserScope
interface PokemonService {

    /**
     * fetch pokemon user
     * @param id
     * @return
     */
    @Headers("Content-Type: application/json")
    @GET("pokemon/{name}")
    fun getPokemon(@Path("name") id: String): Single<Pokemon>

}
