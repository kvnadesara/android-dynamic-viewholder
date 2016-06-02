package com.digicorp.android.dynamicrecyclerviewitemdemo.model;

import com.digicorp.android.dynamicrecyclerviewitemdemo.model.datasource.AddressDataSource;

/**
 * Created by kevin.adesara on 6/1/16.
 */
public class CompanyModel extends BaseModel implements AddressDataSource {
    private String companyName;
    private String companyAddress;

    public CompanyModel(String companyName, String companyAddress) {
        super(dataSourceType);
        this.companyName = companyName;
        this.companyAddress = companyAddress;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String getAddress() {
        return getCompanyAddress();
    }
}
