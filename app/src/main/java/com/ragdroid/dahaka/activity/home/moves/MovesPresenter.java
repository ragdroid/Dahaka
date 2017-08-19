package com.ragdroid.dahaka.activity.home.moves;

import com.ragdroid.dahaka.api.entity.Pokemon;
import com.ragdroid.dahaka.mvp.BasePresenterImpl;

import javax.inject.Inject;

/**
 * Created by garimajain on 17/08/17.
 */

public class MovesPresenter extends BasePresenterImpl<MovesContract.View> implements MovesContract.Presenter {

    private final Pokemon pokemon;

    @Inject
    public MovesPresenter(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    @Override
    public void onViewAdded(MovesContract.View view) {
        super.onViewAdded(view);
        MovesModel model = new MovesModel(pokemon.getMoves());
        getView().showModel(model);
    }
}
