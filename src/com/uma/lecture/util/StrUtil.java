package com.uma.lecture.util;

        import org.jetbrains.annotations.Contract;

/**
 * Catigeart
 * GitHub: https://github.com/Catigeart
 * Date: 20:16 2021/1/16
 */
public class StrUtil {

    public static boolean hasLength(String str) {
        return str != null && str.length() > 0;
    }

    public static String removeNull(String str) { return str != null ? str : ""; }

}
