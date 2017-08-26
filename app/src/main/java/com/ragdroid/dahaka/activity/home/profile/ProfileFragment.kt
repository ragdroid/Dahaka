package com.ragdroid.dahaka.activity.home.profile

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.ragdroid.dahaka.R
import com.ragdroid.dahaka.activity.home.HomeActivity
import com.ragdroid.dahaka.databinding.FragmentProfileBinding
import com.ragdroid.dahaka.mvp.BaseFragment

/**
 * Created by garimajain on 16/08/17.
 */

class ProfileFragment : BaseFragment<ProfileContract.Presenter>(), ProfileContract.View {

    private var dataBinding: FragmentProfileBinding? = null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view = inflater!!.inflate(R.layout.fragment_profile, container, false)
        dataBinding = DataBindingUtil.bind(view)
        return view
    }

    override fun initDagger() {
        (activity as HomeActivity).homeComponent.inject(this)
    }

    override fun showModel(model: ProfileModel) {
        dataBinding!!.model = model
    }
}
