package com.ragdroid.dahaka.activity.home.profile;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ragdroid.dahaka.R;
import com.ragdroid.dahaka.activity.home.HomeActivity;
import com.ragdroid.dahaka.databinding.FragmentProfileBinding;
import com.ragdroid.dahaka.mvp.BaseFragment;

import javax.inject.Inject;

/**
 * Created by garimajain on 16/08/17.
 */

public class ProfileFragment extends BaseFragment<ProfileContract.Presenter> implements ProfileContract.View {

    @Inject
    public ProfileFragment() {
        // Required empty public constructor for Injection
    }

    private FragmentProfileBinding dataBinding;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        dataBinding = DataBindingUtil.bind(view);
        return view;
    }

    @Override
    public void showModel(ProfileModel model) {
        dataBinding.setModel(model);
    }
}
