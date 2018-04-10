package com.ragdroid.dahaka.activity.home.profile

import com.ragdroid.dahaka.api.entity.Pokemon
import com.ragdroid.dahaka.app.UserManager
import com.ragdroid.dahaka.mvp.BasePresenterImpl

import java.net.MalformedURLException
import java.net.URL

import javax.inject.Inject

/**
 * Created by garimajain on 17/08/17.
 */

class ProfilePresenter @Inject
constructor(private val pokemon: Pokemon) : BasePresenterImpl<ProfileContract.View>(), ProfileContract.Presenter {

    override fun onViewAdded(view: ProfileContract.View) {
        super.onViewAdded(view)
        var url: URL? = null
        try {
            url = URL(pokemon.sprites?.frontDefault)
        } catch (e: MalformedURLException) {
            e.printStackTrace()
        }

        val model = ProfileModel(
                if (url != null) url.toString() else "",
                pokemon.name,
                pokemon.weight ?: 0,
                pokemon.height ?: 0,
                pokemon.baseExperience ?: 0)

        view.showModel(model)

    }
}
