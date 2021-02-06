package com.taringarovers.android.ui.home;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class ListItemModel {
    @SerializedName("title")
    private String name;
    @SerializedName("description")
    private String description;

    public ListItemModel(String name, String description) {
        this.name = name;
        description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

}
