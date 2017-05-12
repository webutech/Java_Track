package com.yash.webserviceapp.simple_webservice_demo.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.yash.webserviceapp.simple_webservice_demo.pojo.Project;

public class ProjectService {
	
	public List<Project> getAllProjects(){
		Project project1=new Project(1, "Monsento", new Date(), "Pankaj");
		Project project2=new Project(2, "Farmer First", new Date(), "Rakesh");
		List<Project> projects=new ArrayList<Project>();
		projects.add(project1);
		projects.add(project2);
		return projects;
	}

}
