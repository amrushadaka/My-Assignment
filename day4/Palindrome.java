package week1.day4;

public class Palindrome {


	public static void main(String[] args) {

		String val="madam";
		String rev="";

		char[] CharArray = val.toCharArray();

		for(int i=CharArray.length-1; i>=0; i--)

		{
			rev=rev+CharArray[i];
		}
		System.out.println(rev);
		if(val.equals(rev))  {
			System.out.println("it is palindrome");
		}
		else {
			System.out.println("not a palindrome");

		}

	}
}

