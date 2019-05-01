
package com.doha.app.model;

import com.doha.app.action.Studying;

public class Student extends PersonBase implements Studying {
	
	private String grade;
	private String id;
	
	public Student() {
		super("doha", 12);
	}

	public Student(String _name, Integer _age) {
		super(_name, _age);
	}
	
	public Student(String _name, Integer _age, String _grade) {
		this(_name, _age);
		grade = _grade;
	}
	
	
	public Student(String _name, Integer _age, String _grade, String _id) {
		this(_name, _age, _grade);
		id = _id;
	}

	@Override
	public Integer getAge() {
		return age - 10;
	}

	@Override
	public String studyFor() {
		return "JAVA";
	}

}
