package fun.ssss.smsrelayer.data.bean;

/**
 * 联系人
 * Created by 楊遠徵 on 2020/12/3.
 */

public class Contact {

    /**
     * 联系人名称
     */
    private String mContactName;

    /**
     * 联系人电话号码
     */
    private String mContactNum;

    /**
     * 是否被选中
     */
    private int mSelected;

    public Contact() {

    }

    public Contact( String contactName, String contactNum) {
        this.mContactName = contactName;
        this.mContactNum = contactNum;
    }

    public String getContactName() {
        return mContactName;
    }

    public void setContactName(String contactName) {
        this.mContactName = contactName;
    }

    public String getContactNum() {
        return mContactNum;
    }

    public void setContactNum(String contactNum) {
        this.mContactNum = contactNum;
    }


    public int getSelected() {
        return mSelected;
    }

    public void setSelected(int selected) {
        this.mSelected = selected;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "mContactName='" + mContactName + '\'' +
                ", mContactNum='" + mContactNum + '\'' +
                ", mSelected=" + mSelected +
                '}';
    }
}
