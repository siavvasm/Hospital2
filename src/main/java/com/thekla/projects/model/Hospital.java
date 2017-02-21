package com.thekla.projects.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Hospital {
	
	private List<Employee> employee = new ArrayList<Employee>(); // employees
	private List<Department> department = new ArrayList<Department>(); // departments
	private List<Patient> patient = new ArrayList<Patient>(); // patients
	private List<Measurement> measurement = new ArrayList<Measurement>(); // measurements
	private List<Hospitality> hospitality = new ArrayList<Hospitality>(); // hospitalityEntries
	
	/*
	 * Constructor
	 */
	
	public Hospital(List<Employee> employee, List<Department> department, List<Patient> patient, List<Measurement> measurement, List<Hospitality> hospitality){
		this.employee = employee; // Leave spaces
		this.department = department;
		this.patient = patient;
		this.measurement = measurement;
		this.hospitality = hospitality;
	}
	
	/*
	 * Setters and Getters
	 */
	
	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	public List<Department> getDepartment() {
		return department;
	}

	public void setDepartment(List<Department> department) {
		this.department = department;
	}

	public List<Patient> getPatient() {
		return patient;
	}

	public void setPatient(List<Patient> patient) {
		this.patient = patient;
	}

	public List<Measurement> getMeasurement() {
		return measurement;
	}

	public void setMeasurement(List<Measurement> measurement) {
		this.measurement = measurement;
	}

	public List<Hospitality> getHospitality() {
		return hospitality;
	}

	public void setHospitality(List<Hospitality> hospitality) {
		this.hospitality = hospitality;
	}

	public void printEmployee(){
		for(Employee e:employee){
			System.out.println("Employee: " +e.getClass()+" "+ e.getFirstName()+" "+e.getLastName());
		}
	}
	
	/*
	 * Methods for testing
	 */

	public void printDepartment(){
		
		for(Department d:department){
			System.out.println("Department: " + d.getName());
		}
	}
	
	public List<Employee> belongTo(String departmentName){
		
		// Create an empty list for storing the employees of the desired department
		List<Employee> departmentEmployee = new ArrayList<Employee>();
		System.out.println("The employees that belong to " + departmentName + " " + "are: ");
		
		for (Employee e : employee){
			
			if (e.getDepartment().equals(departmentName)){
				departmentEmployee.add(e);
				System.out.println(e.getLastName());
			}
		}
		return departmentEmployee;
	}
}
