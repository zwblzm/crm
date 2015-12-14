package cn.aurora.crm.common.utils;

import java.text.DecimalFormat;


public class FormatUtils {
	public static String formatPrice(Double price) {
		DecimalFormat format = new DecimalFormat(".00");
		String money = format.format(price);
		return money;
	}
}
