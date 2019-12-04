package com.microfocus.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import com.microfocus.beans.Employee;
import com.microfocus.exceptions.EmployeeException;

public class ExceptionHandlingExample {

	public static void main(String[] args) throws EmployeeException {
		// TODO Auto-generated method stub

		
		String str = null;
		List<Employee> empLst = new ArrayList<Employee>();
		Employee emp1 = new Employee();
		emp1.setId(1);
		emp1.setAge(10);
		emp1.setGender('M');
		emp1.setSal(2345);
		emp1.setName("Abcd");
		
		Employee emp2 = new Employee();
		emp2.setId(2);
		emp2.setAge(20);
		emp2.setGender('F');
		emp2.setSal(1245);
		emp2.setName("cd");
		
		Employee emp3 = new Employee();
		emp3.setId(3);
		emp3.setAge(30);
		emp3.setGender('M');
		emp3.setSal(3456);
		emp3.setName("bcv");
		
		empLst.add(emp1);
		empLst.add(emp2);
		empLst.add(emp3);
		
		//try with resources
		
		try {
			
			Employee emp = findEmployeeById(empLst, 6);
			System.out.println("after findEmployeeById method...");
			
			
			
			
		} 
		catch (NullPointerException | EmployeeException  e ) {
			
			System.out.println(e.getMessage());
		} catch (Exception e) {
			
		}
		finally {
			
			System.out.println("in finally block....");
		}
		
		//System.out.println(str);
				
	}
	
	public static Employee findEmployeeById(List<Employee> empLst , int employeeId) throws EmployeeException {
		
		for(Employee emp : empLst) {
			
			if(emp.getId() == employeeId) {
				return emp;
			}
		}
		
		//if not found throw exception
		//throw is the keyword which will be used to throw your custom exceptions
		throw new EmployeeException("Employee with " + employeeId + " does not exists...");
		
	}
	

}
