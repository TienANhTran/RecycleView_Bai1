package com.example.recycleview_bai1;

public class Menu {
    private String mName ;
    private String mFan;
    private String mStatus;
    private String mNewPost;
    private int mImage;

    public Menu(String mName, String mFan, String mStatus, String mPost, int hinh1) {
        this.mName = mName;
        this.mFan = mFan;
        this.mStatus = mStatus;
        this.mNewPost = mPost;
        this.mImage = mImage;
    }

    public int getmImage() {
        return mImage;
    }

    public void setmImage(int mImage) {
        this.mImage = mImage;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmFan() {
        return mFan;
    }

    public void setmFan(String mFan) {
        this.mFan = mFan;
    }

    public String getmStatus() {
        return mStatus;
    }

    public void setmStatus(String mStatus) {
        this.mStatus = mStatus;
    }

    public String getmNewPost() {
        return mNewPost;
    }

    public void setmNewPost(String mPost) {
        this.mNewPost = mPost;
    }
}
