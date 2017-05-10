/**
 * 
 */
package com.mycompany.myapp.mycomponent;

/**
 * @author ilker
 *
 */
public class Professor extends PersonBase implements Teaching {
//public class Professor extends PersonBase implements Person {
	private String  courseTitle;
	private String  title;
	
	public Professor(String _name, Integer _age, String _courseTitle, String _title) {
		super(_name, _age);
		courseTitle = _courseTitle;
		title = _title;
	}
	
	/* (non-Javadoc)
	 * @see com.mycompany.myapp.mycomponent.Person#getName()
	 */
	@Override
	public String getName() {
		return "Prof: " + super.getName();
	}

	@Override
	public String getCourseTitle() {
		return courseTitle;
	}


}
