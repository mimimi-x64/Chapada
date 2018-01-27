package com.example.android.chapada;

/**
 * Store all content to pass later to adapter
 */

public class ListItens {

    private int mPhotoID;
    private String mTitleName;
    private String mCityName;

    public ListItens(int photoID, String titleName, String cityName) {
        mPhotoID = photoID;
        mTitleName = titleName;
        mCityName = cityName;
    }

    //Getter
    public int getPhotoID(){
        return mPhotoID;
    }

    public String getTitleName() {
        return mTitleName;
    }

    public String getCityName() {
        return mCityName;
    }

    //Setter
    public void setPhotoID( int mPhotoID ) {
        this.mPhotoID = mPhotoID;
    }

    public void setTitleName( String mTitleName ) {
        this.mTitleName = mTitleName;
    }

    public void setCityName( String mCityName ) {
        this.mCityName = mCityName;
    }
}
