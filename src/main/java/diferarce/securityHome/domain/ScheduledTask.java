
package diferarce.securityHome.domain;

import java.util.Date;
import java.util.List;

import diferarce.securityHome.dao.Device;

public class ScheduledTask {
	
	private int id;
	private Date date;
	private String name;
	private List<Device> devices;
	
	
	public ScheduledTask() {
		
	}
	
	
	public ScheduledTask(int id, Date date, String name, List<Device> devices) {
		super();
		this.id = id;
		this.date = date;
		this.name = name;
		this.devices = devices;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Device> getDevices() {
		return devices;
	}
	public void setDevices(List<Device> devices) {
		this.devices = devices;
	}
	
	
	

}
