package diferarce.securityHome.dao;

import java.util.List;

public class A {
	
	private int id;
	private String name;
	private List<B> deviceId;
	
	
	
	public A() {
		
	}

	

	public A(int id, String name, List<B> deviceId) {
		super();
		this.id = id;
		this.name = name;
		this.deviceId = deviceId;
	}



	public A(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}



	public List<B> getDeviceId() {
		return deviceId;
	}



	public void setDeviceId(List<B> deviceId) {
		this.deviceId = deviceId;
	}

	


	
	
	
	
	
}
