package com.example.hari.myapplication;

import android.provider.BaseColumns;

/**
 * Created by Hari on 10/23/2015.
 */
public class FeedReaderContract {

    public FeedReaderContract() {}

    public static abstract class FeedEntry implements BaseColumns {

        public static final String TABLE_NAME = "";
        public static final String COLUMN_NAME_ENTRY_ID = "entryid";
        public static final String COLUMN_NAME_TITLE = "title";
        public static final String COLUMN_NAME_SUBTITLE = "subtitle";


    }
}
