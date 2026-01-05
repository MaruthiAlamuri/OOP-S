package com.oop;

public class Department {
	String deptName;
	Professor professor;
	
	Department(String deptName, Professor professor){
		this.deptName = deptName;
		this.professor = professor;
	}
	
	void assginProfessor() {
		professor.teach();
	}

}
