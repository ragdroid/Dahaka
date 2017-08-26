package com.ragdroid.dahaka.activity.home.moves

import com.ragdroid.dahaka.api.entity.Pokemon
import com.ragdroid.dahaka.mvp.BasePresenterImpl

import javax.inject.Inject

/**
 * Created by garimajain on 17/08/17.
 */

class MovesPresenter @Inject
constructor(private val pokemon: Pokemon) : BasePresenterImpl<MovesContract.View>(), MovesContract.Presenter {

    override fun onViewAdded(view: MovesContract.View) {
        super.onViewAdded(view)
        val model = pokemon.moves?.let { MovesModel(it) }
        model?.let { view.showModel(it) }
    }
}
