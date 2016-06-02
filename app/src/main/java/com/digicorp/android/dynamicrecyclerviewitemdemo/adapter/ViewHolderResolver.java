package com.digicorp.android.dynamicrecyclerviewitemdemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.digicorp.android.dynamicrecyclerviewitemdemo.R;
import com.digicorp.android.dynamicrecyclerviewitemdemo.adapter.viewholder.AddressViewHolder;
import com.digicorp.android.dynamicrecyclerviewitemdemo.adapter.viewholder.BaseViewHolder;
import com.digicorp.android.dynamicrecyclerviewitemdemo.adapter.viewholder.TitleDescriptionViewHolder;
import com.digicorp.android.dynamicrecyclerviewitemdemo.model.BaseModel;

/**
 * Created by kevin.adesara on 6/1/16.
 * <p/>
 * A utility class used to create an object of appropriate view holder based on type
 */
public final class ViewHolderResolver {

    /**
     * Find view holder type from data and identify it in the enum of ViewHolderTypes
     *
     * @param data json data
     * @return type of view data item
     */
    public static int identifyViewHolderType(BaseModel data) {
        ViewHolderTypes viewHolderType = ViewHolderTypes.get(data.getType());
        if (viewHolderType != null)
            return viewHolderType.getType();
        return -1;
    }

    /**
     * Find appropriate view holder object based on the provided type
     *
     * @param context context
     * @param parent  view group parent
     * @param type    view holder type
     * @return view holder object
     */
    public static BaseViewHolder resolveViewHolder(Context context, ViewGroup parent, int type) {
        ViewHolderTypes viewHolderType = ViewHolderTypes.get(type);
        LayoutInflater inflater = LayoutInflater.from(context);
        switch (viewHolderType) {
            case TITLE_DESCRIPTION_ITEM:
                View view = inflater.inflate(R.layout.raw_title_desc, parent, false);
                return new TitleDescriptionViewHolder(view);
            case ADDRESS_ITEM:
                View view1 = inflater.inflate(R.layout.raw_address, parent, false);
                return new AddressViewHolder(view1);
        }
        return null;
    }

    public static void bindViewHolder(BaseViewHolder viewHolder, BaseModel data) {
        viewHolder.bind(data);
    }
}
