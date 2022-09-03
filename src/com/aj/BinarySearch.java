package com.aj;
// Java implementation of recursive Binary Search
class BinarySearch {
  
    // Driver method to test above
    public static void main(String args[])
    {
        BinarySearch ob = new BinarySearch();
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "
                               + result);
    }

	private int binarySearch(int[] arr, int startIndex, int endIndex, int searchElement) {
		if(endIndex>startIndex) {
			int mid = startIndex+(endIndex-startIndex)/2;
			if(arr[mid]==searchElement) {
				return mid;
			}
			
			
			if(arr[mid]>searchElement) {
				return binarySearch(arr, startIndex, mid-1, searchElement);
			}
			
			return binarySearch(arr, mid+1,endIndex, searchElement);
					
		}
		return -1;
	}
}