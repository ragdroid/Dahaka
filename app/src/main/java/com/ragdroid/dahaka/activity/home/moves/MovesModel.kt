package com.ragdroid.dahaka.activity.home.moves

import android.databinding.BaseObservable
import android.databinding.Bindable

import com.ragdroid.dahaka.BR
import com.ragdroid.dahaka.api.entity.Pokemon

/**
 * Created by garimajain on 16/08/17.
 */

class MovesModel(moves: List<Pokemon.Move>) : BaseObservable() {


    @get:Bindable
    var moves: String? = null
    set(moves) {
        field = moves
        notifyPropertyChanged(BR.moves)
    }

    init {
        decorateMoves(moves)
    }

    private fun decorateMoves(moves: List<Pokemon.Move>) {
        val stringBuilder = StringBuilder("Moves : \n")
        for (move in moves) {
            stringBuilder.append(move.move?.name)
            stringBuilder.append("\n")
        }
        this.moves = stringBuilder.toString()
    }


}
