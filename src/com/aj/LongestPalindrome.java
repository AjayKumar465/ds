package com.aj;

public class LongestPalindrome {

	static String longestPalin(String S){
	      
        // code here
        int size=S.length();
        int  startIndex,endIndex;
        int palStart=0,palEnd=1;
        for(int i=0;i<size;i++){
            startIndex=i-1;
            endIndex=i;
            while(startIndex>=0 && endIndex<size && S.charAt(startIndex)==S.charAt(endIndex)){
                if(endIndex-startIndex+1>palEnd){
                    palStart=startIndex;
                    palEnd=endIndex-startIndex+1;
                }
                startIndex--;
                endIndex++;
            }
            startIndex=i-1;
            endIndex=i+1;
            while(startIndex>=0 && endIndex<size && S.charAt(startIndex)==S.charAt(endIndex)){
                if(endIndex-startIndex+1>palEnd){
                    palStart=startIndex;
                    palEnd=endIndex-startIndex+1;
                }
                startIndex--;
                endIndex++;
            }
        
        }
            return S.substring(palStart,palStart+palEnd);
            
    }
	public static void main(String[] args) {
		System.out.println(longestPalin("abccbccba"));
	}
    
}
