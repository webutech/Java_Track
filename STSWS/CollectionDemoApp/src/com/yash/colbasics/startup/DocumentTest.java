package com.yash.colbasics.startup;
import java.util.List;
import com.yash.colbasics.pojo.Document;
import com.yash.colbasics.service.DocumentService;
public class DocumentTest {
	public static void main(String[] args) {
		DocumentService documentService=new DocumentService();
		List<Document> documents=documentService.getAllDocuments();
		int documentCount=0;
		System.out.println("------------Document Report--------------");
		for (Document document : documents) {
			System.out.println("-------------------------------------------------------------------------");
			System.out.println(++documentCount+":"+document);
			System.out.println("-------------------------------------------------------------------------");
		}
	}
}
