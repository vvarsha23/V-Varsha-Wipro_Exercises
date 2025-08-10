package com.wipro.junitday1;

public class StringUtil {
	public static boolean isUpperCase(String str) {
        if (str == null || str.isEmpty()) return false;
        return str.equals(str.toUpperCase());
    }

}
