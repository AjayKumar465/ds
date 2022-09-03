package com.aj;

public class ReArrangeArrayAlternate {

	public void reArrange(int[] arr) {
		int[] temp = arr.clone();
		int small =0;
		int large = arr.length-1;
		boolean flag = true;
		for(int i=0;i<arr.length;i++) {
			if(flag) {
				arr[i] = temp[large--]; 
			}else {
				arr[i] = temp[small++];
			}
			flag = !flag;
		}
	}
}
