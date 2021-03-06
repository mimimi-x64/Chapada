package com.example.android.chapada;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.support.v4.app.Fragment;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState( );

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed( );
        }
    }

    @Override
    public boolean onCreateOptionsMenu( Menu menu ) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater( ).inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected( MenuItem item ) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId( );

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected( MenuItem item ) {
        //creating fragment object
        Fragment fragment = null;

        //Initialize intent object
        Intent intent = new Intent( );
        // Handle navigation view item clicks here.
        int id = item.getItemId( );

        switch (id) {
            case R.id.nav_inicio: // Handle the camera action
                break;
            case R.id.nav_historia:
                intent.setClass(this, HistoryActivity.class);
                startActivity(intent);
                break;
            case R.id.nav_cachoeira:
                fragment = new CachoeiraFragment();
                break;
            case R.id.nav_trilhas:
                break;
            case R.id.nav_atracoes:
                break;
            case R.id.nav_hoteis:
                fragment = new HotelFragment();
                break;
            case R.id.nav_pousadas:
                fragment = new PousadaFragment();
                break;
            case R.id.nav_camping:
                fragment = new CampingFragment();
                break;
            case R.id.nav_info_gerais:
                break;
            case R.id.nav_creditos:
                break;
            case R.id.nav_feedback:
                break;
        }

        //replacing the fragment
        if (fragment != null) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.container_frame, fragment);
            ft.commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
//        displaySelectedScreen(item.getItemId());
        return true;
    }

//    private void displaySelectedScreen(int itemId) {
//
//        //creating fragment object
//        Fragment fragment = null;
//
//        //initializing the fragment object which is selected
//        switch (itemId) {
//            case R.id.nav_inicio:
//                fragment = new HotelFragment();
//                break;
//            case R.id.nav_historia:
//                fragment = new PousadaFragment();
//                break;
//            case R.id.nav_cachoeira:
//                break;
//            case R.id.nav_trilhas:
//                break;
//            case R.id.nav_atracoes:
//                break;
//            case R.id.nav_hoteis:
//                break;
//            case R.id.nav_pousadas:
//                break;
//            case R.id.nav_camping:
//                break;
//            case R.id.nav_info_gerais:
//                break;
//            case R.id.nav_creditos:
//                break;
//            case R.id.nav_feedback:
//                break;
//        }
//
//        //replacing the fragment
//        if (fragment != null) {
//            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
//            ft.replace(R.id.container_frame, fragment);
//            ft.commit();
//        }
//
//        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//        drawer.closeDrawer(GravityCompat.START);
//    }
}
