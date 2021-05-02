package org.student;

import org.department.Department;

public class Student extends Department {
public void studentName() {
	System.out.println("The Name of the student is Anitha S");
}
public void studentDept() {
	System.out.println("The name of the student dept is EEE");
}
public void studentId() {
	System.out.println("The Nmae of the Student Id is 15te0441");
}
	public static void main(String[] args) {
		Student det = new Student();
		det.collegeCode();	
		det.collegeName();
		det.collegeRank();
		det.deptName();
		det.studentDept();
		det.studentId();
		det.studentName();

	}
	

}
