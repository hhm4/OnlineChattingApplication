package com.example.hari.myapplication;

import android.app.TabActivity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TabHost;

/**
 * Created by Hari on 10/18/2015.
 */
public class MasterLayout extends TabActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.masterlayout);


        TabHost tabHost = (TabHost)findViewById(android.R.id.tabhost);


        TabHost.TabSpec tab1 = tabHost.newTabSpec("First Tab");
        TabHost.TabSpec tab2 = tabHost.newTabSpec("Second Tab");
        TabHost.TabSpec tab3 = tabHost.newTabSpec("Third tab");

        // Set the Tab name and Activity
        // that will be opened when particular Tab will be selected
        tab1.setIndicator("", getResources().getDrawable(R.drawable.contactsicon));
        tab1.setContent(new Intent(this,Contacts.class));

        tab2.setIndicator("", getResources().getDrawable(R.drawable.chaticon));
        tab2.setContent(new Intent(this,Chat.class));

        tab3.setIndicator("", getResources().getDrawable(R.drawable.myaccounticon));
        tab3.setContent(new Intent(this,MyAccount.class));

        /** Add the tabs  to the TabHost to display. */
        tabHost.addTab(tab1);
        tabHost.addTab(tab2);
        tabHost.addTab(tab3);
       /* final TabHost th=(TabHost)findViewById(R.id.tabHost);
        th.setup();

        TabHost.TabSpec specs=th.newTabSpec("tag1");
        specs.setIndicator("", getResources().getDrawable(R.drawable.contactsicon));
       // Intent intent1=new Intent().setClass(this,Contacts.class);
       // specs.setContent(R.layout.contacts);
        th.addTab(specs);

        specs=th.newTabSpec("tag2");
        specs.setIndicator("", getResources().getDrawable(R.drawable.chaticon));
      //  Intent intent2=new Intent().setClass(this,Chat.class);
      //  specs.setContent(R.layout.chat);
        th.addTab(specs);

        specs=th.newTabSpec("tag3");
        specs.setIndicator("", getResources().getDrawable(R.drawable.myaccounticon));
      //  Intent intent3=new Intent(this,MyAccount.class);
     //   specs.setContent(R.layout.myaccount);
        th.addTab(specs);

*/

    }
}
