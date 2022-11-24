package week1.day4;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome to chennai";


		char search='e';
		int count=0;
		char[] CharArray = str.toCharArray();
		for(int i=0; i<CharArray.length; i++) {
			if(CharArray[i]==search) {
				count++;
			}
		}
		System.out.println(count);


	}

}
