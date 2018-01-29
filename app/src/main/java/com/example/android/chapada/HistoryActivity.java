package com.example.android.chapada;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import com.bumptech.glide.Glide;


public class HistoryActivity extends AppCompatActivity {

    protected String appUrl = "https://play.google.com/store/apps/details?id=com.eajy.materialdesigndemo";

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        getWindow( ).addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar( ) != null) {
            getSupportActionBar( ).setDisplayHomeAsUpEnabled(true);
        }

        FloatingActionButton fab = findViewById(R.id.fab_scrolling);
        fab.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick( View view ) {

                Intent intent = new Intent( );
                intent.setAction(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT, ("App Guia Sobre a Chapada" + "\n" + appUrl));
                intent.setType("text/plain");
                startActivity(Intent.createChooser(intent, getString(R.string.share_with)));
            }
        });

        ImageView historyTopImage = findViewById(R.id.image_scrolling_top);
        Glide.with(this).load(R.drawable.chapada_photo_green).fitCenter( ).into(historyTopImage);
    }
}
