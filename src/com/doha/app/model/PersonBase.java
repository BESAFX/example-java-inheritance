
package com.doha.app.model;

public abstract class PersonBase implements Person {
	protected String  name;
	protected Integer age;
	
	public PersonBase(String _name, Integer _age) {
		name = _name;
		age = _age;
	}
	
	public PersonBase() {

	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Integer getAge() {
		return age;
	}

}
