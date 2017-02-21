package com.thekla.projects.model;

import java.util.ArrayList;
import java.util.List;

public class Hospitality {
	
	private int patientId;
	private List<Integer> doctorId = new ArrayList<Integer>();
	private String checkIn;
	private String checkOut;
	
	//constructor
	
	public Hospitality(int patientId, List<Integer> doctorId, String checkIn, String checkOut){
		this.patientId = patientId;
		this.doctorId = doctorId;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public List<Integer> getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(List<Integer> doctorId) {
		this.doctorId = doctorId;
	}

	public String getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(String checkIn) {
		this.checkIn = checkIn;
	}

	public String getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(String checkOut) {
		this.checkOut = checkOut;
	}

}
