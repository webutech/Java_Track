package com.yash.colbasics.startup;

import java.util.List;
import java.util.Set;

import com.yash.colbasics.pojo.Document;
import com.yash.colbasics.service.DocumentService;

public class ShowNonDuplicateDocuments {

	public static void main(String[] args) {
		DocumentService documentService=new DocumentService();
		int documentCount=0;
		boolean check=false;
		List<Document> documents=documentService.getNonDuplicateDocuments();
		System.out.println("------------Non Duplicate Documents Report--------------");
		for (Document document : documents) {
			System.out.println("-------------------------------------------------------------------------");
			System.out.println(++documentCount+":"+document);
			System.out.println("-------------------------------------------------------------------------");			
		}
	}
}
