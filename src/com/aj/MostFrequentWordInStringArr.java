package com.aj;

import java.util.HashMap;

public class MostFrequentWordInStringArr {
	static String mostFrequentWord(String[] arr) {
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}
		
		Integer max = Integer.MIN_VALUE;
		String word = null;
		for (int i = 0; i < arr.length; i++) {
			if(map.get(arr[i])>=max) {
				max = map.get(arr[i]);
				word = arr[i];
			}
		}
		return word;
	}
	
	public static void main(String[] args) {
		System.out.println(mostFrequentWord(new String[] {"geeks","for","geekss"}));
	}
}
