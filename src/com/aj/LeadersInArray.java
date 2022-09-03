package com.aj;

import java.util.ArrayList;

/*
  Given an array A of positive integers. Your task is to find the leaders in the array.
   An element of array is leader if it is greater than or equal 
  to all the elements to its right side. The rightmost element is always a leader. 

Example 1:

Input:
n = 6
A[] = {16,17,4,3,5,2}
Output: 17 5 2
Explanation: The first leader is 17 
as it is greater than all the elements
to its right.  Similarly, the next 
leader is 5. The right most element 
is always a leader so it is also 
included.
 * 
 * 
 * 
 * */
public class LeadersInArray {

	
	public static ArrayList<Integer> findLeaders(int[] arr,int n){
		ArrayList<Integer> leaderElements = new ArrayList<>();
	       int max_from_right = arr[n-1];
	       leaderElements.add(max_from_right);
	       for(int i=n-2;i>=0;i--){
	           if(arr[i]>=max_from_right){
	               max_from_right = arr[i];
	              leaderElements.add(max_from_right);
	           }
	       }
	       ArrayList<Integer> rev= new ArrayList<>();
	      for(int j=leaderElements.size()-1;j>=0;j--)
	      {
	          rev.add(leaderElements.get(j));
	      }
	       return rev;
		
	}
	
	public static void main(String[] args) {
		System.out.println(findLeaders(new int[]{16,17,4,3,5,2}, 6));
	}
}
