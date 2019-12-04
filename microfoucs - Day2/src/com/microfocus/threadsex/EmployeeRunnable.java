package com.microfocus.threadsex;

import java.util.List;

import com.microfocus.beans.Device;
import com.microfocus.beans.Employee;

//Runnable interface will have only run method


public class EmployeeRunnable implements Runnable {

	private List<Employee> empList;
	public EmployeeRunnable (List<Employee> empList) {
		this.empList = empList;
	}
	
	//All business logic should exists in run method, to perform parallel processing 
	@Override
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
