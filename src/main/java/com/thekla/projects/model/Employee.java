package com.thekla.projects.model;

public class Employee {
	
	private int id;
	private String firstName;
	private String lastName; 
	private int age;
	private double salary;
	private String department;

	//constructor
	public Employee(int id, String firstName, String lastName, int age, double salary, String department){
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
		this.department = department;
	}
	
	//getters
	
	public int getId(){
		return id;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public int getAge(){
		return age;
	}
	
	public double getSalary(){
		return salary;
	}
	
	public String getDepartment(){
		return department;
	}
	
	//setters
	
	public void setId(int id){
		this.id = id;
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public void setSalary(double salary){
		this.salary = salary;
	}
	
	public void setDepartment(String department){
		this.department = department;
	}
}
