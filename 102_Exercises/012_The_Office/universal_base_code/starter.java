/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		micahel.getAnnaualSalary();
		michael.raiseSalary(5);
		michael.employeeToString();
		
		Employee Dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		Dwight.getAnnaualSalary();
		Dwight.raiseSalary(4);
		Dwight.employeeToString();
		
		Employee Jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		Jim.getAnnaualSalary();
		Jim.raiseSalary(3);
		Jim.employeeToString();
		
		Employee Pam = new Employee(2011, "Pam", "Beesly", 2205);
		Pam.getAnnaualSalary();
		Pam.raiseSalary(4);
		Pam.employeeToString();
		
		Employee Omar = new Employee(1234, "Omar", "Gonzalez", 5432.66);
		Omar.getAnnaualSalary();
		Omar.raiseSalary(6);
		Omar.employeeToString();
		
		
		
	}
}
