package com.corejava;

public class HealthReport {

	public static void main(String[] args) {
//		using patientreport class
		PatientReport pr= new PatientReport();
		
		pr.setName("vikas");
		pr.setAge(23);
		pr.setTemperature(35);
		
//		displayinng value
		System.out.println("name of patient :"+ pr.getName()+"\npatient age :"+pr.getAge()+"\temperature :"+pr.getTemperature());
	}

}
