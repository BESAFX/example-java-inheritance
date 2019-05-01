
package com.doha.app.model;

import com.doha.app.action.Teaching;

public class Professor extends PersonBase implements Teaching {

	private String  courseTitle;
	private String  title;
	
	public Professor(String _name, Integer _age, String _courseTitle, String _title) {
		super(_name, _age);
		courseTitle = _courseTitle;
		title = _title;
	}

	@Override
	public String getName() {
		return "Prof: " + super.getName();
	}

	@Override
	public String getCourseTitle() {
		return courseTitle;
	}


}
