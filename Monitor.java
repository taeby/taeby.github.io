/*
	monitor : class
	serialnumber : string
	resoultion
	size : int
	isOn : bool
	
	field private
	
	getter/setter
	
	on() : void
	off() : void
	
*/

class Monitor {
	private String serialNumber;
	private String resolution;
	private int size;
	private boolean isOn;
	
	public String getSerialNumber() {
		return serialNumber;
	}
	public String getResolution() {
		return resolution;
	}
	public int getSize() {
		return size;
	}
	public boolean isOn() {
		return isOn;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public void setResolution(String resolution) {
		this.resolution = resolution;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public void setOn() {
		isOn = true;
	}
	public void setOff() {
		isOn = false;
	}
}