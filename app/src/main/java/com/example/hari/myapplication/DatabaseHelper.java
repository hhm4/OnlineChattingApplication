package com.example.hari.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Hari on 10/23/2015.
 */
public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="ONLINECHAT";
    public static final int DATABASE_VERSION=1;

    private static final String CREATE_TABLE_USERS="CREATE TABLE IF NOT EXISTS USERS (\n" +
            "\n" +
            "UserId int(100) NOT NULL  AUTO_INCREMENT,\n" +
            "UserName varchar(100) NOT NULL,\n" +
            "EmailId  varchar(250) NOT NULL,\n" +
            "User_Password varchar(100) NOT NULL,\n" +
            "CreatedAt TimeStamp NOT NULL DEFAULT CURRENT_TIMESTAMP,\n" +
            "UserStatus int(1)  NOT NULL  DEFAULT '1',\n" +
            "UserPictureLink varchar(100) DEFAULT NULL,\n" +
            "StatusUpdate varchar(250) DEFAULT NULL,\n" +
            "PRIMARY KEY (UserId),\n" +
            "UNIQUE KEY EmailId (EmailId)\n" +
            ");\n";
    public DatabaseHelper(Context context) {

        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        // creating required tables
        db.execSQL(CREATE_TABLE_USERS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // on upgrade drop older tables
        db.execSQL("DROP TABLE IF EXISTS " + "USERS");
        // create new tables
        onCreate(db);
    }

}
