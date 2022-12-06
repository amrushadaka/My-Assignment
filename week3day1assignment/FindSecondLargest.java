package week3day1assignment;

import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				int[] data = {3,2,11,4,6,7,2,3,3,6,7};
				Set<Integer> obj = new TreeSet<Integer>();
				for (Integer inputs : data) 
				{obj.add(inputs);
				}
				System.out.println(obj);
				int size = obj.size();
				System.out.println("size of set : "+size);
				Object[] array = obj.toArray();
				Object object = array[array.length-2];
				System.out.println("second largest number : " +object);
			}
		

	}


