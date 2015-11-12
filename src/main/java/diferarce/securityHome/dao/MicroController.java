package diferarce.securityHome.dao;

import diferarce.securityHome.domain.SerialConnection;
import jssc.SerialPort;

public class MicroController extends SerialConnection{

	
	SerialPort serialPort;
	
	public MicroController(){
		super("","");
		
	}
	
	public MicroController(String name, String port) {
		
		super(name,port);
		this.name = name;
		this.port = port;
		
	}
	
	public String getName() {
		return this.name;
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
	public SerialPort getSerialPort() {
		return serialPort;
	}
	public void setSerialPort(SerialPort serialPort) {
		this.serialPort = serialPort;
	}
	
	public String getIdConnection(){
		return this.idConnection; 
	}
	
}
