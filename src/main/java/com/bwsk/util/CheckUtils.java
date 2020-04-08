package com.bwsk.util;

public class CheckUtils {

	/**
	 * 验证字符串
	 * 
	 * @param str
	 * @return
	 */
	public static boolean checkString(String str) {
		if (str != null && !str.equals("")) {
			return true;
		} else {
			return false;
		}
	}
}
