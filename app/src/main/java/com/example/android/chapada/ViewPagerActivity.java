package com.example.android.chapada;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;


public class ViewPagerActivity extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hosting_view_pager);

        SimpleFragmentPageAdaper simpleFragmentPageAdaper = new SimpleFragmentPageAdaper(getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.hosting_view_pager);
        viewPager.setAdapter(simpleFragmentPageAdaper);
    }
}
