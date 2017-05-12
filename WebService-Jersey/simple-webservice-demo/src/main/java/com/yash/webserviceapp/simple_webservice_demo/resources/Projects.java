package com.yash.webserviceapp.simple_webservice_demo.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.yash.webserviceapp.simple_webservice_demo.pojo.Project;
import com.yash.webserviceapp.simple_webservice_demo.service.ProjectService;

@Path("/projects")
public class Projects {
	
	ProjectService projectService=new ProjectService();

//	@GET
//	@Produces(MediaType.TEXT_PLAIN)
//	public String hello(){
//		return "Hello from my WebService";
//	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Project> getAllProjects(){
		return projectService.getAllProjects();
	}
}
