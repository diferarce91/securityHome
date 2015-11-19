package diferarce.securityHome.domain;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import diferarce.securityHome.dao.Device;
import diferarce.securityHome.dao.ScheduledTask;

@Component
public class ScheduledTaskHandler {

	
	private List<ScheduledTask> tasks;
	private SqlSession sqlSession;
	
	@Autowired 
	ScheduledTaskThread thread;
	
	@Autowired
	public ScheduledTaskHandler(SqlSession sqlSession) {
		
		this.sqlSession = sqlSession;
		this.tasks = this.sqlSession.selectList("getTasks");
		
	}
	
	
	@Scheduled(fixedRateString = "60000")
	public void clearPullSessions() {		
		
		for (ScheduledTask task : tasks) {
			
			thread.setTask(task);
			thread.start();

		}
				
		
	}
	
	
	public void execTask(){
		
		
		
	}
	
	
}
