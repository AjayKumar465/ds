package com.aj;

import java.util.Arrays;

public class Anagram {
	 public static boolean isAnagram(String a,String b)
	    {
	        char[] s1CharArr = a.toCharArray();
	        Arrays.sort(s1CharArr);
	        char[] s2CharArr = b.toCharArray();
	         Arrays.sort(s2CharArr); 
	       return new String(s1CharArr).equals(new String(s2CharArr));
	        
	    }
}
