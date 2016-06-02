package com.digicorp.android.dynamicrecyclerviewitemdemo.adapter.viewholder;

import android.view.View;
import android.widget.TextView;

import com.digicorp.android.dynamicrecyclerviewitemdemo.R;
import com.digicorp.android.dynamicrecyclerviewitemdemo.model.BaseModel;
import com.digicorp.android.dynamicrecyclerviewitemdemo.model.datasource.TitleDescriptionDataSource;

/**
 * Created by kevin.adesara on 6/1/16.
 */
public class TitleDescriptionViewHolder extends BaseViewHolder {
    private TextView lblTitle;
    private TextView lblDescription;

    public TitleDescriptionViewHolder(View itemView) {
        super(itemView);
        lblTitle = (TextView) itemView.findViewById(R.id.lblTitle);
        lblDescription = (TextView) itemView.findViewById(R.id.lblDescription);
    }

    @Override
    public void bind(BaseModel data) {
        TitleDescriptionDataSource dataSource = (TitleDescriptionDataSource) data;
        lblTitle.setText(dataSource.getTitle());
        lblDescription.setText(dataSource.getDescription());
    }
}
