package fun.ssss.smsrelayer.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


/**
 * Created by 楊遠徵 on 2020/12/3.
 */

public class DataBaseHelper extends SQLiteOpenHelper {

    private static final int VERSION = 1;
    private static final String DB_NAME = "contact.db";
    private static final String CREAD_DB_SQL = "CREATE TABLE "+ Constants.DB_TABLE_NAME+
            "("+ Constants.DB_KEY_ID+" integer primary key autoincrement" +
            ","+ Constants.DB_KEY_NAME+" varchar(20),"+ Constants.DB_KEY_MOBLIE+" varchar(20))";

    public DataBaseHelper(Context context) {
        super(context, DB_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREAD_DB_SQL);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
