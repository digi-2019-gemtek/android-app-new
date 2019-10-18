package com.example.subject1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import java.util.Timer;
import java.util.TimerTask;

public class Loading extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.e("Loading","onCreate_16" );
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);

        final Intent localIntent = new Intent();
        localIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
        localIntent.setClass(Loading.this,Certification.class);

        Timer timer = new Timer();
        TimerTask tast = new TimerTask() {
            @Override
            public void run() {
                Log.e("Loading","run_25" );
                startActivity(localIntent);
                Log.e("Loading","run_27" );
            }
        };
        Log.e("Loading","delay_30" );
        timer.schedule(tast, 3000);
        Log.e("Loading","delay_32" );

    }
}
