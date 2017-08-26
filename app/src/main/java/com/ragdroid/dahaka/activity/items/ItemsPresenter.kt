package com.ragdroid.dahaka.activity.items

import com.ragdroid.dahaka.api.entity.Pokemon
import com.ragdroid.dahaka.mvp.BasePresenterImpl

import java.util.ArrayList

import javax.inject.Inject

/**
 * Created by garimajain on 19/08/17.
 */

class ItemsPresenter @Inject
constructor(private val pokemon: Pokemon) : BasePresenterImpl<ItemsContract.View>(), ItemsContract.Presenter {

    override fun onViewAdded(view: ItemsContract.View) {
        super.onViewAdded(view)
        val model = ItemsModel()
        model.setItems(ArrayList<E>())
        for (item in pokemon.heldItems) {
            model.getItems().add("Item : " + item.item.name + "\n")
        }
        if (model.getItems().size() === 0) {
            model.getItems().add("No Held Items :(")
        }

        getView().showModel(model)
    }
}
