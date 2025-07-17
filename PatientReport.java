package com.corejava;

public class PatientReport 
{
//	create private variable
private String  name;
private int age;
private double temperature;
	
//  setter 
public void setName(String name) {
	this.name=name;
}
public void setAge(int age) {
	this.age=age;
}
public void setTemperature(double temperature) {
	this.temperature=temperature;
}

// getter 
public String getName() {
	return name;
}

public int getAge() {
	return age;
}

public double getTemperature() {
	return temperature;
}



}
