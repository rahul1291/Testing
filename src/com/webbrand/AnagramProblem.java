package com.webbrand;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class AnagramProblem {

	  private static Set<String> wordSet = new HashSet<String>();

	public static void main(String args[]) {

	   Scanner sc = new Scanner(System.in);
	   String input = sc.nextLine();
	
	   permuteString(input, 0);
		for(String word:wordSet){
		System.out.println(word);
		}
		}

		public static void permuteString(String word, int start) {

		char[] charArray = word.toCharArray();

		for (int i = start; i < word.length(); i++) {

		permuteString(swap(start, i, charArray), start + 1);

		}

		}

		public static String swap(int index1, int index2, char[] charArray) {

		char temp = charArray[index1];

		charArray[index1] = charArray[index2];

		charArray[index2] = temp;

		String result = new String(charArray);

		wordSet.add(result);

		return result;

		}
}

