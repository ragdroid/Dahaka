package com.ragdroid.dahaka.activity.home.stats

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.ragdroid.dahaka.R
import com.ragdroid.dahaka.activity.home.HomeActivity
import com.ragdroid.dahaka.databinding.FragmentProfileBinding
import com.ragdroid.dahaka.databinding.FragmentStatsBinding
import com.ragdroid.dahaka.mvp.BaseFragment
import com.ragdroid.dahaka.user.BaseUserActivity

import javax.inject.Inject

/**
 * Created by garimajain on 16/08/17.
 */

class StatsFragment @Inject
constructor()//required empty public constructor
    : BaseFragment<StatsContract.Presenter, StatsContract.View>(), StatsContract.View {

    override fun getFragmentView(): StatsContract.View {
        return this
    }

    var dataBinding: FragmentStatsBinding? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view = inflater.inflate(R.layout.fragment_stats, container, false)
        dataBinding = DataBindingUtil.bind(view)
        return view
    }

    override fun showModel(statsModel: StatsModel) {
        dataBinding!!.model = statsModel
    }
}
