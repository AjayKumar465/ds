package com.aj;

public class SubArrWithGivenSum {

	public static void find(int[] arr, int sum) {
		int tempSum = 0;
		int startIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			tempSum += arr[i];
			while (tempSum > sum) {
				tempSum -= arr[startIndex];
				startIndex++;
			}
			if(i==37) {
				System.out.println(i);
			}
			if (sum == tempSum) {
				System.out.println(startIndex + " : " + i);
				break;
			}

		}
	}

	public static void main(String[] args) {
		int[] input = { 135,101,170,125,79,159,163,65,106,146,82,28,162,92,196,143,28,37,192,5,103,154,93,183,22,117,119,96,48,127,172,139,70,113,68,100,36,95,104,12,123,134 };
		
		find(input, 468);
	}
}
