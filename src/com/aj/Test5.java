package com.aj;



public class Test5 {
	static Float a = Float.valueOf("3.0");
	static double b = a.doubleValue();
	static byte c = a.byteValue();
	static long d = a.longValue();
	public static void main(String[] args) {
		
		System.out.println((a+b+c+d));
	}
	
	
}
