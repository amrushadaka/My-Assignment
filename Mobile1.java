package week1.day1;

public class Mobile1 {


    	char mobileLogo='$';
		short noOfMobilePiece=2;
		int modelNumber=1234567890;
		float mobilePrice=2567.6f;
		boolean isDamaged=false;
	 
		public static void main(String[] args) {
			Mobile1  obj = new Mobile1();
			
			char mobileLogo=obj.mobileLogo;
			System.out.println(mobileLogo);
			short noOfMobilePiece=obj.noOfMobilePiece;
			System.out.println(noOfMobilePiece);
			int modelNumber=obj.modelNumber;
			System.out.println(modelNumber);
			float mobilePrice=obj.mobilePrice;
			System.out.println(mobilePrice);
			boolean isDamaged=obj.isDamaged;
			System.out.println(isDamaged);
		 
			
		}
	}
