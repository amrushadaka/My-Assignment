package org.student;

import org.department.Department;

public class Student extends Department{

	public void studentName() {
		System.out.println("student name is Amrusha");
	}
	public void studentDept() {
		System.out.println("student dept is CSE"); 
	}
	public void studentId() {
		System.out.println("student id is 504");
	}

	public static void main(String[] args) {

		Student stu = new Student();
		stu.collegeName();
		stu.collegeCode();
		stu.collegeRank();
		stu.deptName();
		stu.studentName();
		stu.studentId();
		stu.studentDept();

	}
}

