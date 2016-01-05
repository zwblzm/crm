package cn.aurora.crm.common.utils;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class FormatUtils {
	public static String formatPrice(Double price) {
		DecimalFormat format = new DecimalFormat(".00");
		String money = format.format(price);
		return money;
	}
	
	public static String formatDate(Long date) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String time = format.format(new Date(date));
		return time;
	}
}
