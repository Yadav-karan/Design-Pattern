package com.design.prototype.deepcopy;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable {

	private String ip;
	private String networkData;
	private List<String> domains = new ArrayList<>();
	
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
	public List<String> getDomains() {
		return domains;
	}
	public void setDomains(List<String> domains) {
		this.domains = domains;
	}
	public void loadImportantData() throws InterruptedException {
		this.networkData = "Very Very important data";
		this.domains.add("www.google.com");
		this.domains.add("www.youtube.com");
		this.domains.add("web.whatsapp.com");
		this.domains.add("www.instagram.com");
		Thread.sleep(5000);
	}
	
	@Override
	public String toString() {
		return "NetworkConnection [ip=" + ip + ", networkData=" + networkData + ", domains=" + domains + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		NetworkConnection networkConnection = new NetworkConnection();
		networkConnection.setIp(this.getIp());
		networkConnection.setNetworkData(this.getNetworkData());
		for(String d:this.getDomains()) {
			networkConnection.getDomains().add(d);
		}
		return networkConnection;
	}
	
	
}
