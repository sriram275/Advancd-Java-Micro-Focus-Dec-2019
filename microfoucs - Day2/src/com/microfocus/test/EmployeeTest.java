package com.microfocus.test;

import com.microfocus.beans.Device;
import com.microfocus.beans.Employee;
import com.microfocus.beans.Laptop;
import com.microfocus.beans.Mobile;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Employee emp = new Employee();
		emp.setId(100);
		emp.setName("dasdasd");
		emp.setSal(3425345);
		emp.setGender('F');
		emp.setAge(30);
		
		System.out.println(emp);
		
		Employee emp1 = new Employee();
		emp1.setId(200);
		emp1.setName("asde");
		emp1.setSal(123);
		emp1.setGender('M');
		emp1.setAge(30);
		
		System.out.println(emp1);
		
		Mobile m = new Mobile();
		//Device d = new Mobile();
		m.setDeviceId(1);
		m.setDeviceModelName("Sang");
		m.setDeviceServiceTag("34er5t");
		
		m.setMobileNumber(897878766);
		
		System.out.println(m);
		//The cost method in Mobile class represents the compile time polymorphism
		
		System.out.println("mobile cost:" + m.cost());
		
		m.cost("lenovo");
		
		
		Laptop l = new Laptop();
		l.setDeviceId(2);
		l.setDeviceModelName("Lenovo");
		l.setDeviceServiceTag("4r5t6y");
		
		l.setHdmiPorts(2);
		l.setUsbPorts(3);
		
		System.out.println(l);
		
		System.out.println("laptop:" + l.cost());
		
		
		
		//you can't create an instance to abstarct classes
		//Polymorphism -> Single name with multiple forms, like cost method
		//cost is the single name for method, but we have multiple implementations
		
		//run time polymorphism -> the below example refers the runtime polymorphism 
		//and this occurs only in parent and child classes
		
		
		//compile time polymorphism -> method will occurs with the same class
		
		Device d = new Mobile();  // at runtime, it will create the Mbile object in Memory and assisgns to Device variable
		d.setDeviceModelName("Samsung");
		System.out.println("Using parent class for Mobile child class:" + d.cost());
		
		
		Device d1 = new Laptop();  // at runtime, it will create the Mbile object in Memory and assisgns to Device variable
		d1.setDeviceModelName("Lenovo");
		System.out.println("Using parent class for Laptop child class:" + d1.cost());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
