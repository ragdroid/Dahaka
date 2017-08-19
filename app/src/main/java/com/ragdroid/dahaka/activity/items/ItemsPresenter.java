package com.ragdroid.dahaka.activity.items;

import com.ragdroid.dahaka.api.entity.Pokemon;
import com.ragdroid.dahaka.mvp.BasePresenterImpl;

import java.util.ArrayList;

import javax.inject.Inject;

/**
 * Created by garimajain on 19/08/17.
 */

public class ItemsPresenter extends BasePresenterImpl<ItemsContract.View> implements ItemsContract.Presenter  {

    private final Pokemon pokemon;

    @Inject
    public ItemsPresenter(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    @Override
    public void onViewAdded(ItemsContract.View view) {
        super.onViewAdded(view);
        ItemsModel model = new ItemsModel();
        model.items = new ArrayList<>();
        for (Pokemon.HeldItem item : pokemon.getHeldItems()) {
            model.items.add("Item : " + item.getItem().getName() + "\n");
        }
        if (model.items.size() == 0) {
            model.items.add("No Held Items :(");
        }

        getView().showModel(model);
    }
}
