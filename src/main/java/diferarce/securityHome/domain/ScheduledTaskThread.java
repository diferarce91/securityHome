package diferarce.securityHome.domain;


import diferarce.securityHome.dao.MicroController;
import diferarce.securityHome.dao.ScheduledTask;
import jssc.SerialPortException;


public class ScheduledTaskThread extends Thread {

	private ScheduledTask task;
	
	
	
	public ScheduledTaskThread(ScheduledTask task) {
		this.task = task;		
	}

	@Override
	public void run() {
		System.out.println("Ejecutando tarea "+this.task.getName());
		while(true){
			
			//  REVISAR http://www.mkyong.com/spring/spring-and-java-thread-example/
		}
		
	}
	
	
}
