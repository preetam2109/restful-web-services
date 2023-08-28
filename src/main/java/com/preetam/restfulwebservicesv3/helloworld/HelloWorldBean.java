package com.preetam.restfulwebservicesv3.helloworld;

public class HelloWorldBean {
	private String Name;
	private String age;
	
	@Override
	public String toString() {
		return "HelloWorldBean [Name=" + Name + ", age=" + age + "]";
	}
	public HelloWorldBean(String name, String age) {
		super();
		Name = name;
		this.age = age;
	}
	public String getName() {
		return Name;
	}
	public String getAge() {
		return age;
	}
	public void setName(String name) {
		Name = name;
	}
	public void setAge(String age) {
		this.age = age;
	}
	

}
