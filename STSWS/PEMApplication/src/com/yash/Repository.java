package com.yash;

import java.util.ArrayList;
import java.util.List;

public class Repository {

	public List<Expense> expList=new ArrayList<>();;
	public List<Category> catList=new ArrayList<>();
	private static Repository repository;
	private Repository() {
		catList.add(new Category("Electric Bill"));
		catList.add(new Category("Rent"));		
	}
	
	public static Repository getRepository(){
		if(repository==null){
			repository=new Repository();
		}
		
		return repository;
	}
		
}
