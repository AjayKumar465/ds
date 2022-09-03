package com.aj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class Test {

	public static void main(String args[]) {

	HashMap<String,String> map = new HashMap<>();
	map.put("y", "z");
	map.put("x", "z");
	map.put("z", "a");
	map.entrySet().stream().sorted(Map.Entry.<String,String>comparingByValue().reversed()
			.thenComparing(Map.Entry.comparingByValue())) .forEach(System.out::println);
	System.out.println(map);
	System.out.println(IntStream.of(1,2,3,4,5).average().getAsDouble());
     System.out.println("ABC".substring(1));
	}
	
	public void temp() {
		Parent obj1 = new Child();
		Parent obj2 = new Child();
		obj1.PrintData();
		obj2.PrintData();
		obj1.name = "Teja";
		Child c = (Child) obj1;

		c.age = 48;
		System.out.println(c.name + " : " + c.age);

		System.out.println(IntStream.range(0, 100).parallel().findAny());
		System.out.println(IntStream.range(0, 100).parallel().findFirst());
		findPermutations("ABC");
   System.out.println(remove("abccbccba"));
   HashSet<Integer> map = new HashSet<>();
  
   map.add(1);
	}
	
	public static int bs(int[] arr, int startIndex, int endIndex, int searchElement) {
		int mid = startIndex + (endIndex-startIndex)/2;
		if(arr[mid] == searchElement) {
			return mid;
		}
		
		if(arr[mid]>searchElement) {
			return bs(arr,startIndex,mid-1,searchElement);
		}else {
			return bs(arr,mid+1,endIndex,searchElement);
		}
	}
	

	public static void findPermutations(String input) {
		List<String> permutations = new ArrayList<>();
		 List<Character> romanChars = Arrays.asList('I','V','X','L','C','D','M');
		 romanChars.indexOf(romanChars);
		solvePermutation(input, "", permutations);
		Collections.sort(permutations);
		System.out.println(permutations);

	}

	public static void solvePermutation(String s1, String s2, List<String> permutations) {
		if (s1.length() == 0) {
			permutations.add(s2);
			return;
		}

		for (int i = 0; i < s1.length(); i++) {
			char charFromS1 = s1.charAt(i);
			String left = s1.substring(0, i);
			String right = s1.substring(i + 1);
			solvePermutation(left + right, s2 + charFromS1, permutations);
		}
		
		
	}
	
	public static String  longestPalindrom(String s) {
		
		
		for(int i=0;i<s.length();i++) {
			String p = s.substring(i);
			if(p.length() ==1) {
				return String.valueOf(s.charAt(0));
			}
			if(isPalindorme(p)) {
				return p;
			}
		}
		
		return null;
		
	}
	
	public static boolean isPalindorme(String s) {
		String result = "";
		int j = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			if(s.charAt(j++)!=s.charAt(i)) {
				return false;
			}
		}
		return true;
	}
	
	static String remove(String s) {
	      
	      String resultString = "";
	      int duplicatStrStartIndex=0,duplicatStrEndIndex=1;
	      
	      for(int i=1;i<s.length();i++){
	           int startIndex = i-1;
	           int endIndex = i;
	          while(startIndex>=0&&endIndex<s.length() && s.charAt(startIndex) == s.charAt(endIndex)){
	              if(endIndex-startIndex+1>duplicatStrEndIndex){
	                  duplicatStrStartIndex = startIndex;
	                  duplicatStrEndIndex = endIndex-startIndex+1;
	              }
	           startIndex --;
	           endIndex++;
	          }
	          startIndex = i-1;
	          endIndex = i+1;
	           while(startIndex>=0&&endIndex<s.length() && s.charAt(startIndex)  == s.charAt(i)  && s.charAt(startIndex) == s.charAt(endIndex)){
	              if(endIndex-startIndex+1>duplicatStrEndIndex){
	                  duplicatStrStartIndex = startIndex;
	                  duplicatStrEndIndex = endIndex-startIndex+1;
	              }
	           startIndex --;
	           endIndex++;
	          }
	      }
	      
	      if(duplicatStrStartIndex == 0 && duplicatStrEndIndex ==1){
	          return s;
	      }
	      s = s.substring(0,duplicatStrStartIndex)+s.substring(duplicatStrStartIndex+duplicatStrEndIndex);
	      
	      return remove(s);
	      
	      
	      
	    }

	static class Parent {
		String name;

		void PrintData() {
			System.out.println("method of parent class");
		}
	}

	static class Child extends Parent {
		int age;

		void PrintData() {
			System.out.println("method of child class");
		}
	}
}
