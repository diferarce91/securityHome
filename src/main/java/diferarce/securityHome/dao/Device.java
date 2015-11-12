package diferarce.securityHome.dao;

public class Device {

	private int id;
	private String name;
	private String description;
	private String pinOut;
	private String pinIn;
	private String microController;
	
	
	
	
	
	public Device() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Device(int id) {
		
		this.id = id;
	}
	
	

	public Device(int id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}



	public Device(String name, String pinOut, String pinIn,String microController) {
		super();
		this.name = name;
		this.pinOut = pinOut;
		this.pinIn = pinIn;
		this.microController = microController;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPinOut() {
		return pinOut;
	}
	public void setPinOut(String pinOut) {
		this.pinOut = pinOut;
	}
	public String getPinIn() {
		return pinIn;
	}
	public void setPinIn(String pinIn) {
		this.pinIn = pinIn;
	}
	public String getMicroController() {
		return microController;
	}
	public void setMicroController(String microController) {
		this.microController = microController;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
