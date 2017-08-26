package com.ragdroid.dahaka.mvp

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.widget.Toast

import com.ragdroid.dahaka.R
import com.ragdroid.dahaka.activity.login.LoginActivity

import javax.inject.Inject

/**
 * Created by garimajain on 13/08/17.
 */

abstract class BaseFragment<T : BasePresenter<*>> : Fragment(), BaseView {

    @Inject
    var presenter: T? = null
        internal set


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initDagger()
        presenter!!.onViewAdded(this)
    }

    override fun showMessage(message: String) {
        Toast.makeText(activity, message, Toast.LENGTH_SHORT).show()
    }

    override fun onDetach() {
        presenter!!.onViewRemoved()
        super.onDetach()
    }

    override fun finishView() {
        showMessage(getString(R.string.session_expired))
        startActivity(Intent(activity, LoginActivity::class.java))
        activity.finish()
    }

    protected abstract fun initDagger()
}
