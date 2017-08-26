package com.ragdroid.dahaka.activity.home.stats

import com.ragdroid.dahaka.api.entity.Pokemon
import com.ragdroid.dahaka.app.UserManager
import com.ragdroid.dahaka.mvp.BasePresenterImpl

import javax.inject.Inject

/**
 * Created by garimajain on 17/08/17.
 */

class StatsPresenter @Inject
constructor(private val pokemon: Pokemon) : BasePresenterImpl<StatsContract.View>(), StatsContract.Presenter {

    override fun onViewAdded(view: StatsContract.View) {
        super.onViewAdded(view)
        val model = StatsModel(pokemon.stats)
        getView().showModel(model)
    }
}
