package week3day1assignment;

import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		
		int[] arr={1,1,3,4,7,8,6,10,2,9};
		Set<Integer> unique = new TreeSet<Integer>();
		for (Integer number : arr) 
		{
			unique.add(number);
		}
		System.out.println(unique);
		
		int arr1 = 0;
		int arr2=0 ;
		for(Integer number: unique) 
		{
			int nextnumber = arr1 + 1;
			if (nextnumber != number) 
			{
				arr2 = nextnumber;
				break;
			}
			arr1 = number;
		}
		System.out.println("Missing number: " + arr2);
	}


	}

