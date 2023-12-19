package com.satya.collections;

import java.util.ArrayList;

public class ArrayListex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.setRollNo(420);
		s1.setName("jayadeep");
		s1.setEmail("likhithalv333@gmail.com");
		
		Student s2=new Student();
		s2.setRollNo(427);
		s2.setName("jaya");
		s2.setEmail("likhithalv789@gmail.com");
		Student s3=new Student();
		s3.setRollNo(4290);
		s3.setName("jay");
		s3.setEmail("likhithalv567@gmail.com");
		ArrayList<Student> students=new ArrayList<Student>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		System.out.println(s1.getRollNo()+" "+s1.getName()+" "+s1.getEmail());
		for(Student student:students) {
			System.out.println(student.getRollNo()+" "+student.getName()+" "+student.getEmail());
		}
		
	}

}
