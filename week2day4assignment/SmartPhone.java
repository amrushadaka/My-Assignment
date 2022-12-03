package week2day4assignment;

public class SmartPhone  extends IPhone{

	public static void main(String[] args) {
		SmartPhone obj=new SmartPhone();
		//obj.iphone();
		obj.iphonemax();
		obj.iphonepro();
		obj.oneplus();
		obj.vivo();
		obj.samsung();
		

	}

	public void iphonemax() {
		System.out.println("this is iphonemax");
		
	}

	public void vivo() {
		System.out.println("this is vivo");
		
	}

	public void samsung() {
		System.out.println("this is samsung");
		
	}

	
	@Override
	public void iphonepro() {
		System.out.println("this is iphonepro2");
		
	}

	public void oneplus() {
		System.out.println("this is oneplus");
		
	}

		

}
