package com.ragdroid.dahaka.activity.home.stats;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.ragdroid.dahaka.BR;
import com.ragdroid.dahaka.api.entity.Pokemon;

import java.util.List;

/**
 * Created by garimajain on 16/08/17.
 */

public class StatsModel extends BaseObservable {

    @Bindable
    public String getStats() {
        return stats;
    }

    public void setStats(String stats) {
        this.stats = stats;
        notifyPropertyChanged(BR.stats);
    }

    public String stats;

    public StatsModel(List<Pokemon.Stat> stats) {
        decorateMoves(stats);
    }

    private void decorateMoves(List<Pokemon.Stat> stats) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Stats : \n");
        for (Pokemon.Stat stat : stats) {
            stringBuilder.append(stat.getStat().getName() + " : " + stat.getBaseStat());
            stringBuilder.append("\n");
        }
        this.stats = stringBuilder.toString();
    }

}
