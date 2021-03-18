package com.example.runnershighapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    Context context;

    //Declaring bottom nav Bar
    BottomNavigationView bottomNavigationView;

    //Todo: Create Fragment object for each fragment
    /*
    HomeFragment mHomeFragment;
    ...
    TrackMoodFragment mTrackMoodFragment;
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context=this;

        //TODO: initialize fragment objects
        /*
        if(mHomeFragment==null)
            mHomeFragment = new HomeFragment();
        ...
        if(mTrackMoodFragment==null)
            mTrackMoodFragment = new TrackMoodFragment

         */


        bottomNavigationView=findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment;
                switch(item.getItemId()){
                    case R.id.itHistory:
                        //fragment = mHistoryFragment;
                        Toast.makeText(context, "Moving To History Fragment", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.itHome:
                        //fragment = mHomeFragment;
                        Toast.makeText(context, "Moving to Home Fragment", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.itRun:
                        //fragment = mRunFragment;
                        Toast.makeText(context, "Moving to Run Fragment", Toast.LENGTH_SHORT).show();

                        break;
                    case R.id.itTrackMood:
                        //fragment = mTrackMoodFragment;
                        Toast.makeText(context, "Moving to TackMood Fragment", Toast.LENGTH_SHORT).show();
                        break;
                }

                //TODO: Replace frameLayout with fragment
                //getSupportFragmentManager().beginTransaction().replace(R.id.flContainer,fragment).commit();
                return true;
            }
        });


    }
}