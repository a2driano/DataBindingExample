package ua.work.home.databindingexample.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by Andrii Papai on 24.10.2017.
 */

public class UserTwoSide extends BaseObservable {
    private String mName;
    private String mSurName;

    public UserTwoSide(String name, String surName) {
        mName = name;
        mSurName = surName;
    }

    @Bindable
    public String getName() {
        return mName;
    }

    @Bindable
    public void setName(String name) {
        mName = name;
    }

    @Bindable
    public String getSurName() {
        return mSurName;
    }

    @Bindable
    public void setSurName(String surName) {
        mSurName = surName;
    }
}
