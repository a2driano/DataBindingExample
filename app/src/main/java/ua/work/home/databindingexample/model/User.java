package ua.work.home.databindingexample.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import ua.work.home.databindingexample.BR;

/**
 * Created by Andrii Papai on 22.10.2017.
 */

public class User extends BaseObservable {
    public String name;
    private String surName;
    private String mUrl;

    public User(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public User(String name, String surName, String url) {
        this.name = name;
        this.surName = surName;
        this.mUrl = url;
    }

    @Bindable
    public String getmUrl() {
        return mUrl;
    }

    public void setmUrl(String mUrl) {
        this.mUrl = mUrl;
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }
}
