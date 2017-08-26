package com.ragdroid.dahaka.activity.home.moves

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.ragdroid.dahaka.R
import com.ragdroid.dahaka.activity.home.HomeActivity
import com.ragdroid.dahaka.databinding.FragmentMovesBinding
import com.ragdroid.dahaka.databinding.FragmentStatsBinding
import com.ragdroid.dahaka.mvp.BaseFragment
import com.ragdroid.dahaka.user.BaseUserActivity

/**
 * Created by garimajain on 16/08/17.
 */

class MovesFragment : BaseFragment<MovesContract.Presenter>(), MovesContract.View {

    private var dataBinding: FragmentMovesBinding? = null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view = inflater!!.inflate(R.layout.fragment_moves, container, false)
        dataBinding = DataBindingUtil.bind(view)
        return view
    }

    override fun initDagger() {
        (activity as HomeActivity).homeComponent.inject(this)
    }

    override fun showModel(statsModel: MovesModel) {
        dataBinding!!.model = statsModel
    }
}
