package com.microfocus.collectionsex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.microfocus.beans.Employee;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List list = new ArrayList();
		//ArrayList list = new ArrayList();
		
		int age = 10;
		
		//Wrapper classes
		
		//int -> Integer
		//short -> Short
		//long -> Long
		
		//float -> Float
		//double -> Double
		
		//char -> Char
		//boolean -> Boolean
		
		
		
		list.add(age);
		list.add("asasf");
	
		
		Employee e = new Employee () ;
		list.add(e);
		
		int size = list.size();
		
		//one way of fetching values
		System.out.println("First Approach");
		for (int i= 0;i<size;i++) {
			System.out.println(list.get(i));
		}
		
		//second way of fetching values from collection
		System.out.println("Second Approach...");
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			Object obj = itr.next();
			System.out.println(obj);
		}
		
		
		//Generics
		
		List<Integer> intLst = new ArrayList<Integer>();
		intLst.add(100);
		intLst.add(200);
		intLst.add(300);
		
		System.out.println("Using iterator for list");
		Iterator<Integer> intLstItr = intLst.iterator();
		while (intLstItr.hasNext()) {
			Integer i = intLstItr.next();
			System.out.println(i);
		}
		
		//enhanced for loops
		System.out.println("Using enhanced forr loops");
		for (Integer in : intLst) {
			System.out.println(in);
		}
		
		
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
		
		System.out.println("Using iterator for list");
		Iterator<Employee> empLstItr = empLst.iterator();
		while (empLstItr.hasNext()) {
			Employee emp = empLstItr.next();
			System.out.println(emp);
		}
		
		//enhanced for loops
		System.out.println("Using enhanced forr"
				+ " loops");
		for (Employee emp : empLst) {
			System.out.println(emp);
		}
		
		
	}

}
