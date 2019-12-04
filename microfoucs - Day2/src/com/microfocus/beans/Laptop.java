package com.microfocus.beans;

public class Laptop extends Device {

	
	private int hdmiPorts;
	private int usbPorts;
	
	public int getHdmiPorts() {
		return hdmiPorts;
	}
	public void setHdmiPorts(int hdmiPorts) {
		this.hdmiPorts = hdmiPorts;
	}
	public int getUsbPorts() {
		return usbPorts;
	}
	public void setUsbPorts(int usbPorts) {
		this.usbPorts = usbPorts;
	}
	
	@Override
	public int cost() {
		// TODO Auto-generated method stub

		if(this.getDeviceModelName().equals("Lenovo")) {
			return 25000;
		} else {
			return 20000;
		}
	}
	
	
}
