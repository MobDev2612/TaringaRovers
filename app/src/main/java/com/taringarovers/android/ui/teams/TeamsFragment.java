package com.taringarovers.android.ui.teams;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.taringarovers.android.BaseViewModel;
import com.taringarovers.android.R;

public class TeamsFragment extends Fragment {

    private BaseViewModel mViewModel;

    public static TeamsFragment newInstance() {
        return new TeamsFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_teams, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(getActivity()).get(BaseViewModel.class);
        mViewModel.setTitle(getString(R.string.title_teams));
    }

}