package week2.day3;

public class AxisBank extends BankInfo {

	public void deposit1() {
		System.out.println("deposit in HDFC");
	}
	@Override
	public void deposit() {
		System.out.println("deposit in Sbi");
}
	public static void main(String[] args) 
	{
		AxisBank obj = new AxisBank();
		obj.saving();
		obj.fixed();
		obj.deposit();
}
}