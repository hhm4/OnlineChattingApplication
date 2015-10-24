package com.example.hari.myapplication;

import android.content.Intent;
import android.view.View;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
/**
 * Created by Hari on 10/23/2015.
 */
public class SignIn extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin);

    }

    public void openSignUp(View view){

        Intent intent=new Intent(this, SignUp.class);
        startActivity(intent);
    }
    public void openMasterLayout(View view){

        Intent intent=new Intent(this, MasterLayout.class);
        startActivity(intent);
    }
}
