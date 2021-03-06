package com.example.android.chapada;

/**
 * Store all content to pass later to adapter
 */

public class ListItens {

    //Waterfall Variables
    private int mPhotoID;
    private String mWaterfallName;
    private String mCityName;

    //Hosting Variables
    private String mHostName;
    private int mContactNumber;
    private String mWebSite;

    //Check if resources were initialized
    private static final int NO_RESOURCE = -1;

    //Waterfall Constructor
    public ListItens(int photoID, String waterfallName, String cityName) {
        mPhotoID = photoID;
        mWaterfallName = waterfallName;
        mCityName = cityName;
    }

    //Hosting Constructor
    public ListItens(String hostName, String cityName, String webSite, int contactNumber){
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
    public boolean checkContactNumber(){
        return mContactNumber != NO_RESOURCE;
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

    public int getContactNumber() {
        return mContactNumber;
    }
    public String getHostName() {
        return mHostName;
    }

}
