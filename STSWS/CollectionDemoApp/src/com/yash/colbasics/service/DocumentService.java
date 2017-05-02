package com.yash.colbasics.service;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.yash.colbasics.pojo.Document;
public class DocumentService {	
	List<Document> documents;
	public DocumentService() {
		documents=new ArrayList<>();
		documents.add(new Document(1, "java basics", "basics of java", 101));
		documents.add(new Document(2, "java basics", "basics of java", 101));
		documents.add(new Document(3, "collection", "java collection API", 101));
		documents.add(new Document(4, "multithreading", "java multithreading with executor framework", 102));
		documents.add(new Document(5, "jdbc", "advance jdbc concepts", 101));		
	}	
	public List<Document> getAllDocuments(){
		return documents;
	}
	
	public List<Document> getNonDuplicateDocuments(){
		List<Document> nonDuplicateDocuments=new ArrayList<>();
		System.out.println(documents.size());
		for (int i = 0; i < documents.size()-1; i++) {
			for (int j = i+1; j < documents.size()-1; j++) {
				if(documents.get(i).equals(documents.get(j))){
					continue;
				}
							
			}	
			
		}
		return nonDuplicateDocuments;
	}
}
