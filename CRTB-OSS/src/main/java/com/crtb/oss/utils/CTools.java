package com.crtb.oss.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CTools {
	private static final SimpleDateFormat format = new SimpleDateFormat(
			"yyyy-MM-dd HH:mm:ss");
	
	public static String dateToString(Date date) {

		return format.format(date);
	}

	public static String dateToString(long time) {

		return format.format(time);
	}
}
