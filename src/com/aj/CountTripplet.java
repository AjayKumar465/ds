package com.aj;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountTripplet {

	//standard soulution
	int count(int[] A) {
		int N = A.length;
		int count = 0;
		Arrays.sort(A);
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				for (int k = j + 1; k < N; k++) {
					if (A[i] + A[j] == A[k]) {
						count++;
					}
				}
			}
		}
		return count;
	}
	//high perfomance
	 int countTriplet(int[] arr, int n) {
		    List<Integer> set= Arrays.stream(arr).boxed().toList();
	       int count=0;
	       for(int i=0;i<n;i++)
	       {
	           set.add(arr[i]);
	       }
	       for(int i=0;i<n;i++)
	       {
	           for(int j=i+1;j<n;j++)
	           {
	               int sum=arr[i]+arr[j];
	               if(set.contains(sum))
	               {
	                   count++;
	               }
	           }
	       }
	      return count;     
	   }
	    

	public static void main(String[] args) {
		System.out.println(new CountTripplet().count(new int[] { 12, 8, 2, 11, 5, 14, 10 }));
	}
}
