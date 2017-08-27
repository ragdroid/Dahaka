package com.ragdroid.dahaka.mvp

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

import com.ragdroid.dahaka.activity.login.LoginActivity

import javax.inject.Inject

import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector

/**
 * Created by garimajain on 13/08/17.
 */

abstract class BaseActivity<T : BasePresenter<V>, V : BaseView> : AppCompatActivity(), HasSupportFragmentInjector {

    @Inject internal lateinit var injector: DispatchingAndroidInjector<Fragment>

    @Inject
    lateinit var presenter: T
        internal set

    override fun onCreate(savedInstanceState: Bundle?) {
        androidInject()
        super.onCreate(savedInstanceState)
        presenter.onViewAdded(getView())
    }

    abstract fun getView(): V

    protected open fun androidInject() {
        AndroidInjection.inject(this)
    }

    fun showMessage(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        presenter.onViewRemoved()
        super.onDestroy()
    }

    fun finishView() {
        startActivity(Intent(this, LoginActivity::class.java))
        finish()
    }

    override fun supportFragmentInjector(): AndroidInjector<Fragment> {
        return injector
    }

}
