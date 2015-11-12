package diferarce.securityHome.dao;

public class Usuario {

	private String name;
	private String port;
	
	public Usuario () {
		
	}
	
	public Usuario(String name, String port) {
		
		this.name = name;
		this.port = port;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	
	
	
	
}
