/**
 * 
 */
package com.mycompany.myapp.mycomponent;

/**
 * @author ilker
 *
 */
public class MainEntryClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("BEGIN");
		
		Student s1 = new Student("ilker", 12, "middleSchool", "1234");
		System.out.println("s1 name:" + s1.getName());
		
		Professor p1 = new Professor("Albert", 101, "Intenet Programming", "Ordinarious");
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
