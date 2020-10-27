package com.example.notificationbadge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.github.arturogutierrez.Badges;
import com.github.arturogutierrez.BadgesNotSupportedException;

public class MainActivity extends AppCompatActivity  {
    int badgeCount;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void countMe(View view) {
        badgeCount++;
        Log.e(TAG, "countMe clicked: "+badgeCount);
        try {
            Badges.setBadge(MainActivity.this, badgeCount++);
        } catch (BadgesNotSupportedException e) {
            e.printStackTrace();
        }
    }

    public void zeroMe(View view) {
        // Alternative way
        try {
            Badges.setBadge(this, 0);
        } catch (BadgesNotSupportedException e) {
            e.printStackTrace();
        }

    }


}