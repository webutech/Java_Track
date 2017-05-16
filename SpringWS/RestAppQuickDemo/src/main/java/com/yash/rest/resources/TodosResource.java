package com.yash.rest.resources;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

import com.yash.rest.pojo.Todo;
import com.yash.rest.service.TodoService;

@Path("todos")
public class TodosResource {

	@Context
	UriInfo uriInfo;
	@Context
	Request request;
	TodoService todoService=new TodoService();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Todo> getTodosAsJSon(){
		return todoService.getTodosAsList();
	}
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public List<Todo> getTodosAsXml(){
		return todoService.getTodosAsList();
	}
	
	//URI: /rest/todos/count
	@GET
	@Path("count")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String getCount(){
		return String.valueOf(todoService.getTodosCount());
	}
	@POST
	@Produces(MediaType.TEXT_HTML)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public void createTodo(
			@FormParam("id") String id,
			@FormParam("task") String task,
			@Context HttpServletResponse servletResponse
			) throws IOException{
		
		Todo todo=new Todo(id, task);
		todoService.createTodo(todo);
		servletResponse.sendRedirect("./todos/");
	}
	@Path("todo")
	public TodoResource getTodo(@PathParam("todo") String id){
		return new TodoResource(uriInfo, request, id);
	}
}
