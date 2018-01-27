package com.example.android.chapada;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by phartmann on 26/01/2018.
 */

public class SimpleFragmentPageAdaper extends FragmentPagerAdapter {
    public SimpleFragmentPageAdaper( FragmentManager fm ) {
        super(fm);
    }

    @Override
    public Fragment getItem( int position ) {
        switch (position){
            case 0:
                return new HotelFragment();
            case 1:
                return new PousadaFragment();
            default:
                return new CampingFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
