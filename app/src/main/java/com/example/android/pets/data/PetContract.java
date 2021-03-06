package com.example.android.pets.data;

import android.net.Uri;
import android.provider.BaseColumns;
import android.content.ContentResolver;

/**
 * Created by mikem on 6/8/2017.
 */

public final class PetContract {

    public static final String CONTENT_AUTHORITY = "com.example.android.pets";

    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);

    public static final String PATH_PETS = "pets";


    public static class PetEntry implements BaseColumns{

        /* The MIME type of the {@link #CONTENT_URI} for a list of pets.  */
        public static final String CONTENT_LIST_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_PETS;

        /* The MIME type of the {@link #CONTENT_URI} for a single pet. */
        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_PETS;

        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_PETS);

        //create constant for table name
        public static final String TABLE_NAME = "pets";

        //create constants for the columns
       public static final String _ID = BaseColumns._ID;
       public static final String COLUMN_PET_NAME = "name";
       public static final String COLUMN_PET_BREED = "breed";
       public static final String COLUMN_PET_GENDER = "gender";
       public static final String COLUMN_PET_WEIGHT = "weight";

       //create constants for the genders
        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;
    }

}
