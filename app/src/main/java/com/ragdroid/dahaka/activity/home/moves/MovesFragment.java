package com.ragdroid.dahaka.activity.home.moves;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ragdroid.dahaka.R;
import com.ragdroid.dahaka.activity.home.HomeActivity;
import com.ragdroid.dahaka.databinding.FragmentMovesBinding;
import com.ragdroid.dahaka.databinding.FragmentStatsBinding;
import com.ragdroid.dahaka.mvp.BaseFragment;
import com.ragdroid.dahaka.user.BaseUserActivity;

import javax.inject.Inject;

/**
 * Created by garimajain on 16/08/17.
 */

public class MovesFragment extends BaseFragment<MovesContract.Presenter> implements MovesContract.View {

    private FragmentMovesBinding dataBinding;

    @Inject
    public MovesFragment() {
        //required empty public constructor for Injection
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_moves, container, false);
        dataBinding = DataBindingUtil.bind(view);
        return view;
    }

    @Override
    public void showModel(MovesModel statsModel) {
        dataBinding.setModel(statsModel);
    }
}
