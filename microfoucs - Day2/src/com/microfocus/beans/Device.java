package com.microfocus.beans;

public abstract class Device {
	
	private int deviceId;
	private String deviceModelName;
	private String deviceServiceTag;
	
	//Abstraction example
	// It shows only essential features with out specifying the inner implementation 
	
	public abstract int cost() ;
	
	
	public int getDeviceId() {
		
		return deviceId;
	}
	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}
	public String getDeviceModelName() {
		return deviceModelName;
	}
	public void setDeviceModelName(String deviceModelName) {
		this.deviceModelName = deviceModelName;
	}
	public String getDeviceServiceTag() {
		return deviceServiceTag;
	}
	public void setDeviceServiceTag(String deviceServiceTag) {
		this.deviceServiceTag = deviceServiceTag;
	}
	
	
	

}
