package fun.ssss.smsrelayer.utils;

/**
 * Created by 楊遠徵 on 2020/12/3.
 */

public class SmsRelayerManager {
    /**
     * 发送短信至目标手机号
     * @param dataManager
     * @param content      短信内容
     */
    public static void relaySms(SharedPreferenceUtil dataManager, String content) {
        String objectMobile = dataManager.getObjectMobile();
        android.telephony.SmsManager smsManager = android.telephony.SmsManager.getDefault();
        smsManager.sendTextMessage(objectMobile, null, content, null, null);
    }
}
