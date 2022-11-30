package week2.day3;

public class Calculator {

	public void add(int a,int b) {
		System.out.println(a+b);
	}

	public int add(int a, int b, int c) {
		return a+b+c;
		}
	public double sub(double a, double b) {
		return a-b;
	}
	public int sub(int a, int b) {
		return a-b;
	}
	public void mul(int a, double b) {
		System.out.println(a*b);
	}
	public double mul(double a, double b) {
		return a*b;
	}
   public static void main(String[] args) {
	Calculator method = new Calculator();
     method.add(1,4);
     int add = method.add(7, 8, 9);
     System.out.println(add);
     int sub = method.sub(7,8);
     System.out.println(sub);
     double sub2 = method.sub(27.66, 78.9);
     System.out.println(sub2);
     method.mul(15,2);
     double mul1 = method.mul(15.8, 16.8);
     System.out.println(mul1);
     
}
}