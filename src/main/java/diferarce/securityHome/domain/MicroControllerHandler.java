package diferarce.securityHome.domain;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import jssc.SerialPort;
import jssc.SerialPortException;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import diferarce.securityHome.dao.Device;
import diferarce.securityHome.dao.MicroController;
import diferarce.securityHome.dao.ScheduledTask;


@Component
public class MicroControllerHandler {
	
	
	
	private SqlSession sqlSession;
	
	private static Hashtable<String, MicroController> mcs = new Hashtable<String, MicroController>();
	
	@Autowired
	public MicroControllerHandler(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
		this.connectMc();
	}


	private void connectMc(){
		
		List<MicroController> list = null;
		list = this.sqlSession.selectList("getMicroControllers");
		for (MicroController mc : list) {
			
			List<Object> dataConnection =mc.connect();
			SerialPort serialPort = (SerialPort) dataConnection.get(0);
			mc.setSerialPort(serialPort);
			
			mcs.put((String)dataConnection.get(1),new MicroController(mc.getName(),mc.getPort()));
			
			this.initLister(mc);
			
		}
	}
	
	
	public void sendData(String data,String mcName) throws SerialPortException{
		
		System.out.println("Excribiendo");
		MicroController micro = mcs.get(mcName);
		boolean a=micro.getSerialPort().writeString(data);
		
		System.out.println("respuesta "+a);
	}
	
	
	private void initLister(MicroController mc){
		
		MicroControllerLister listener = new MicroControllerLister(mc);
		listener.start();
	}
	
}