package com.taringarovers.android.ui.home;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class HomeJson {

    @SerializedName("home")
    List<ListItemModel>  listItemModels;

    public List<ListItemModel> getListItemModels() {
        return listItemModels;
    }
}
