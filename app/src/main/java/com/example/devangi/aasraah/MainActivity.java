package com.example.devangi.aasraah;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 private DrawerLayout mdrawerlayout;
 private ActionBarDrawerToggle Mtoggle;
 FragmentTransaction fragmenttransaction;
 NavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mdrawerlayout= (DrawerLayout) findViewById(R.id.drawerLayout);
        Mtoggle = new ActionBarDrawerToggle(this,mdrawerlayout,R.string.open,R.string.close);
        mdrawerlayout.addDrawerListener(Mtoggle);
        Mtoggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        fragmenttransaction=getSupportFragmentManager().beginTransaction();
        fragmenttransaction.add(R.id.main_container,new Home());
        fragmenttransaction.commit();
        getSupportActionBar().setTitle("AasRAAH");
        navigationView = (NavigationView) findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch(menuItem.getItemId()){
                    case R.id.nav_account:
                        fragmenttransaction = getSupportFragmentManager().beginTransaction();
                        fragmenttransaction.replace(R.id.main_container,new Home());
                        fragmenttransaction.commit();
                        getSupportActionBar().setTitle("Home");
                        menuItem.setChecked(true);
                        mdrawerlayout.closeDrawers();
                        break;
                    case R.id.helpline:
                        fragmenttransaction = getSupportFragmentManager().beginTransaction();
                        fragmenttransaction.replace(R.id.main_container,new Helpline());
                        fragmenttransaction.commit();
                        getSupportActionBar().setTitle("helpline");
                        menuItem.setChecked(true);
                        mdrawerlayout.closeDrawers();
                        break;
                    case R.id.list:
                        fragmenttransaction = getSupportFragmentManager().beginTransaction();
                        fragmenttransaction.replace(R.id.main_container,new list());
                        fragmenttransaction.commit();
                        getSupportActionBar().setTitle("List");
                        menuItem.setChecked(true);
                        mdrawerlayout.closeDrawers();
                        break;


                }
                return true;

            }
        });
    }
    public boolean onOptionsItemSelected(MenuItem item){
        if(Mtoggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}
