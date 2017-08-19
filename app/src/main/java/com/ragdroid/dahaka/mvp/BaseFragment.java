package com.ragdroid.dahaka.mvp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.widget.Toast;

import com.ragdroid.dahaka.R;
import com.ragdroid.dahaka.activity.login.LoginActivity;

import javax.inject.Inject;

/**
 * Created by garimajain on 13/08/17.
 */

public abstract class BaseFragment<T extends BasePresenter> extends Fragment implements BaseView {

    public T getPresenter() {
        return presenter;
    }

    @Inject
    T presenter;


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initDagger();
        presenter.onViewAdded(this);
    }

    @Override
    public void showMessage(String message) {
        Toast.makeText(getActivity(), message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDetach() {
        presenter.onViewRemoved();
        super.onDetach();
    }

    @Override
    public void finishView() {
        showMessage(getString(R.string.session_expired));
        startActivity(new Intent(getActivity(), LoginActivity.class));
        getActivity().finish();
    }

    protected abstract void initDagger();
}
