package com.practice;

public class PalindromeString {

	/**
	 * This method will return true for palindrome string. Algorithm based on
	 * breaking string into two half, reversing the second half and comparing
	 * them.
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isPalindrome(String str) {
		int len = str.length();
		int startIndex = len - 1;
		int endIndex = getEndIndex(len);
		String originalString = str.substring(0, len / 2);
		String reverseString = "";
		for (int i = startIndex; i > endIndex; i--) {
			reverseString = reverseString + str.charAt(i);
		}
		// printDetails(len, startIndex, endIndex, originalString,
		// reverseString);

		return (originalString.equals(reverseString)) ? true : false;
	}

	/**
	 * This method return endIndex based on length is a even number and odd
	 * number.
	 * 
	 * @param length
	 * @return
	 */
	public static int getEndIndex(int length) {
		return (length % 2 == 0) ? (length / 2 - 1) : (length / 2);
	}

	public static String getLargestPalindrome(String str) {
		String subString = "";
		String largestString = null;
		int noOfCombinations = 0;
		int largest = 0;
		if (str.length() >= 2) {
			for (int i = 0; i < str.length(); i++) {

				subString = subString + str.charAt(i);
				for (int j = i + 1; j < str.length(); j++) {
					subString = subString + str.charAt(j);
					noOfCombinations++;
					System.out.println("Substring " + noOfCombinations + " : "
							+ subString);
					if (isPalindrome(subString) && largest < subString.length()) {
						largest = subString.length();
						largestString = subString;
					}
				}
				subString = "";
			}
		} else {
			largestString = "String is not eligible for palindrome check";
		}
		System.out.println("Combinations : " + noOfCombinations);
		return largestString;
	}

	/**
	 * To print details only.
	 * 
	 * @param len
	 * @param startIndex
	 * @param endIndex
	 * @param orig
	 * @param rev
	 */
	public static void printDetails(int len, int startIndex, int endIndex,
			String orig, String rev) {
		System.out.println("Length : " + len);
		System.out.println("startIndex : " + startIndex + "  " + "endIndex : "
				+ endIndex);
		System.out.println("Original String Half : " + orig + "Reverse Half : "
				+ rev);
	}

	public static void main(String args[]) {
		System.out
				.println(getLargestPalindrome("fdhghjtyiuokiukannakldsfgsdgtrytrw"
						+ ""));

	}

}
