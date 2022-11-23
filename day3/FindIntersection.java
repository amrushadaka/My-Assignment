package week1.day3;

public class FindIntersection {
	
	public static void main(String[] args) {
		
		//a) Declare An array for {3,2,11,4,6,7};	 
		// * b) Declare another array for {1,2,8,4,9,7};
		int array1[]={3,2,11,4,6,7};
		int array2[]={1,2,8,4,9,7};
		
		//c) Declare for loop iterator from 0 to array length
		// * d) Declare a nested for another array from 0 to array length
	
		int length1 = array1.length;
		int length2 = array1.length;
		
		// e) Compare Both the arrays using a condition statement
		
		
		for(int i=0; i<length1; i++) {
		 for(int j=0; j<length2; j++) {
		 
		 
		if( array1[i] == array2[j] ) {
			 // f) Print the first array (shoud match item in both arrays)
			System.out.println("shoud match item in both arrays:" +(array1[i]));
	}
 
}
		}
		
	}
}
