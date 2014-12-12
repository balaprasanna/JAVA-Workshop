package com.workshop1.simpleJavaClasses;

public class Facility {
	
private String name;
private String description;

public Facility() {
	this("name", "description");
}

public Facility(String name) {
	this(name,"");	
}

public Facility(String name, String description) {

	this.name = name;
	this.description = description;
}


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}

public void show() {
	// TODO Auto-generated method stub
System.out.println(this.toString());
}

@Override
public String toString() {
	return name  +" "+ description;
}


}
