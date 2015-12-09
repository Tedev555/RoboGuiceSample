package com.example.ted555.roboguicesample;

import android.app.NotificationManager;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TextView;

import com.google.inject.Inject;

import roboguice.activity.RoboActivity;
import roboguice.inject.InjectResource;
import roboguice.inject.InjectView;

public class MainActivity extends RoboActivity {

    @InjectView(R.id.textView1) TextView textView1;
    @InjectResource(R.string.app_name) String name;
    @InjectResource(R.mipmap.ic_launcher) Drawable icLauncher;
    @Inject LocationManager locManager;
    @Inject LayoutInflater inflater;
    @Inject NotificationManager notifyManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1.setText("Thanongsine Chanthakham");

    }
}
