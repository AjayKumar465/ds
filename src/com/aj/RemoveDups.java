package com.aj;

import java.util.HashMap;

public class RemoveDups {

	 String removeDups(String s) {
	       HashMap<Character, Boolean> hmp = new HashMap<>();
	       String str = "";
	       for (int i = 0; i < s.length(); i++) {
	           if (hmp.get(s.charAt(i)) == null) {
	               str += s.charAt(i);
	               hmp.put(s.charAt(i), true);
	           }
	       }
	       return str;
	    }
}
