package fun.ssss.smsrelayer.view.adapter.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import fun.ssss.smsrelayer.R;

/**
 * Created by 楊遠徵 on 2020/12/3.
 */
public class ContactHolder extends RecyclerView.ViewHolder{

    public View mItemView;
    public TextView mContactName,mContactNum;
    public ImageView mRightIcon;

    public ContactHolder(View itemView) {
        super(itemView);
        this.mItemView = itemView;
        mContactName = (TextView) itemView.findViewById(R.id.text_contact_name);
        mContactNum = (TextView) itemView.findViewById(R.id.text_contact_num);
        mRightIcon = (ImageView) itemView.findViewById(R.id.image_contact_selecter);
    }
}
