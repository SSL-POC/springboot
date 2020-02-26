package com.erp.util;

public class Test {

	public static void main(String args[]) {
		String name = "John Stanley";
		String[] split = name.split(" ");
		
		System.out.println("Fist Value ----:"+split[0]);
		System.out.println("Second value--->"+split[1]);
		
		String str = "a1?2.33/4tyz.7!8x Nos 10 Meter ";
		str = str.replaceAll("\\D", "");
		System.out.println("Interger Only ----:"+str);
		
	}
}
