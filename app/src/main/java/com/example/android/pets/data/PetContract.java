package com.example.android.pets.data;

import android.provider.BaseColumns;

/**
 * Created by mikem on 6/8/2017.
 */

public final class PetContract {



    public static class PetEntry implements BaseColumns{

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
