package com.example.demo.Controller;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
int employeeid;
String employeename;
String employeeaddress;
String employeeemail;


public int getEmployeeid() {
	return employeeid;
}
public void setEmployeeid(int employeeid) {
	this.employeeid = employeeid;
}
public String getEmployeename() {
	return employeename;
}
public void setEmployeename(String employeename) {
	this.employeename = employeename;
}
public String getEmployeeaddress() {
	return employeeaddress;
}
public void setEmployeeaddress(String employeeaddress) {
	this.employeeaddress = employeeaddress;
}
public String getEmployeeemail() {
	return employeeemail;
}
public void setEmployeeemil(String employeeemil) {
	this.employeeemail = employeeemil;
}

}

