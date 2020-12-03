package fun.ssss.smsrelayer.utils;

import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;

import fun.ssss.smsrelayer.data.bean.Contact;

import java.util.ArrayList;


/**
 * 联系人管理
 * Created by 楊遠徵 on 2020/12/3.
 */

public class ContactManager {

    /**
     * 从ContentProvider中获取所有联系人
     */
    public static ArrayList<Contact> getContactList(Context context){
        ArrayList<Contact> mContactList = new ArrayList<>();

        Cursor cursor = context.getContentResolver()
                .query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI
                        ,null,null,null,ContactsContract.CommonDataKinds.Phone.SORT_KEY_PRIMARY);
        while (cursor.moveToNext()){
            Contact contact = new Contact();
            contact.setContactName(cursor.getString(cursor
                    .getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME)));

            contact.setContactNum(cursor.getString(cursor
                    .getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)));

            mContactList.add(contact);

        }
        return mContactList;
    }
}
