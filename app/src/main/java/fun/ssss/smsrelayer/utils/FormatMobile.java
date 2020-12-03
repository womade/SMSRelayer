package fun.ssss.smsrelayer.utils;

/**
 * Created by 楊遠徵 on 2020/12/3.
 */

public class FormatMobile {

    public static Boolean hasPrefix(String mobile){
        return mobile.startsWith("+86");
    }

    public static String formatMobile(String mobile){
        return mobile.substring(3);
    }
}
