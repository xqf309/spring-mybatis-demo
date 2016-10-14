package com.jd.feima.activiti;

import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.TaskListener;

public class myTaskAssignHandler implements TaskListener{

	@Override
	public void notify(DelegateTask delegateTask) {
		delegateTask.setAssignee("xqf");
		delegateTask.addCandidateUser("fozzie");
		
	}
	
}
