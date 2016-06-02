package com.digicorp.android.dynamicrecyclerviewitemdemo.adapter;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by kevin.adesara on 6/1/16.
 * Types of view holder
 * Available types:
 * 1. Title description item
 * 2. Address item
 */
public enum ViewHolderTypes {
    TITLE_DESCRIPTION_ITEM(1),
    ADDRESS_ITEM(2);

    private static final Map<Integer, ViewHolderTypes> lookup
            = new HashMap<>();

    static {
        for (ViewHolderTypes w : EnumSet.allOf(ViewHolderTypes.class))
            lookup.put(w.getType(), w);
    }


    private int type;

    private ViewHolderTypes(int type) {
        this.type = type;
    }

    public static ViewHolderTypes get(int type) {
        return lookup.get(type);
    }

    public int getType() {
        return this.type;
    }
}
