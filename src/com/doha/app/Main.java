
package com.doha.app;

import com.doha.app.action.Studying;
import com.doha.app.action.Teaching;
import com.doha.app.model.Person;
import com.doha.app.model.Professor;
import com.doha.app.model.Student;

public class Main {


	public static void main(String[] args) {
		System.out.println("//////////////////////////////////////////////////////////////////////////////");
		
		Student s1 = new Student("doha", 12, "middleSchool", "1234");
		System.out.println("First student name:" + s1.getName());
		
		Professor p1 = new Professor("Bassam", 101, "Java Programming", "Prof");
		System.out.println("p1 name:" + p1.getName());
		System.out.println("p1 courseTitle:" + p1.getCourseTitle());
		
		Person personP1 = p1;
		System.out.println("personP1 name:" + personP1.getName());

		Teaching teachingP1 = p1;
		System.out.println("teachingP1 courseTitle:" + teachingP1.getCourseTitle());
		
		Person personS1 = s1;
		System.out.println("person1 name:" + personS1.getName());
		Studying studyingS1 = s1;
		System.out.println("studying1 studyFor:" + studyingS1.studyFor());
		
		Person personS = new Student("kiris", 22, "college", "4321");
		System.out.println("personS name:" + personS.getName());	
	}

}
