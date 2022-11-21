package week1.day1;

public class Mobile 

{
			public void makeCall() {
			System.out.println("Please makecall");
		}
		
			public void	sendMsg()	{
		System.out.println("SendMsg to Manu ");
	}

	public static void main(String[] args) {
		
		
		Mobile obj = new Mobile();
		obj.makeCall();
		obj.sendMsg();
	}
}
