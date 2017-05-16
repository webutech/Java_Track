package com.yash.rest.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.xml.bind.JAXBElement;

import com.yash.rest.pojo.Todo;
import com.yash.rest.service.TodoService;

public class TodoResource {
	@Context
	UriInfo uriInfo;
	@Context
	Request request;
	String id;
	TodoService todoService;
	public TodoResource(UriInfo uriInfo, Request request, String id) {
		super();
		this.uriInfo = uriInfo;
		this.request = request;
		this.id = id;
		todoService=new TodoService();
	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Todo getToDoAsJson(){
		Todo todo=todoService.getTodo(id);
		return todo;
	}
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public Todo getToDoAsXml(){
		Todo todo=todoService.getTodo(id);
		return todo;
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_XML)
	public Response putTodo(JAXBElement<Todo> todoElement){
		Todo todo=todoElement.getValue();
		Response response;
		if(todoService.getTodos().containsKey(todo.getId())){
			response=Response.noContent().build();
		}else{
			response=Response.created(uriInfo.getAbsolutePath()).build();
		}
		todoService.createTodo(todo);
		return response;
	}
	
	@DELETE
	@Path("{id}")
	public void deleteTodo(@PathParam("id") String id){
		todoService.deleteTodo(id);
	}
	

}
