package assignment5.day5;

public class Students {

	public void getStudentInfo(int x) {

		System.out.println("Student ID is: " + x);

	}

	private void getStudentInfo(String studname,int id) {
		System.out.println("Student name is "+studname+  " id is "+id);

	}

	private void getStudentInfo(String email,String phonenumber) {
		// TODO Auto-generated method stub
System.out.println("Student email" +email+  " phone number is " +phonenumber);
	}

	public static void main(String[] args) {
		Students stu = new Students();
		stu.getStudentInfo(23);
		stu.getStudentInfo("Gayathri", 2);
		stu.getStudentInfo("ggayathri091@gmail.com", "623468234");
		

	}

}
