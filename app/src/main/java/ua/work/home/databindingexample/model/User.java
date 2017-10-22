package ua.work.home.databindingexample.model;

/**
 * Created by Andrii Papai on 22.10.2017.
 */

public class User {
    private String mName;
    private String mSurName;

    public User(String name, String surName) {
        mName = name;
        mSurName = surName;
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
