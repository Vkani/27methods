package org.college;

public class College extends Dept implements EEE{
public void collegeName() {
	System.out.println("College Name is Hindusthan");
	
	
	super.oops();
	super.dataStructures();
	super.hostelName();
	super.studentDept();
	super.StudentDept();
	super.studentDept1();
	super.hilarias();
	super.symposium();
	super.departmentName();
	this.collegeCode();
	this.collegeRank();
	this.powerElectronics();
	this.controlSystems();

}
public void collegeCode() {
System.out.println("COllege Code is 131");

}
public void collegeRank() {
	System.out.println("College Rank is 4");

}
@Override
public void powerElectronics() {
	System.out.println("Power Electronics");
	
}
@Override
public void controlSystems() {
	System.out.println("control Systems");
	
}
public static void main(String[] args) {
	

	College c=new College();
	c.collegeName();

}
}