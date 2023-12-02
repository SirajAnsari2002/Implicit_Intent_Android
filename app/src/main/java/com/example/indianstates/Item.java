package com.example.indianstates;

public class Item {
    int imageId;

    String stateName;

    public Item(int imageId, String stateName) {
        this.imageId = imageId;
        this.stateName = stateName;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
}
