package com.microfocus.beans;

//Primitive data types

//short, int, long -> integer variables
//char -> single charecters
//boolean -> true or false
//float or long -> decimal values

//data hiding, achieve private

//Encapsulation -> wrapping of data and functions together into a single unit is called encapsulation



public class Employee implements Comparable<Employee> {
	
	@Override
	public int compareTo(Employee emp) {
		// TODO Auto-generated method stub
		
		if(this.id == emp.id) {
			return 0;
		} else if(this.id > emp.id) {
			return 1;
		} else {
			return -1;
		}
		
	} 
	
	
	private int id;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	private String name; // its an object
	private double sal;
	private int age;
	private  char gender;	
	

	public String toString() {
		return "id: " + this.id + " Name: "+ this.name + " Gender:" + 
					this.gender + " Age:" +this.age + " Sal:" + this.sal;
	}
	
}
