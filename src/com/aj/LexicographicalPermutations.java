package com.aj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LexicographicalPermutations {
	 ArrayList<String> ans=new ArrayList<>();
	    public List<String> find_permutation(String S) {
	        solvePerm(S,"");
	       Collections.sort(ans);
	       return ans;
	    }
	    
	     void solvePerm(String str,String asf){
	        if(str.length()==0){
	            ans.add(asf);
	            return;
	        }
	        
	        for(int i=0;i<str.length();i++){
	            char chr=str.charAt(i);
	            String left=str.substring(0,i);
	            String right=str.substring(i+1);
	            solvePerm(left+right,asf+chr);
	        }
	    }
	     public static void main(String[] args) {
			System.out.println(new LexicographicalPermutations().find_permutation("ABC"));
		}
}
