package com.ragdroid.dahaka.activity.home.stats

import android.databinding.BaseObservable
import android.databinding.Bindable

import com.ragdroid.dahaka.BR
import com.ragdroid.dahaka.api.entity.Pokemon

/**
 * Created by garimajain on 16/08/17.
 */

class StatsModel(stats: List<Pokemon.Stat>) : BaseObservable() {

    @get:Bindable
    var stats: String? = null
    set(stats) {
        field = stats
        notifyPropertyChanged(BR.stats)
    }

    init {
        decorateMoves(stats)
    }

    private fun decorateMoves(stats: List<Pokemon.Stat>) {
        val stringBuilder = StringBuilder()
        stringBuilder.append("Stats : \n")
        for (stat in stats) {
            stringBuilder.append(stat.stat?.name + " : " + stat.baseStat)
            stringBuilder.append("\n")
        }
        this.stats = stringBuilder.toString()
    }

}
