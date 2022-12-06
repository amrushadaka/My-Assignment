package week3day1assignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PrintUniqueCharacter
		/*
		 * Problem
		 * 
		 * a) Take your name as input
		 * b) Print all unique characters only (any order)
		 * 
		 * Input:  babu
		 * Output: a u 
		 * 
		 */

		/*
		 * Psuedocode
		 * 
		 * a) Convert String to Character array
		 * b) Create a new Set -> HashSet
		 * c) Add each character to the Set and if it is already there, remove it
		 * d) Finally, print the set
		 * 
		 */
		String name = "amrusha";
		char[] charArray = name.toCharArray();

		Set<Character> duplicate = new LinkedHashSet<Character>();
		Set<Character> charSet = new LinkedHashSet<Character>();
		for (Character ch : charArray) 
		{
			if(!charSet.add(ch)) {
				duplicate.add(ch);
			}
		}
		for (Character ch : charArray) 
		{
			if(duplicate.contains(ch))
			{
				charSet.remove(ch);
			}
		}
		System.out.println(charSet);
	}

}
