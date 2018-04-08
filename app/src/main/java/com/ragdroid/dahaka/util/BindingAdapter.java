package com.ragdroid.dahaka.util;

import android.databinding.BindingConversion;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.RequestOptions;

import javax.inject.Inject;

import dagger.Reusable;
import jp.wasabeef.glide.transformations.BlurTransformation;

/**
 * Created by garimajain on 16/08/17.
 */
@Reusable
public class BindingAdapter {

    private final RequestManager requestManager;

    @Inject
    public BindingAdapter(RequestManager requestManager) {
        this.requestManager = requestManager;
    }

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
    @SuppressWarnings("unchecked")
    @android.databinding.BindingAdapter(value = {"src", "placeholder", "error", "blur", "cropCircle"},
            requireAll = false)
    public void setImageUrl(ImageView view, String src, Drawable placeholder, Drawable error,
                            int blurValue, boolean cropCircle) {

        RequestOptions options = new RequestOptions();

        RequestBuilder<Drawable> glideBuilder = requestManager.load(src);


        if (placeholder != null) {
            options.placeholder(placeholder);
        }

        if (error != null) {
            options.error(error);
        }

        if (blurValue > 0) {
            options.transform(new BlurTransformation(blurValue));
        }

        if (cropCircle) {
            options.circleCrop();
        }

        glideBuilder
                .apply(options)
                .into(view);
    }

    @android.databinding.BindingAdapter(value = {"formatString", "variable"})
    public void formatString(TextView textView, String stringFormat, String variable) {
        textView.setText(String.format(stringFormat, variable));
    }

    @android.databinding.BindingAdapter(value = {"formatInt", "variable"})
    public void formatInt(TextView textView, String stringFormat, int variable) {
        textView.setText(String.format(stringFormat, variable));
    }

    @BindingConversion
    public static int convertBooleanToVisibility(boolean visible) {
        return visible ? View.VISIBLE : View.GONE;
    }

}
