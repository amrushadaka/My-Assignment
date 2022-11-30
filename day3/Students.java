package week2.day3;

public class Students {


	public void getStudentInfo(int id){
		System.out.println("Student Id: " +id);
	}

	public void getStudentInfo(int id,String name){
		System.out.println("Student Id: " +id);
		System.out.println("Student Name: "+name);
	}

	public void getStudentInfo(String emailid,String phonenumber){
		System.out.println("email id: " +emailid);
		System.out.println("Phonenumber: "+phonenumber);
	}

	public static void main(String[] args) 
	{
		Students obj = new Students();
		obj.getStudentInfo(504);
		obj.getStudentInfo(504, "Amrusha");
		obj.getStudentInfo("amrushadaka@gmail.com", "8889991234");
	}
}


