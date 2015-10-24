package com.example.hari.myapplication;

/**
 * Created by Hari on 10/17/2015.
 */

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class SignUp extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

    }
    public void openSignIn(View view){

        Intent intent=new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}