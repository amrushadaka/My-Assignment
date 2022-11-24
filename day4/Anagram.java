package week1.day4;

import java.util.Arrays;

public class Anagram {


	
		public static void main(String[] args) {
			String text1="stops";
			String text2="posts";
			int val1=text1.length();
			int val2=text2.length();
			System.out.println(val1);
			System.out.println(val2);
			if(val1==val2) {
				char[] CharArray1 = text1.toCharArray();
				char[] CharArray2 = text2.toCharArray();
				
				
			
			Arrays.sort(CharArray1);
	        Arrays.sort(CharArray2);
	       boolean result=Arrays.equals(CharArray1,CharArray2);
	        
			if(result) {
			System.out.println("Is Anagram");
			}
			else {
				System.out.println("Is not Anagram");
			}
		}

	}
}

