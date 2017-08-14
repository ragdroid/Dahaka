package com.ragdroid.dahaka.mvp;

/**
 * Created by garimajain on 13/08/17.
 */

public interface BasePresenter<T extends BaseView> {

    void onViewAdded(T view);

    void onViewRemoved();

}
