package com.digicorp.android.dynamicrecyclerviewitemdemo.adapter.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.digicorp.android.dynamicrecyclerviewitemdemo.model.BaseModel;

/**
 * Created by kevin.adesara on 6/1/16.
 */
public abstract class BaseViewHolder extends RecyclerView.ViewHolder {
    public BaseViewHolder(View itemView) {
        super(itemView);
    }

    public abstract void bind(BaseModel data);
}
