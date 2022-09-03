package com.aj;

import java.util.Arrays;

public class MergeAndSortTwoArrs {

	 public static void merge(long arr1[], long arr2[], int n, int m) 
	    {
	     int i=0,j=0,k=n-1;
	     while(i<=k && j<m){
	         if(arr1[i]<arr2[j]){
	             i++;
	         }else{
	             long temp = arr2[j];
	             arr2[j] = arr1[k];
	             arr1[k] = temp;
	             j++;
	             k--;
	         }
	     }
	     
	     Arrays.sort(arr1);
	     Arrays.sort(arr2);
	    }
	 
	public static void main(String[] args) {
		merge(new long[] {1,3,5,2}, new long[] {0,12,6,8,9}, 4, 5);
		
		
	}
	
	 void rearrange(long[] arr, int n) 
	    { 
	    	
	    arr.clone();
	  
	    }
	 
}
