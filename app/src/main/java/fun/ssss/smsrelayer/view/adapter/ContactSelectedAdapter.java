package fun.ssss.smsrelayer.view.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import fun.ssss.smsrelayer.R;
import fun.ssss.smsrelayer.view.adapter.holder.ContactHolder;
import fun.ssss.smsrelayer.data.bean.Contact;
import fun.ssss.smsrelayer.data.DataBaseManager;

import java.util.List;

/**
 * Created by 楊遠徵 on 2020/12/3.
 */

public class ContactSelectedAdapter extends RecyclerView.Adapter<ContactHolder> {

    private LayoutInflater mInflater;
    private List<Contact> mSelectedList;
    private Context mContext;

    public ContactSelectedAdapter(Context context, List<Contact> seletedList) {
        this.mContext = context;
        this.mInflater = LayoutInflater.from(context);
        this.mSelectedList = seletedList;
    }


    private View getItemView(LayoutInflater inflater, ViewGroup parent) {
        return inflater.inflate(R.layout.item_selected_contact,parent,false);
    }

    @Override
    public ContactHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = getItemView(mInflater,parent);
        ContactHolder holder = new ContactHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ContactHolder holder, int position) {
        final Contact contact = mSelectedList.get(position);
        holder.mContactName.setText(contact.getContactName());
        holder.mContactNum.setText(contact.getContactNum());

        holder.mRightIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DataBaseManager dataBaseManager = new DataBaseManager(mContext);
                dataBaseManager.deleteContactFromMobile(contact.getContactNum());
                mSelectedList.remove(contact);
                dataBaseManager.closeHelper();
                notifyDataSetChanged();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mSelectedList.size();
    }

    /**
     * 外部调用的更新数据
     * @param contactList
     */
    public void notifyUpdata(List<Contact> contactList){
        mSelectedList = contactList;
        notifyDataSetChanged();
    }
}
