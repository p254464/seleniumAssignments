package org.student;

import ord.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Student Name");
		
	}
	public void studentDept() {
		System.out.println("Student Department");
		
	}
	public void studentId() {
		System.out.println("Student Id");
		
	}

	public static void main(String[] args) {
		Student S = new Student();
		S.depName();
		S.collegeName();
		S.collegeCode();
		S.collegeRank();
		S.studentName();
		S.studentDept();
		S.studentId();
		
		

	}

}
