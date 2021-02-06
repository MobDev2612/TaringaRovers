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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.taringarovers.android.BaseViewModel;
import com.taringarovers.android.R;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class HomeFragment extends Fragment {

    private BaseViewModel homeViewModel;

    RecyclerView homeRecyclerView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(getActivity()).get(BaseViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        homeRecyclerView = root.findViewById(R.id.home_list);
        homeViewModel.setTitle(null);
        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //contacts = Contact.createContactsList(20);
        Gson gson = new Gson();
        JsonReader reader = null;
        try {
            InputStream is = getActivity().getAssets().open("home.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            String json = new String(buffer, StandardCharsets.UTF_8);
            HomeJson data = gson.fromJson(json, HomeJson.class);

            HomeAdapter adapter = new HomeAdapter(data.getListItemModels());
            homeRecyclerView.setAdapter(adapter);
            homeRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}