package com.thekla.projects.model;

public class Nurse extends Employee{
	
	//extra field
	private String typeOfDegree; // university or technical school
	
	//constructor
	public Nurse(int id, String firstName, String lastName, int age, double salary, String department, String typeOfDegree){
		super(id, firstName, lastName, age, salary, department);
		this.typeOfDegree = typeOfDegree;
	}
	
	//getter
	
	public String getTypeOfDegree(){
		return typeOfDegree;
	}
	
	//setter
	
	public void setTypeOfDegree(String typeOfDegree){
		this.typeOfDegree = typeOfDegree;
	}

}
