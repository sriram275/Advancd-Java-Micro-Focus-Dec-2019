package com.microfocus.beans;

import com.microfocus.interfaces.Sample;

//inheritance , obtain the properties from parent class
//can be achieved using extends keyword 

public class Mobile extends Device implements Sample {

	@Override
	public int sum(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int minus(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	private int mobileNumber;

	public int getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	//public abstract int cost() ; this is the method in parent class
	
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		
		if (this.getDeviceModelName().equals("Samsung")) {
			return 2000;
		} else {
			return 1500;
		}
	}
	
	//overloading method
	public int cost(String str) {
		return 100;
	}

	
}
