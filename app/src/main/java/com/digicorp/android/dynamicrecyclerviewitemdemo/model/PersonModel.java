package com.digicorp.android.dynamicrecyclerviewitemdemo.model;

import com.digicorp.android.dynamicrecyclerviewitemdemo.model.datasource.TitleDescriptionDataSource;

/**
 * Created by kevin.adesara on 6/1/16.
 * Model which hold title and description kind of data
 */
public class PersonModel extends BaseModel implements TitleDescriptionDataSource {

    private String firstName;
    private String lastName;
    private String email;

    public PersonModel(String firstName, String lastName, String email) {
        super(dataSourceType);
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    @Override
    public String getTitle() {
        return firstName + " " + lastName;
    }

    @Override
    public String getDescription() {
        return email;
    }
}
