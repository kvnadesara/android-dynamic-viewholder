package com.digicorp.android.dynamicrecyclerviewitemdemo.model.datasource;

/**
 * Created by kevin.adesara on 6/1/16.
 */
public interface TitleDescriptionDataSource {
    int dataSourceType = 1;

    String getTitle();

    String getDescription();
}
