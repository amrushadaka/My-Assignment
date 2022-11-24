package week1.day4;

public class StringMethods {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		String str = "TestLeaf";
		
		
		char[] CharArray = str.toCharArray();
		
		for(int i=CharArray.length-1; i>=0; i--) {
			System.out.println(CharArray[i]);
	}

}
}