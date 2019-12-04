package com.microfocus.collectionsex;

import java.util.Collections;
import java.util.TreeSet;

import com.microfocus.beans.Employee;
import com.microfocus.beans.EmployeeNameComparator;

public class TreeSetEx {
	public static void main(String[] args) {
		
		//TreeSet<String> strSet = new TreeSet<String>();
		TreeSet<String> strSet = new TreeSet<String>(Collections.reverseOrder());
		strSet.add("fdgdfgdf");		
		strSet.add("ghfghfghgfh");		
		strSet.add("aaaas");		
		
		for (String str : strSet) {
			System.out.println(str);
		}		
		
		TreeSet<Employee> empTreeSet = new TreeSet<Employee>(new EmployeeNameComparator());
		
		Employee emp1 = new Employee();
		emp1.setId(5);
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
		
		empTreeSet.add(emp1);
		empTreeSet.add(emp2);
		empTreeSet.add(emp3);
		
		for (Employee emp : empTreeSet) {
			System.out.println(emp);
		}
		
	}

}
