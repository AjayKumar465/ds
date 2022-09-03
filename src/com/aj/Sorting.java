package com.aj;

public class Sorting {
 public static void main(String[] args) {
	int[] input =  {23,4,2,234,22};
	for(int i=0;i<input.length;i++) {
		for(int j=i+1;j<input.length;j++) {
			if(input[i]>input[j]) {
				int temp = input[i];
				input[i] = input[j];
				input[j]=temp;
			}
		}
	}
	System.out.println();
	
}
}
