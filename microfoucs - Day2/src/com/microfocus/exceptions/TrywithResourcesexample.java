package com.microfocus.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TrywithResourcesexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		FileInputStream fin = null;
		
		try {
			
			fin = new FileInputStream(new File("abc.txt"));
			
		} catch (IOException ioe) {
			System.out.println(ioe.getLocalizedMessage());
		} finally {
			
			if (fin!=null) {
				
				try {
					fin.close();
				}catch (IOException ioe) {
					
				}
			}
		}
		
		
		//Try with resources
		
		try (FileInputStream fin1 = new FileInputStream(new File("abc.txt")); 
				FileInputStream fin2 = new FileInputStream(new File("abc1.txt"))) {
			
		}catch (IOException ioe) {
			System.out.println(ioe.getLocalizedMessage());
		} finally {
			
		}
		
		
		
		
		
		
	}

}
