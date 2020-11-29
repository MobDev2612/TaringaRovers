package com.taringarovers.android.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.taringarovers.android.BaseViewModel;
import com.taringarovers.android.R;

public class HomeFragment extends Fragment {

    private BaseViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(getActivity()).get(BaseViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        homeViewModel.setTitle(null);
        return root;
    }
}