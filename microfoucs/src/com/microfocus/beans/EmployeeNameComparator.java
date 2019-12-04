package com.microfocus.beans;

import java.util.Comparator;
import java.util.TreeSet;

//TreeSet<Employee> empTreeSet = new TreeSet<Employee>(); // will use comparable interface related employee class logic
//TreeSet<Employee> empTreeSet = new TreeSet<Employee>(new EmployeeNameComparator());

public class EmployeeNameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
		return emp1.getName().compareTo(emp2.getName());
	}

}
