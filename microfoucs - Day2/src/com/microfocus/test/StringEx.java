package com.microfocus.test;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hi";
		String str1 = new String("Hi");
		
		System.out.println(str == str1); // check the object memory location
		
		System.out.println(str.equals(str1)); // content of the memory location
		
		String str3 = new String("My First; String example.....");
		
		System.out.println(str3.indexOf("First"));
		str3.replaceAll("My", "You");
		
		String[] strArray = str3.split(";");
		for (String str5 : strArray) {
			System.out.println(str5);
		}
		
		//lastIndexOf
		//endsWith
		//toLowereCase()
		//toUpperCase()
		//replace
		//replceAll
		//indexOf
	}

}
