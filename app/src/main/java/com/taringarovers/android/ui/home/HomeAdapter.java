package com.taringarovers.android.ui.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.taringarovers.android.R;

import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.HomeViewHolder> {

    List<ListItemModel> homeItems;

    public HomeAdapter(List<ListItemModel> homeItems) {
        this.homeItems = homeItems;
    }

    @NonNull
    @Override
    public HomeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        // Inflate the custom layout
        View contactView = inflater.inflate(R.layout.home_list_item, parent, false);
        // Return a new holder instance
        return new HomeViewHolder(contactView);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeViewHolder holder, int position) {
        holder.title.setText(homeItems.get(position).getName());
        holder.description.setText(homeItems.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return homeItems.size();
    }

    public class HomeViewHolder extends RecyclerView.ViewHolder {

        TextView title;

        TextView description;

        public HomeViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.list_item_title);
            description = itemView.findViewById(R.id.list_item_desc);
        }
    }
}
