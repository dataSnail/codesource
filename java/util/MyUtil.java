package com.made.util;

public class B2bUtil {
	/**
	 * 判断字符串是否为数字
	 * @param str
	 * @return
	 */
	public static boolean isNum(String str){
        return str.matches("^[-+]?(([0-9]+)([.]([0-9]+))?|([.]([0-9]+))?)$");
    }
	
	/**
	 * 判断字符串是否为空
	 * @param str
	 * @return
	 */
	public static boolean isNull(String str)
	{
		return str==null||str.length()<=0||str.equals("");
	}
	
	public static void main(String [] args)
	{
		String s = "--请选择--";
		System.out.println(isNum(s));
	}
}
