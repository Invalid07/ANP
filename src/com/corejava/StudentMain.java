package com.corejava;

public class StudentMain {

	public static void main(String[] args) {
	Student s1 = new Student();
	
//	setting values
	s1.setName("vikas");
	s1.setAge(23);
	
//	displaying value 
	System.out.println("Student Name :"+s1.getName()+"\nStudent Age : "+s1.getAge());
	}

}
