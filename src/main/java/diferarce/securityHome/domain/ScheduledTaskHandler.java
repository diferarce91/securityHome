package diferarce.securityHome.domain;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import diferarce.securityHome.dao.Device;
import diferarce.securityHome.dao.ScheduledTask;

@Component
public class ScheduledTaskHandler {

	
	private List<ScheduledTask> tasks;
	private SqlSession sqlSession;
	
	@Autowired
	public ScheduledTaskHandler(SqlSession sqlSession) {
		
		this.sqlSession = sqlSession;
		this.getTasks();
		
	}
	
	private void getTasks(){
		
		List<ScheduledTask> lista= null;
		lista= this.sqlSession.selectList("getTasks");
		System.out.println(lista.size()+" :  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><");
		for (ScheduledTask a : lista) {			
			//System.out.println("  Array devicessss  :  "+a.getdevices().size());
			for (Device b : a.getdevices()) {
				System.out.println(" NOMBRE :"+b.getName()+"   |  "+b.getDescription());
			}
		}
		
	}
	
	
	
	
	
}
