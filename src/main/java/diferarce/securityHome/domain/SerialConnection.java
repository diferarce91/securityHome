package diferarce.securityHome.domain;


import java.util.ArrayList;
import java.util.List;

import jssc.SerialPort;
import jssc.SerialPortException;

public class SerialConnection {
	
	protected String name;
	protected String port;
	protected String idConnection="";
	
	public SerialConnection(String name, String port){
		this.name=name;
		this.port=port;
	}
	
	public List<Object> connect(){
		SerialPort serialPort = new SerialPort(this.port);
		try{
			serialPort.openPort();
			serialPort.setParams(9600, 8, 1, 0);
			
			this.idConnection="devi1";
			String a="";
			
			while(!serialPort.isOpened()){
				System.out.println("Estado de puerto "+serialPort.isOpened());
			}
			System.out.println("------------------------------------------------------");
			
			int cont =0;
			while(a==""){
				String read = serialPort.readString();				
				if(read != null || cont== 15)
					a=read;
				Thread.sleep(1000);
				System.out.println("Esperandooo valor diferente  a "+read);
				cont++;
			}
			serialPort.writeString("1");
			System.out.println("  VALOR FINAL DE A = "+a+" contador ="+cont);
			Thread.sleep(15000);
			System.out.println("FINNNNNNNNNNNNNNN");

				
	    }catch (SerialPortException ex){
            System.out.println(ex);
        } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		List<Object> data = new ArrayList<Object>();
		data.add(serialPort);
		data.add("1");
		
		
		return data;	
	}
	
}
