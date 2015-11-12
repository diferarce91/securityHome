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

import diferarce.securityHome.dao.A;
import diferarce.securityHome.dao.MicroController;


@Component
public class MicroControllerHandler {
	
	
	
	private SqlSession sqlSession;
	
	private static Hashtable<String, MicroController> mcs = new Hashtable<String, MicroController>();
	
	@Autowired
	public MicroControllerHandler(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
		this.addMicro();
		//this.connect();
	}


	private void addMicro(){
		
		//List<MicroController> list = null;
		List<A> lista= null;
		lista= this.sqlSession.selectList("ejemplo");
		System.out.println(lista.size()+" :  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><");
		for (A a : lista) {
			
			System.out.println("  Array devicessss  :  "+a.getDeviceId().size());
			
		}	
		
		//list = this.sqlSession.selectList("getMicroControllers");
		/*for (MicroController mc : list) {
			mcs.put("device1",new MicroController(mc.getName(),mc.getPort()));
		}*/

	}
	
	private void connect(){
		
		List<MicroController> lstMc = new ArrayList<MicroController>(mcs.values());		
		for (MicroController micro : lstMc) {
			
			SerialPort serialPort = micro.connect();
			//System.out.println(micro.getIdConnection());
			//micro.setSerialPort(serialPort);
			//MicroControllerLister listener = new MicroControllerLister(micro);
			//listener.start();
			
		}		
	}
	
	public void sendData(String data,String mcName) throws SerialPortException{
		
		System.out.println("Excribiendo");
		MicroController micro = mcs.get(mcName);
		boolean a=micro.getSerialPort().writeString(data);
		
		System.out.println("respuesta "+a);
	}
	
}
