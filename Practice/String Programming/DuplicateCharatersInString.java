package com.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DuplicateCharatersInString {

	/**
	 * This method will print duplicate characters in a String conventionally.
	 * 
	 * @param str
	 * @return
	 */
	public static void printDuplicateCharactersConventional(String str) {
		char charArray[] = str.toCharArray();
		int iterations = 0;
		List<Character> duplicateCharacters = new ArrayList<Character>();
		System.out.print("Duplicates : ");
		for (int i = 0; i < charArray.length; i++) {
			iterations++;
			for (int j = i + 1; j < charArray.length; j++) {
				iterations++;
				if (charArray[i] == charArray[j]
						&& duplicateCharacters.contains(charArray[i]) == false) {
					duplicateCharacters.add(charArray[i]);
					System.out.print(charArray[i] + "  ");
					break;
				}
			}
		}
		System.out.println();
		System.out.println("Number of iterations :" + iterations);
	}

	/**
	 * This method will print duplicate characters in a String.
	 * 
	 * @param str
	 * @return
	 */
	public static void printDuplicateCharacters(String str) {
		char charArray[] = str.toCharArray();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for (Character ch : charArray) {
			if (charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch) + 1);
			} else {
				charMap.put(ch, 1);
			}
		}
		Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
		System.out
				.printf("List of duplicate characters in String '%s' %n", str);
		for (Map.Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.printf("%s : %d %n", entry.getKey(),
						entry.getValue());
			}
		}
	}

	public static void main(String args[]) {
		printDuplicateCharactersConventional("avbdsdooooofdgdfsgdfgsdfgdfsgsdfgdfsgsdgfdsfgdsdfgdfhfdhfdhfhadvbdsdooooofdgdfsgdfgsdfgdfsgsdfgdfsgsdgfdsfgdsdfgdfhfdhfdhfhadvbdsdooooofdgdfsgdfgsdfgdfsgsdfgdfsgsdgfdsfgdsdfgdfhfdhfdhfhadvbdsdooooofdgdfsgdfgsdfgdfsgsdfgdfsgsdgfdsfgdsdfgdfhfdhfdhfhadvbdsdooooofdgdfsgdfgsdfgdfsgsdfgdfsgsdgfdsfgdsdfgdfhfdhfdhfhadvbdsdooooofdgdfsgdfgsdfgdfsgsdfgdfsgsdgfdsfgdsdfgdfhfdhfdhfhadvbdsdooooofdgdfsgdfgsdfgdfsgsdfgdfsgsdgfdsfgdsdfgdfhfdhfdhfhadvbdsdooooofdgdfsgdfgsdfgdfsgsdfgdfsgsdgfdsfgdsdfgdfhfdhfdhfhadvbdsdooooofdgdfsgdfgsdfgdfsgsdfgdfsgsdgfdsfgdsdfgdfhfdhfdhfhadvbdsdooooofdgdfsgdfgsdfgdfsgsdfgdfsgsdgfdsfgdsdfgdfhfdhfdhfhadvbdsdooooofdgdfsgdfgsdfgdfsgsdfgdfsgsdgfdsfgdsdfgdfhfdhfdhfhadvbdsdooooofdgdfsgdfgsdfgdfsgsdfgdfsgsdgfdsfgdsdfgdfhfdhfdhfhadvbdsdooooofdgdfsgdfgsdfgdfsgsdfgdfsgsdgfdsfgdsdfgdfhfdhfdhfhadvbdsdooooofdgdfsgdfgsdfgdfsgsdfgdfsgsdgfdsfgdsdfgdfhfdhfdhfhadvbdsdooooofdgdfsgdfgsdfgdfsgsdfgdfsgsdgfdsfgdsdfgdfhfdhfdhfhadvbdsdooooofdgdfsgdfgsdfgdfsgsdfgdfsgsdgfdsfgdsdfgdfhfdhfdhfhadvbdsdooooofdgdfsgdfgsdfgdfsgsdfgdfsgsdgfdsfgdsdfgdfhfdhfdhfhadvbdsdooooofdgdfsgdfgsdfgdfsgsdfgdfsgsdgfdsfgdsdfgdfhfdhfdhfhadvbdsdooooofdgdfsgdfgsdfgdfsgsdfgdfsgsdgfdsfgdsdfgdfhfdhfdhfhadvbdsdooooofdgdfsgdfgsdfgdfsgsdfgdfsgsdgfdsfgdsdfgdfhfdhfdhfhadvbdsdooooofdgdfsgdfgsdfgdfsgsdfgdfsgsdgfdsfgdsdfgdfhfdhfdhfhadvbdsdooooofdgdfsgdfgsdfgdfsgsdfgdfsgsdgfdsfgdsdfgdfhfdhfdhfhadvbdsdooooofdgdfsgdfgsdfgdfsgsdfgdfsgsdgfdsfgdsdfgdfhfdhfdhfhad");
		printDuplicateCharacters("avbdsdooooofdgdfsgdfgsdfgdfsgsdfgdfsgsdgfdsfgdsdfgdfhfdhfdhfhadvbdsdooooofdgdfsgdfgsdfgdfsgsdfgdfsgsdgfdsfgdsdfgdfhfdhfdhfhadvbdsdooooofdgdfsgdfgsdfgdfsgsdfgdfsgsdgfdsfgdsdfgdfhfdhfdhfhadvbdsdooooofdgdfsgdfgsdfgdfsgsdfgdfsgsdgfdsfgdsdfgdfhfdhfdhfhadvbdsdooooofdgdfsgdfgsdfgdfsgsdfgdfsgsdgfdsfgdsdfgdfhfdhfdhfhadvbdsdooooofdgdfsgdfgsdfgdfsgsdfgdfsgsdgfdsfgdsdfgdfhfdhfdhfhadvbdsdooooofdgdfsgdfgsdfgdfsgsdfgdfsgsdgfdsfgdsdfgdfhfdhfdhfhadvbdsdooooofdgdfsgdfgsdfgdfsgsdfgdfsgsdgfdsfgdsdfgdfhfdhfdhfhadvbdsdooooofdgdfsgdfgsdfgdfsgsdfgdfsgsdgfdsfgdsdfgdfhfdhfdhfhadvbdsdooooofdgdfsgdfgsdfgdfsgsdfgdfsgsdgfdsfgdsdfgdfhfdhfdhfhadvbdsdooooofdgdfsgdfgsdfgdfsgsdfgdfsgsdgfdsfgdsdfgdfhfdhfdhfhadvbdsdooooofdgdfsgdfgsdfgdfsgsdfgdfsgsdgfdsfgdsdfgdfhfdhfdhfhadvbdsdooooofdgdfsgdfgsdfgdfsgsdfgdfsgsdgfdsfgdsdfgdfhfdhfdhfhadvbdsdooooofdgdfsgdfgsdfgdfsgsdfgdfsgsdgfdsfgdsdfgdfhfdhfdhfhadvbdsdooooofdgdfsgdfgsdfgdfsgsdfgdfsgsdgfdsfgdsdfgdfhfdhfdhfhadvbdsdooooofdgdfsgdfgsdfgdfsgsdfgdfsgsdgfdsfgdsdfgdfhfdhfdhfhadvbdsdooooofdgdfsgdfgsdfgdfsgsdfgdfsgsdgfdsfgdsdfgdfhfdhfdhfhadvbdsdooooofdgdfsgdfgsdfgdfsgsdfgdfsgsdgfdsfgdsdfgdfhfdhfdhfhadvbdsdooooofdgdfsgdfgsdfgdfsgsdfgdfsgsdgfdsfgdsdfgdfhfdhfdhfhadvbdsdooooofdgdfsgdfgsdfgdfsgsdfgdfsgsdgfdsfgdsdfgdfhfdhfdhfhadvbdsdooooofdgdfsgdfgsdfgdfsgsdfgdfsgsdgfdsfgdsdfgdfhfdhfdhfhadvbdsdooooofdgdfsgdfgsdfgdfsgsdfgdfsgsdgfdsfgdsdfgdfhfdhfdhfhadvbdsdooooofdgdfsgdfgsdfgdfsgsdfgdfsgsdgfdsfgdsdfgdfhfdhfdhfhad");

	}

}
