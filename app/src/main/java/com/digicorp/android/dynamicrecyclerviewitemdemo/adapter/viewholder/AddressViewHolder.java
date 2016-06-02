package com.digicorp.android.dynamicrecyclerviewitemdemo.adapter.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.digicorp.android.dynamicrecyclerviewitemdemo.R;
import com.digicorp.android.dynamicrecyclerviewitemdemo.model.BaseModel;
import com.digicorp.android.dynamicrecyclerviewitemdemo.model.datasource.AddressDataSource;

/** * Created by kevin.adesara on 6/1/16.
 */
public class AddressViewHolder extends BaseViewHolder {
    private TextView lblAddress;
    private ImageView imgLocateMap;

    public AddressViewHolder(View itemView) {
        super(itemView);
        lblAddress = (TextView) itemView.findViewById(R.id.lblAddress);
        imgLocateMap = (ImageView) itemView.findViewById(R.id.imgLocateMap);
    }

    @Override
    public void bind(BaseModel data) {
        AddressDataSource dataSource = (AddressDataSource) data;
        lblAddress.setText(dataSource.getAddress());
        //lblDescription.setText(dataSource.getDescription());
    }
}
