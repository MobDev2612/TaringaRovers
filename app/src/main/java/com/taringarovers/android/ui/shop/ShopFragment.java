package com.taringarovers.android.ui.shop;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;
import com.taringarovers.android.BaseViewModel;
import com.taringarovers.android.R;

public class ShopFragment extends Fragment {

    CarouselView carouselView;
    int[] sampleImages = {R.drawable.shop_1_black_friday, R.drawable.shop_2_winter_collection, R.drawable.shop_3_shoes};

    private BaseViewModel baseViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        baseViewModel = new ViewModelProvider(getActivity()).get(BaseViewModel.class);
        View root = inflater.inflate(R.layout.fragment_shop, container, false);
        carouselView = root.findViewById(R.id.carouselView);
        return root;
    }

    @Override
    public void onResume() {
        super.onResume();
        baseViewModel.setTitle(getString(R.string.title_shop));
        carouselView.setImageListener(imageListener);
        carouselView.setPageCount(sampleImages.length);
    }

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);
        }
    };
}