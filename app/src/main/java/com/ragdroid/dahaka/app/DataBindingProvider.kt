package com.ragdroid.dahaka.app

import com.ragdroid.dahaka.util.BindingAdapter
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by garimajain on 26/08/17.
 */
@Singleton
class DataBindingProvider @Inject
constructor(private val bindingAdapter: BindingAdapter) : android.databinding.DataBindingComponent {
    override fun getCompanion(): BindingAdapter.Companion {
        return BindingAdapter.Companion
    }

    override fun getBindingAdapter(): BindingAdapter = bindingAdapter
}