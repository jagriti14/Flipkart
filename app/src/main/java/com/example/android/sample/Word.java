package com.example.android.sample;

/**
 * Created by Dell on 21-07-2017.
 */

public class Word {
    private String mImageId;
    private String mName;

    public Word(String ImageId,String name){
        mImageId=ImageId;
        mName=name;
    }

    public String getmImageId(){
        return mImageId;
    }
    public String getmName(){
        return mName;
    }
}
