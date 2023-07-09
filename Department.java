package org.department;

import org.college.College;

public class Department extends College {
	
	public void deptName() {
		System.out.println("Department is ECE--->son");

	}
	
	public static void main(String[] args) {
		Department dep=new Department();
		dep.deptName();
		dep.collegeCode();
		dep.collegeName();
		dep.collegeRank();
	}
	
	
	

}
