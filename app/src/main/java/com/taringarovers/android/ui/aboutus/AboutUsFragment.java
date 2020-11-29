package com.taringarovers.android.ui.aboutus;

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

public class AboutUsFragment extends Fragment {

    private BaseViewModel baseViewModel;

    public static AboutUsFragment newInstance() {
        return new AboutUsFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.about_us_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        baseViewModel = new ViewModelProvider(getActivity()).get(BaseViewModel.class);
        baseViewModel.setTitle(getString(R.string.title_about_us));
    }

}