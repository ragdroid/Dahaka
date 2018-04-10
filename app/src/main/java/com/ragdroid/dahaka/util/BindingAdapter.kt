package com.ragdroid.dahaka.util

import android.content.Context
import android.databinding.BindingConversion
import android.graphics.drawable.Drawable
import android.view.View
import android.widget.ImageView
import android.widget.TextView

import com.bumptech.glide.RequestBuilder
import com.bumptech.glide.RequestManager
import com.bumptech.glide.request.RequestOptions

import javax.inject.Inject

import dagger.Reusable
import jp.wasabeef.glide.transformations.BlurTransformation

/**
 * Created by garimajain on 16/08/17.
 */
@Reusable
class BindingAdapter @Inject
constructor(private val requestManager: RequestManager) {

    /**
     * Reference : https://medium.com/fueled-android/data-binding-adapter-write-bind-repeat-50e9c64fe806
     * Bind Glide with an ImageView.
     *
     * @param view        the ImageView to bind to Glide.
     * @param src         The URL of the image to load.
     * @param placeholder The placeholder icon.
     * @param error       The error icon.
     * @param blurValue   The blur radius value between 1 and 25.
     * @param cropCircle  Crop the image in a circle of not.
     */
    @android.databinding.BindingAdapter(value = *arrayOf("src", "placeholder", "error", "blur", "cropCircle"), requireAll = false)
    fun setImageUrl(view: ImageView, src: String, placeholder: Drawable?, error: Drawable?,
                    blurValue: Int, cropCircle: Boolean) {

        val ctx = view.context
        val options = RequestOptions()

        val glideBuilder = requestManager.load(src)


        if (placeholder != null) {
            options.placeholder(placeholder)
        }

        if (error != null) {
            options.error(error)
        }

        if (blurValue > 0) {
            options.transform(BlurTransformation(ctx, blurValue))
        }

        if (cropCircle) {
            options.circleCrop()
        }

        glideBuilder
                .apply(options)
                .into(view)
    }

    @android.databinding.BindingAdapter(value = *arrayOf("formatString", "variable"))
    fun formatString(textView: TextView, stringFormat: String, variable: String) {
        textView.text = String.format(stringFormat, variable)
    }

    @android.databinding.BindingAdapter(value = *arrayOf("formatInt", "variable"))
    fun formatInt(textView: TextView, stringFormat: String, variable: Int) {
        textView.text = String.format(stringFormat, variable)
    }



}

@BindingConversion
internal fun convertBooleanToVisibility(visible: Boolean): Int {
    return if (visible) View.VISIBLE else View.GONE
}
