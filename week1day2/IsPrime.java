package week1day2;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 127;
	    boolean prime = false;
	    
	    for (int i = 3; i <= num ; i++) {
	     
	    	  if (num % i == 0) {
	       prime = true;
	   
	      }
	    }

	   if (prime)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
	  
	}

}
