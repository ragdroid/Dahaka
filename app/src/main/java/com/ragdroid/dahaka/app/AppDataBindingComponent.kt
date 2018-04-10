package com.ragdroid.dahaka.app

import com.ragdroid.dahaka.util.BindingAdapter
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by garimajain on 10/04/18.
 */
@Singleton
class AppDataBindingComponent @Inject
constructor(private val bindingAdapter: BindingAdapter) : android.databinding.DataBindingComponent {
    override fun getBindingAdapter(): BindingAdapter {
        return bindingAdapter
    }
}