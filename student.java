package org.student;

import org.department.Department;

public class student extends Department {

	//studentName(),studentDept(),studentId()

	public void studentName() {
		System.out.println("Student name is Lavanya-->grandson");

	}
	
	public void studentDept() {
		System.out.println("Student departmnet is ECE-->Grandson");

	}
	
	public void studentId() {
		System.out.println("Student id is 12345---?Grandson");
	}
	public static void main(String[] args) {
		student stu=new student();
		stu.studentDept();
		stu.studentId();
		stu.studentName();
		stu.collegeCode();
		stu.collegeName();
		stu.collegeRank();
		stu.deptName();
	}
}
