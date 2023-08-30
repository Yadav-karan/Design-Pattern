package com.design.prototype;

public class NetworkConnection implements Cloneable {

	private String ip;
	private String networkData;
	
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getNetworkData() {
		return networkData;
	}
	public void setNetworkData(String networkData) {
		this.networkData = networkData;
	}
	
	public void loadImportantData() throws InterruptedException {
		this.networkData = "Very Very important data";
		Thread.sleep(5000);
	}
	
	@Override
	public String toString() {
		return "NetworkConnection [ip=" + ip + ", networkData=" + networkData + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
}
