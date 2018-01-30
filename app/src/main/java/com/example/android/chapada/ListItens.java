package com.example.android.chapada;

/**
 * Store all content to pass later to adapter
 */

public class ListItens {

    //Check if resources were initialized
    private static final int NO_RESOURCE = -1;
    //Waterfall Variables
    private int mPhotoID;
    private String mWaterfallName;
    private String mCityName;
    //Hosting Variables
    private String mHostName;
    private String mContactNumber;
    private String mWebSite;

    //Waterfall Constructor
    public ListItens(int photoID, String waterfallName, String cityName) {
        mPhotoID = photoID;
        mWaterfallName = waterfallName;
        mCityName = cityName;
    }


    //Hosting Constructor
    public ListItens( int photoID, String hostName, String cityName, String contactNumber, String webSite ) {
        mPhotoID = photoID;
        mHostName = hostName;
        mCityName = cityName;
        mWebSite = webSite;
        mContactNumber = contactNumber;
    }

    //Check Methods
    public boolean checkImageResource(){
        return mPhotoID != NO_RESOURCE;
    }
    public boolean checkWaterfall(){
        return mWaterfallName != null;
    }
    public boolean checkWebsite(){
        return mWebSite != null;
    }
    public boolean checkHost(){
        return mHostName != null;
    }

    public boolean checkContactName() {
        return mHostName != null;
    }


    //All Getter Methods
    public int getPhotoID(){
        return mPhotoID;
    }
    public String getTitleName() {
        return mWaterfallName;
    }
    public String getCityName() {
        return mCityName;
    }
    public String getWebSite() {
        return mWebSite;
    }

    @Override
    public String toString() {
        return "" + mContactNumber;
    }

    public String getContactNumber() {
        return mContactNumber;
    }
    public String getHostName() {
        return mHostName;
    }

}
