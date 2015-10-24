package com.example.hari.myapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class MainActivity extends Activity {

    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeDatabase();
        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                Intent i = new Intent(MainActivity.this, SignIn.class);
                startActivity(i);

                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);
    }

    public void initializeDatabase(){

        SharedPreferences prefs = this.getSharedPreferences(
                "com.onlinechat.app.install", Context.MODE_PRIVATE);

        Boolean status= prefs.getBoolean("firstTime",false);

        Toast.makeText(getApplicationContext(), "this is my Toast message!!! =)"+status,
                Toast.LENGTH_LONG).show();
        DatabaseHelper db = new DatabaseHelper(getApplicationContext());

        if(!status){
            SharedPreferences sp = getSharedPreferences("com.onlinechat.app.install", Activity.MODE_PRIVATE);
            SharedPreferences.Editor editor = sp.edit();
            editor.putBoolean("firstTime", true);
            editor.commit();

        }
    }
}
