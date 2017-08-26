package com.ragdroid.dahaka.mvp

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

import com.ragdroid.dahaka.DahakaApplication
import com.ragdroid.dahaka.activity.login.LoginActivity
import com.ragdroid.dahaka.app.AppComponent

import javax.inject.Inject

/**
 * Created by garimajain on 13/08/17.
 */

abstract class BaseActivity<T : BasePresenter<*>> : AppCompatActivity(), BaseView {

    @Inject
    var presenter: T? = null
        internal set

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initDagger((application as DahakaApplication).appComponent)
        presenter!!.onViewAdded(this)
    }

    override fun showMessage(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        presenter!!.onViewRemoved()
        super.onDestroy()
    }

    override fun finishView() {
        startActivity(Intent(this, LoginActivity::class.java))
        finish()
    }

    protected abstract fun initDagger(appComponent: AppComponent)
}
