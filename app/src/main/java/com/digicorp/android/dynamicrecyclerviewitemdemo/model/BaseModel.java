package com.digicorp.android.dynamicrecyclerviewitemdemo.model;

/**
 * Created by kevin.adesara on 6/1/16.
 */
public class BaseModel {
    /**
     * Type of the data model
     */
    protected int type;

    public BaseModel(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
