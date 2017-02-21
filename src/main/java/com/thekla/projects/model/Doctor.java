package com.thekla.projects.model;

public class Doctor extends Employee{
	
	//extra fields
	private String fieldOfSpecialty;
	private String typeOfEmployment; //either fully or intern
	
	//Constructor
	public Doctor(int id, String firstName, String lastName, int age, double salary, String department, String fieldOfSpecialty, String typeOfEmployment){
		super(id,firstName, lastName, age, salary, department);
		this.fieldOfSpecialty = fieldOfSpecialty;
		this.typeOfEmployment = typeOfEmployment;
	}
	
	//getters
	
	public String getFieldOfSpecialty(){ 
		return fieldOfSpecialty;
	}
	
	public String getTypeOfEmployment(){
		return typeOfEmployment;
	}
	
	//setters
	
	public void setFieldOfSpecialty(String fieldOfSpecialty){
		this.fieldOfSpecialty = fieldOfSpecialty;
	}
	
	public void setTypeOfEmployment(String typeOfEmployment){
		this.typeOfEmployment = typeOfEmployment;
	}

}
