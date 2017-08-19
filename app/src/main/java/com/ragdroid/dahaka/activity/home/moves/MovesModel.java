package com.ragdroid.dahaka.activity.home.moves;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.ragdroid.dahaka.BR;
import com.ragdroid.dahaka.api.entity.Pokemon;

import java.util.List;

/**
 * Created by garimajain on 16/08/17.
 */

public class MovesModel extends BaseObservable {

    @Bindable
    public String getMoves() {
        return moves;
    }

    public void setMoves(String moves) {
        this.moves = moves;
        notifyPropertyChanged(BR.moves);
    }

    public String moves;

    public MovesModel(List<Pokemon.Move> moves) {
        decorateMoves(moves);
    }

    private void decorateMoves(List<Pokemon.Move> moves) {
        StringBuilder stringBuilder = new StringBuilder("Moves : \n");
        for (Pokemon.Move move : moves) {
            stringBuilder.append(move.getMove().getName());
            stringBuilder.append("\n");
        }
        this.moves = stringBuilder.toString();
    }


}
