package com.jd.feima.activiti;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.runtime.ProcessInstance;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

public class VerySimpleLeaveProcessTest {
	
	@Test
	public void testStartProcess() throws Exception{
		
		//创建流程引擎，使用内存数据库
		ProcessEngine processEngine = ProcessEngineConfiguration
                .createStandaloneInMemProcessEngineConfiguration()
                .buildProcessEngine();
		
		//部署流程定义文件
		RepositoryService repositoryService = processEngine.getRepositoryService();
		repositoryService.createDeployment().addClasspathResource("activiti/leave.bpmn").deploy();
		
		//验证已部署流程
		ProcessDefinition processDefiniton = repositoryService.createProcessDefinitionQuery().singleResult();
		System.out.println(processDefiniton.getKey());
		
		RuntimeService runtimeService =processEngine.getRuntimeService();
		ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("myProcess");
		
		System.out.println("pid ="+ processInstance.getId()+",pdid="+processInstance.getProcessDefinitionId());
	}

}
