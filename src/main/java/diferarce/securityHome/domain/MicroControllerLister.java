package diferarce.securityHome.domain;


import diferarce.securityHome.dao.MicroController;
import jssc.SerialPortException;


public class MicroControllerLister extends Thread {

	MicroController micro;
	
	public MicroControllerLister(MicroController micro) {
		this.micro = micro;		
	}

	@Override
	public void run() {
		System.out.println("Escuchando micro "+this.micro.getName());
		while(true){
			try {
				System.out.println(this.micro.getSerialPort().readString());
	            Thread.sleep(3000);
	            	
            } catch (InterruptedException e) {
				e.printStackTrace();
			} catch (SerialPortException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	
	
	
	
	
}
