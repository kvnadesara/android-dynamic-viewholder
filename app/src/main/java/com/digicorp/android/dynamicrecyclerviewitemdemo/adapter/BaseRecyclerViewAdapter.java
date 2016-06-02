package com.digicorp.android.dynamicrecyclerviewitemdemo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.digicorp.android.dynamicrecyclerviewitemdemo.adapter.viewholder.BaseViewHolder;
import com.digicorp.android.dynamicrecyclerviewitemdemo.model.BaseModel;

import java.util.ArrayList;


public class BaseRecyclerViewAdapter extends RecyclerView.Adapter<BaseViewHolder> {

    private ArrayList<BaseModel> mData;
    private Context mContext;

    public BaseRecyclerViewAdapter(Context context, ArrayList<BaseModel> data) {
        this.mData = data == null ? new ArrayList<BaseModel>() : data;
        this.mContext = context;
    }

    @Override
    public int getItemViewType(int position) {
        return ViewHolderResolver.identifyViewHolderType(mData.get(position));
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        return ViewHolderResolver.resolveViewHolder(mContext, viewGroup, viewType);
    }

    @Override
    public void onBindViewHolder(BaseViewHolder viewHolder, int position) {
        ViewHolderResolver.bindViewHolder(viewHolder, mData.get(position));
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }
}
