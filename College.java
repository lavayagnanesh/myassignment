package org.college;

public class College {

	//collegeName(),collegeCode(),collegeRank()

	public void collegeName() {
		System.out.println("My college name is MKCE-->parent");

	}
	public void collegeCode() {
		System.out.println("My college code is 12345--->parent");

	}
	
	public void collegeRank() {
		System.out.println("colegeRank is 1--->parent");

	}
	public static void main(String[] args) {
		College col=new College();
		col.collegeCode();
		col.collegeName();
		col.collegeRank();
	}
	
	
	
	
	
	
}
