package com.ragdroid.dahaka.activity.home.moves

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.ragdroid.dahaka.R
import com.ragdroid.dahaka.databinding.FragmentMovesBinding
import com.ragdroid.dahaka.mvp.BaseFragment

import javax.inject.Inject

/**
 * Created by garimajain on 16/08/17.
 */

class MovesFragment @Inject
constructor()//required empty public constructor for Injection
    : BaseFragment<MovesContract.Presenter, MovesContract.View>(), MovesContract.View {

    override fun getFragmentView(): MovesContract.View {
        return this
    }

    lateinit var dataBinding: FragmentMovesBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view = inflater.inflate(R.layout.fragment_moves, container, false)
        dataBinding = DataBindingUtil.bind<FragmentMovesBinding>(view)!!
        return view
    }

    override fun showModel(statsModel: MovesModel) {
        dataBinding.model = statsModel
    }
}
