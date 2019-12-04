package com.microfocus.threadsex;

import java.util.List;

import com.microfocus.beans.Employee;

public class EmployeeThread extends Thread {
	
	private List<Employee> empList;
	public EmployeeThread (List<Employee> empList) {
		this.empList = empList;
	}
	
	//All business logic should exists in run method, to perform parallel processing 
	
	public void run () {
	
		for (Employee emp : empList) {
			System.out.println(Thread.currentThread().getName() + " Processing salary for the employee...." + emp.getId() );
			
			// Business logic
			//Business logic
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
