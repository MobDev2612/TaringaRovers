package com.taringarovers.android.ui.account;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.taringarovers.android.BaseViewModel;
import com.taringarovers.android.R;

public class AccountFragment extends Fragment {

    private BaseViewModel baseViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        baseViewModel =
                new ViewModelProvider(getActivity()).get(BaseViewModel.class);
        View root = inflater.inflate(R.layout.fragment_account, container, false);
        baseViewModel.setTitle(getString(R.string.title_my_account));
        return root;
    }
}