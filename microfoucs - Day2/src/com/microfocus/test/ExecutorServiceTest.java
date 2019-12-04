package com.microfocus.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.microfocus.beans.Employee;

public class ExecutorServiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating the Thread pool...
		
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		
		Runnable runnable = new Runnable () {
			public void run () {
				System.out.println(Thread.currentThread().getName() + " some business logic......");
			}
		};
		
		executorService.execute(runnable);
		executorService.execute(new SampleRunnable());
		
		Future future = executorService.submit(runnable);
		try {
			System.out.println("Future get retuen value from run() method..." + future.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Future<String> future1 = executorService.submit(new MyCallable());
		try {
			System.out.println("call method  returns..." + future1.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Future<List<Employee>> future2 = executorService.submit(new EmployeeCallable());
		try {
			List<Employee> empList = future2.get();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		executorService.shutdown();
	}
}

class EmployeeCallable implements Callable<List<Employee>> {
	@Override
	public List<Employee> call() throws Exception {
		// TODO Auto-generated method stub
		return EmployeeService.fetchEmployees();
	}	
}

class EmployeeService {	
	public static List<Employee> fetchEmployees (){
		
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
		
		return empLst;
	}
}
class SampleRunnable implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread().getName() + "Sample thread business logic......");
	}
}

class MyCallable implements Callable<String> {

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Callable call method business logic....");
		return "Success...............";
	}
	
}





