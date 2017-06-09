package com.bruce.demo.entity;

import android.support.annotation.ColorRes;

import java.io.Serializable;

/**
 *
 * Created by Bruce on 2017/6/9.
 */
public class Model implements Serializable {

    private String mTitle;
    @ColorRes
    private int mColor;

    public Model(String title, int color) {
        mTitle = title;
        mColor = color;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public int getColor() {
        return mColor;
    }

    public void setColor(int color) {
        mColor = color;
    }

    @Override
    public String toString() {
        return "Model{" +
                "mTitle='" + mTitle + '\'' +
                ", mColor=" + mColor +
                '}';
    }
}
