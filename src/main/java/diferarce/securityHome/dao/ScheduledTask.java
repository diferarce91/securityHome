
package diferarce.securityHome.dao;

import java.util.Date;
import java.util.List;

public class ScheduledTask {
	
	private int id;
	private String name;
	private List<Device> devices;
	
	
	
	public ScheduledTask() {
		
	}

	

	public ScheduledTask(int id, String name, List<Device> devices) {
		super();
		this.id = id;
		this.name = name;
		this.devices = devices;
	}



	public ScheduledTask(int id, String name) {
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



	public List<Device> getdevices() {
		return devices;
	}



	public void setdevices(List<Device> devices) {
		this.devices = devices;
	}
	

}
