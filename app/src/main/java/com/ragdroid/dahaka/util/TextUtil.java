package com.ragdroid.dahaka.util;

/**
 * To be able to easily test Presenters.
 *
 * Created by garimajain on 13/08/17.
 */
public class TextUtil {

    private TextUtil() {
        //utility class
    }

    public static boolean isEmpty(String string) {
        return string == null || string.replace(" ", "").length() == 0;
    }

}
