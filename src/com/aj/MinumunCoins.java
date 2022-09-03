package com.aj;
import java.util.ArrayList;

public class MinumunCoins {
	// All denominations of Indian Currency
    static int deno[] = {1, 2, 5, 10, 20,
    50, 100, 500, 1000};
    static int n = deno.length;
 
    static void findMin(int V)
    {
    	ArrayList<Integer> minCoins = new ArrayList<>();
       for(int i=n-1;i>=0;i--) {
    	   while(V>=deno[i]) {
    		   V = V-deno[i];
    		   minCoins.add(deno[i]);
    	   }
       }
       System.out.println(minCoins);
    }
 
    // Driver code
    public static void main(String[] args)
    {
        int n = 93;
        System.out.print(
            "Following is minimal number "
            +"of change for " + n + ": ");
        findMin(n);
    }
}
