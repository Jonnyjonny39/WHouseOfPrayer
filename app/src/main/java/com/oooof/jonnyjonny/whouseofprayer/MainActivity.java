package com.oooof.jonnyjonny.whouseofprayer;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar=findViewById(R.id.toolbar);

      //  setSupportActionBar(toolbar);
        DrawerLayout drawer=(DrawerLayout)findViewById(R.id.drawer_layout);
        android.support.v7.app.ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(MainActivity.this,drawer,toolbar,R.string.app_name,R.string.app_name);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView=(NavigationView)findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }
    @SuppressWarnings("StatementWithEmptyBody")

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        int id=menuItem.getItemId();
        if (id==R.id.nav_about_us){
            Intent missionIntent=new Intent(MainActivity.this,MissionActivity.class);
            startActivity(missionIntent);
            overridePendingTransition(R.anim.slide_right_in,R.anim.slide_left_out);

        }else if (id==R.id.nav_prayer_board){
            Intent boardIntent=new Intent(MainActivity.this,PrayerBoardActivity.class);
            startActivity(boardIntent);

        }else if (id==R.id.nav_media){
            Intent mediaIntent=new Intent(MainActivity.this,MediaActivity.class);

            startActivity(mediaIntent);


        }else if (id==R.id.nav_send){
            Intent contactIntent=new Intent(MainActivity.this,ContactActivity.class);
            startActivity(contactIntent);

        }else if (id==R.id.nav_events){
            Intent eventIntent=new Intent(MainActivity.this,EventActivity.class);
            startActivity(eventIntent);
        }else if (id==R.id.nav_inside_prayer_board){
            Intent insideBoardIntent=new Intent(MainActivity.this,InsideBoardActivity.class);
            startActivity(insideBoardIntent);
        }else if (id==R.id.nav_share){
            Intent shareIntent=new Intent(Intent.ACTION_SEND);
            shareIntent.setType("text/plain");
            //will eventually add link from playstore when i publish
            shareIntent.putExtra(Intent.EXTRA_TEXT,"Please Check Out Willoughby House Of Prayer App At:");
            startActivity(Intent.createChooser(shareIntent,"God Bless You!!"));
        }
        DrawerLayout drawer=(DrawerLayout)findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
