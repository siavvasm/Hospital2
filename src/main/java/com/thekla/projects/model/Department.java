package com.thekla.projects.model;

import java.util.ArrayList;
import java.util.List;

public class Department {
	
	private String name;
	private Doctor director;
	private List<Character> numOfBuildings = new ArrayList<Character>();

	/*
	 * Constructor
	 */
	
	public Department(String name, Doctor director, List<Character> numOfBuildings){
		this.name = name;
		this.director = director;
		this.numOfBuildings = numOfBuildings;
	}
	
	/*
	 * Setters and Getters
	 */
	
	public String getName(){
		return name;
	}
		
	public void setName(String name){
		this.name = name;
	}

	public Doctor getDirector() {
		return director;
	}

	public void setDirector(Doctor director) {
		this.director = director;
	}

	public List<Character> getNumOfBuildings() {
		return numOfBuildings;
	}

	public void setNum_of_buildings(List<Character> numOfBuildings) {
		this.numOfBuildings = numOfBuildings;
	}
}
