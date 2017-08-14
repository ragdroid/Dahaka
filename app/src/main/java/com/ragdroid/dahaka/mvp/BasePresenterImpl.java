package com.ragdroid.dahaka.mvp;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by garimajain on 13/08/17.
 */

public class BasePresenterImpl<T extends BaseView> implements BasePresenter<T> {

    protected CompositeDisposable compositeDisposable = new CompositeDisposable();

    public T getView() {
        return view;
    }

    private T view;

    @Override
    public void onViewAdded(T view) {
        this.view = view;
    }

    @Override
    public void onViewRemoved() {
        compositeDisposable.clear();
    }
}
