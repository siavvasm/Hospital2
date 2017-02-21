package com.thekla.projects.model;

public class Measurement {
	
	private String name;
	private double value;
	private String unit;
	private String date;
	private int id;
	private int patientId;
	
	//constructor
	
	public Measurement(String name, double value, String unit, String date, int id, int patientId){
		this.name = name;
		this.value = value;
		this.unit = unit;
		this.date = date;
		this.id = id;
		this.patientId = patientId;
	}
	
	public String getName(){
		return name;
	}
	
	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public void setName(String name){
		this.name = name;
	}

}
