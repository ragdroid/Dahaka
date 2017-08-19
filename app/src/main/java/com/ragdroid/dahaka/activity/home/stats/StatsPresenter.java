package com.ragdroid.dahaka.activity.home.stats;

import com.ragdroid.dahaka.api.entity.Pokemon;
import com.ragdroid.dahaka.app.UserManager;
import com.ragdroid.dahaka.mvp.BasePresenterImpl;

import javax.inject.Inject;

/**
 * Created by garimajain on 17/08/17.
 */

public class StatsPresenter extends BasePresenterImpl<StatsContract.View> implements StatsContract.Presenter {

    private final Pokemon pokemon;

    @Inject
    public StatsPresenter(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    @Override
    public void onViewAdded(StatsContract.View view) {
        super.onViewAdded(view);
        StatsModel model = new StatsModel(pokemon.getStats());
        getView().showModel(model);
    }
}
