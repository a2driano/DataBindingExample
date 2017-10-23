package ua.work.home.databindingexample.model;

/**
 * Created by Andrii Papai on 22.10.2017.
 */

public class User {
    private String mName;
    private String mSurName;
    private String mUrl;

    public User(String name, String surName) {
        mName = name;
        mSurName = surName;
    }

    public User(String mName, String mSurName, String mUrl) {
        this.mName = mName;
        this.mSurName = mSurName;
        this.mUrl = mUrl;
    }

    public String getmUrl() {
        return mUrl;
    }

    public void setmUrl(String mUrl) {
        this.mUrl = mUrl;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getSurName() {
        return mSurName;
    }

    public void setSurName(String surName) {
        mSurName = surName;
    }
}
