package diferarce.securityHome.domain;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import diferarce.securityHome.dao.MicroController;
import diferarce.securityHome.dao.ScheduledTask;
import jssc.SerialPortException;

@Component
@Scope("prototype")
public class ScheduledTaskThread extends Thread {

	private ScheduledTask task;
	
	

	public ScheduledTask getTask() {
		return task;
	}



	public void setTask(ScheduledTask task) {
		this.task = task;
	}



	@Override
	public void run() {
		
		System.out.println("Ejecutando tarea "+this.task.getName());
		try {
			System.out.println("Durmiento "+this.task.getName());
			Thread.sleep(5000);
			System.out.println("Despertando "+this.task.getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
}
