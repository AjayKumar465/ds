package com.aj;

import java.util.Arrays;
import java.util.List;

public class RomanToDecimals {

	public int romanToDecimal(String str) {
		List<Character> romanChars = Arrays.asList('I', 'V', 'X', 'L', 'C', 'D', 'M');
		int[] nosForRomanChars = { 1, 5, 10, 50, 100, 500, 1000 };
		int sum = nosForRomanChars[romanChars.indexOf(str.charAt(str.length() - 1))];
		for (int i = str.length() - 2; i >= 0; i--) {
			if (nosForRomanChars[romanChars.indexOf(str.charAt(i))] < nosForRomanChars[romanChars
					.indexOf(str.charAt(i + 1))])
				sum = sum - nosForRomanChars[romanChars.indexOf(str.charAt(i))];
			else
				sum = sum + nosForRomanChars[romanChars.indexOf(str.charAt(i))];
		}
		return sum;

	}
}
