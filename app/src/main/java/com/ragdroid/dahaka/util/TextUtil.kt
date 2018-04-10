package com.ragdroid.dahaka.util

/**
 * To be able to easily test Presenters.
 *
 * Created by garimajain on 13/08/17.
 */
object TextUtil {

    fun isEmpty(string: String?): Boolean {
        return string == null || string.replace(" ", "").length == 0
    }

}//utility class
