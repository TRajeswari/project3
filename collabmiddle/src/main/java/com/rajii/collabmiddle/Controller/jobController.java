package com.rajii.collabmiddle.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import collabmiddleBackEnd.Model.Jobs;



@RestController
public class jobController 

{
	public jobController()
	{
		System.out.println("job is loading");
	}
	@RequestMapping("/getjobs")
	public List<Jobs> getJobs()
	{
	
	Jobs jobs1= new Jobs();
	Jobs jobs2 = new Jobs();
	
	jobs1.setJobtype("SystemOperator");
	jobs1.setJobDiscription("Projects");
	jobs1.setJobrole("AssistantManager");
	

	jobs2.setJobtype("Probationary Officer");
	jobs2.setJobDiscription("Banking Sector");
	jobs2.setJobrole("Cashier");
	
	List<Jobs> list= new ArrayList<Jobs>();
	
	list.add(jobs1);
	list.add(jobs2);
	
	return  list;
	
	
	

}
}
