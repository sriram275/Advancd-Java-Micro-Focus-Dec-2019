package com.microfocus.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.microfocus.beans.Employee;

public class GenericClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SampleGeneric<Integer, String> intSample = new SampleGeneric<Integer, String>();
		SampleGeneric<Employee, Integer> empSample = new SampleGeneric<Employee, Integer>();
		SampleGeneric<List<Employee>, String> empListSample = new SampleGeneric<List<Employee>, String>();
		
		//Type Inference
		SampleGeneric<Integer, String> intSample1 = new SampleGeneric<>();
		List<String> list1 = new ArrayList<>();
		
		
		
		SampleGeneric s = new SampleGeneric();
		s = intSample; //raw type assignment
		
		s.set(10, "sdfsfdsfdsf");
		
		
		intSample.set(10, "Hi");
		empSample.set(new Employee() , 10);
		
		int data = intSample.getData();
		String secondData = intSample.getSecondData();
		System.out.println(data +" " + secondData);
		
		
		Pair<Integer,String> pair = new Pair<Integer,String>();
		pair.addData(10, "Hi");
		
		System.out.println(pair.getKeyValue(10));
		
		GenericList<Double> list = new GenericList<Double>();
		list.addData(10.45);
		System.out.println(list.getElement(0));
		
		boolean flag = max1(10,20);
	}
	
	//Bounded Type Parameters
	public static <T extends Employee> boolean max(T a, T b) {
	//	double d =  a.doubleValue()+b.doubleValue();
		return false;
	}
	
	//multi bounded parameters.
	public static <T extends Number & Comparable<T>> boolean max1(T a, T b) {
		//	double d =  a.doubleValue()+b.doubleValue();
			return false;
		}
	public <E> void sampleMethod(List<E> list) {
		
	}
	
   public <E> void sampleMethod1(E[] valueArray) {
		
	}
	
	
}
//Generics
//T represents Type, first parameter
//S , second parameter
//U, third type parameter
//V, fourth type parameter

class SampleGeneric<T , S> {
	private T var;
	private S var1;	
	public void set(T var , S var1) {
		this.var = var;
		this.var1 = var1;
	}		
	public T getData() {
		return var;
	}	
	public S getSecondData() {
		return var1;
	}
	
}

//K, Key
//V, Value

class Pair<K,V> {
	
	Map<K,V> pairMapGeneric = new HashMap<K,V>();
	
	public void addData(K key, V value) {
		this.pairMapGeneric.put(key,value);
	}
	
	public V getKeyValue(K key){
		return pairMapGeneric.get(key);
	}
}

//E - Element, generally it will be used for the collections..

class GenericList<E> {
	List<E> list = new ArrayList<E>();
	
	public void addData(E element) {
		list.add(element);
	}
	
	public E getElement(int index) {
		return list.get(index);
	}
}






