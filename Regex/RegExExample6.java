package com.sample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExExample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pattern =  
		        Pattern.compile("sa*", Pattern.CASE_INSENSITIVE); 
		  
		        // Search above pattern in "geeksforgeeks.org" 
		        Matcher m = pattern.matcher("SampleagainSample.ors"); 
		  
		        // Print starting and ending indexes of the pattern 
		        // in text 
		        while (m.find()) 
		            System.out.println("Pattern found from " + m.start() + 
		                               " to " + (m.end()-1)); 
		        
		        
		        
		        
		        String text = "sample1for2sample3"; 
		        
		        // Specifies the string pattern which is to be searched 
		        String delimiter =  "\\d"; 
		        Pattern pattern1 = Pattern.compile(delimiter, 
		                                        Pattern.CASE_INSENSITIVE); 
		  
		        // Used to perform case insensitive search of the string 
		        String[] result = pattern1.split(text); 
		  
		  
		        for (String temp: result) 
		            System.out.println(temp);
		        
		        
	}

}
