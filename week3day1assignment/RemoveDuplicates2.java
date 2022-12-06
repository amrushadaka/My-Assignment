package week3day1assignment;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Declare a String as PayPal India

//		Convert it into a character array

//		Declare a Set as charSet for Character

//		Declare a Set as dupCharSet for duplicate Character

//		Iterate character array and add it into charSet

//		if the character is already in the charSet then, add it to the dupCharSet

//		Check the dupCharSet elements and remove those in the charSet

//		Iterate using charSet

//		Check the iterator variable isn't equals to an empty space

//		print it
		String s="PayPal";
		char[] charArray = s.toCharArray();
		Set<Character> charSet=new HashSet<Character>();
		Set<Character> dupCharSet=new HashSet<Character>();
		for(Character ch:charArray) {
			charSet.add(ch);
		}
		for(Character ch1:charSet)
		{
			dupCharSet.add(ch1);
		}
		 for(int i = 0; i < charSet.size(); i++) {  
		        for(int j = 0; j < dupCharSet.size(); j++) {  
		            if(charArray[i] == charArray[j])  
		            {
		            	charSet.remove(charArray[i]);
		            }    
		        } 
		    }  
		System.out.println("After removing duplicates are---");
		System.out.println(charSet);
		

	}

}
	


