package com.example.demo;

import org.flowable.engine.RepositoryService;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.TaskService;
//import org.flowable.task.service.TaskService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.service.MyService;

@SpringBootApplication
public class DemoApplication {
	

	 public static void main(String[] args) {
	        SpringApplication.run(DemoApplication.class, args);
	    }
	 
	 @Bean
	 public CommandLineRunner init(final MyService myService) {

	     return new CommandLineRunner() {
	         public void run(String... strings) throws Exception {
	             myService.createDemoUsers();
	         }
	     };
	 }

//	    @Bean
//	    public CommandLineRunner init(final RepositoryService repositoryService,
//	                                  final RuntimeService runtimeService,
//	                                  final TaskService taskService) {
//
//	        return new CommandLineRunner() {
//	            @Override
//	            public void run(String... strings) throws Exception {
//	                System.out.println("Number of process definitions : "
//	                    + repositoryService.createProcessDefinitionQuery().count());
//	                System.out.println("Number of tasks : " + taskService.createTaskQuery().count());
//	                runtimeService.startProcessInstanceByKey("oneTaskProcess");
//	                System.out.println("Number of tasks after process start: "
//	                    + taskService.createTaskQuery().count());
//	            }
//	        };
//	    }

}
