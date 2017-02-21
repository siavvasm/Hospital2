package com.thekla.projects.executable;

import java.util.ArrayList;
import java.util.List;

import com.thekla.projects.model.Department;
import com.thekla.projects.model.Doctor;
import com.thekla.projects.model.Employee;
import com.thekla.projects.model.Hospital;
import com.thekla.projects.model.Hospitality;
import com.thekla.projects.model.Measurement;
import com.thekla.projects.model.Nurse;
import com.thekla.projects.model.Patient;

public class Exec {

	public static void main(String[] args) {
		
		/*
		 *  1. Definition of the Hospital object fields
		 */
		List<Character> buildinfsOfDepartment1 = new ArrayList<Character>();
		List<Character> buildinfsOfDepartment2 = new ArrayList<Character>();
		List<Integer> IdOfDoctors1 = new ArrayList<Integer>(); //for patient 1
		List<Integer> IdOfDoctors2 = new ArrayList<Integer>(); // for patient 2
		
		
		List<Doctor> doctors = new ArrayList<Doctor>();
		List<Nurse> nurses = new ArrayList<Nurse>();
		List<Employee> employees = new ArrayList<Employee>();
		List<Patient> patients = new ArrayList<Patient>();
		List<Department> departments = new ArrayList<Department>();
		List<Hospitality> hospitalities = new ArrayList<Hospitality>();
		List<Measurement> measurements = new ArrayList<Measurement>();
		
		buildinfsOfDepartment1.add('A');
		buildinfsOfDepartment1.add('B');
		buildinfsOfDepartment1.add('C');
		
		buildinfsOfDepartment2.add('D');
		buildinfsOfDepartment2.add('E');
		buildinfsOfDepartment2.add('F');
		
		IdOfDoctors1.add(1);
		IdOfDoctors2.add(2);
		
		Doctor doc1 = new Doctor(1,"George","Papadopoulos",45,3000,"D1","pathologist","fully");
		Doctor doc2 = new Doctor(2,"Mary","Smith",40,2500,"D2","dentist","fully");
		
		// Alternatively:
		// doctors.add(new Doctor(1,"George","Papadopoulos",45,3000,"D1","pathologist","fully"));
		//

		Nurse n1 = new Nurse(1,"Kate","Tale",30,700,"D1","university");
		Nurse n2 = new Nurse(2,"Pete","Brown",31,700,"D2","school");
		
		Patient p1 = new Patient(1,"Chris","L",1234,70,180,"AB","IKA");
		Patient p2 = new Patient(2,"Laura","M",5678,50,160,"A+","IKA");

		Department d1 = new Department("D1", doc1, buildinfsOfDepartment1);
		Department d2 = new Department("D2", doc2, buildinfsOfDepartment2);
		
		Hospitality h1 = new Hospitality(1, IdOfDoctors1, "17/02/2017" , "19/2/2017");
		Hospitality h2 = new Hospitality(2, IdOfDoctors2, "18-2-2017", "18-2-2017");
		
		Measurement m1 = new Measurement("Blood Pressure", 12, "no clue", "2017-02-17", 1,1);
		Measurement m2 = new Measurement("Hematocrit", 38, "no clue", "2017-02-18", 2,2);
		
		/*
		 * 2. Add the individual objects to the appropriate lists
		 */
		doctors.add(doc1);
		doctors.add(doc2);
		
		nurses.add(n1);
		nurses.add(n2);
		
		employees.add(doc1);
		employees.add(doc2);
		employees.add(n1);
		employees.add(n2);

		patients.add(p1);
		patients.add(p2);
		
		departments.add(d1);
		departments.add(d2);
		
		hospitalities.add(h1);
		hospitalities.add(h2);
		
		measurements.add(m1);
		measurements.add(m2);
		
		/*
		 * 3. Create the Hospital object containing the predefined info
		 */
		
		Hospital hospital = new Hospital(employees,departments,patients,measurements,hospitalities);
		
		/*
		 * 4. Printing info about the hospital
		 */
		
		hospital.printEmployee();
		hospital.printDepartment();
		hospital.belongTo("D1");

	}

}
