package com.microfocus.test;

import java.util.ArrayList;
import java.util.List;

import com.microfocus.beans.Employee;
import com.microfocus.threadsex.EmployeeRunnable;
import com.microfocus.threadsex.EmployeeThread;

public class EmployeeThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Starting of the thread:" + Thread.currentThread().getName());
		List<Employee> empList1 = new ArrayList<Employee>();
		List<Employee> empList2 = new ArrayList<Employee>();
		List<Employee> empList3 = new ArrayList<Employee>();
		
		//fire 
		//initialize the Employee lists with employee 
		for (int i=1;i<=20;i++) {
			
			Employee emp = new Employee();
			emp.setId(i);
			emp.setSal(1 * 10);
			
			if (i <5) {
				empList1.add(emp);
			}
			
			if (i >=5 && i<=10) {
				empList2.add(emp);
			}
			
			if (i >=11) {
				empList3.add(emp);
			}
			
		}
		
		
		//sThread priorities 1 to 10
		Thread t1 = new EmployeeThread(empList1);
		t1.setName("Employee Thread1");
		t1.setPriority(1);
		
		Thread t2 = new EmployeeThread(empList2);
		t2.setName("Employee Thread2");
		t2.setPriority(10);
		
		Thread t3 = new EmployeeThread(empList3);
		t3.setName("Employee Thread3");
		t3.setPriority(5);
		
		t1.start();
		t2.start();
		t3.start();
		
		
		
		EmployeeRunnable empRunnable = new EmployeeRunnable(empList2);
		Thread t5 = new Thread(empRunnable);
		t5.setName("Employee Runnable Thread");
		t5.start();
		
		
		
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			t5.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("ending of the thread:" + Thread.currentThread().getName());
	}

}
