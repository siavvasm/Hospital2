package com.thekla.projects.model;

public class Patient {
	
	private int id;
	private String firstName; 
	private String lastName; 
	private int insuranceId;
	private double weight;
	private double height;
	private String bloodType; 
	private String insurance;
	
	//constructor
	
	public Patient(int id, String firstName, String lastName, int insuranceId, double weight, double height, String bloodType, String insurance){
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.insuranceId = insuranceId;
		this.weight = weight;
		this.height = height;
		this.bloodType = bloodType;
		this.insurance = insurance;
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
	
	public int getInsuranceId(){
		return insuranceId;
	}
	
	public double getWeight(){
		return weight;
	}
	
	public double getHeight(){
		return height;
	}
	
	public String getBloodType(){
		return bloodType;
	}
	
	public String getInsurance(){
		return insurance;
	}
	
	//setters
	
	public void setId(int id){
		this.id=id;
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public void setInsuranceId(int insuranceId){
		this.insuranceId = insuranceId;
	}
	
	public void setWeight(double weight){
		this.weight=weight;
	}
	
	public void setHeight(double height){
		this.height=height;
	}
	
	public void setBloodType(String bloodType){
		this.bloodType = bloodType;
	}
	
	public void setInsurance(String insurance){
		this.insurance=insurance;
	}
	

}
