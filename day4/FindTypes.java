package week1.day4;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "$$ Welcome to 2nd Class of Automation $$ ";

		int letter = 0;
		int	space = 0; 
		int	num = 0; 
		int	specialChar = 0;

		char[] CharArray = test.toCharArray();
		for( int i=0; i<CharArray.length; i++) 
		{
			if(Character.isLetter(CharArray[i])) 
			{
				letter++;
			}
			else if(Character.isDigit(CharArray[i]))
			{
				num++;
			}
			else if(Character.isSpaceChar(CharArray[i]))
			{
				space++;
			}
			else 
			{
				specialChar++;
			}
		}

		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);


	}

}
