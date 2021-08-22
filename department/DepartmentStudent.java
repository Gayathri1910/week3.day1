package org.department;

import org.student.Student;

public class DepartmentStudent {
	
	public static void main(String[] args) {
		
		System.out.println("***Department***");
		
		Department dept=new Department();
		dept.collegeCode();
		dept.collegeName();
		dept.collegeRank();
		dept.departmentName();
		
		System.out.println("***Student***");
		
		Student stu=new Student();
		stu.studentDept();
		stu.collegeCode();
		stu.collegeName();
		stu.collegeRank();
		stu.departmentName();
		stu.studentId();
		stu.studentName();
		
		
	}

}
