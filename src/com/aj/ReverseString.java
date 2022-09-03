package com.aj;

public class ReverseString {
static String reverse(String input) {
	String result[]  = input.split("\\.");
	
	 String ss = "";
	for(int i= result.length-1;i>=0;i--) {
		ss =ss+"."+result[i];
	}
	ss = ss.substring(1,ss.length());
	System.out.println(ss);
	return ss;
}

public static void main(String[] args) {
	//reverse("ajay.k");
	System.out.println("ABC".substring(2,3));
}
}
