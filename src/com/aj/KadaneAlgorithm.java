package com.aj;

public class KadaneAlgorithm {

	static long findSumOfCongiousSubArr(int[] A){
		long max_sum=Integer.MIN_VALUE, max_sum_end_here= 0;
		
		for(int i=0;i<A.length;i++) {
				max_sum_end_here+=A[i];
			
			if(max_sum_end_here>max_sum) {
				max_sum = max_sum_end_here;
			}
			
			if(max_sum_end_here<0) {
				max_sum_end_here = 0;
			}
		}
		
		return max_sum;
		
	}
	public static void main(String[] args) {
		System.out.println(findSumOfCongiousSubArr(new int[]{-1,-2,-3,-4}));
	}
}
