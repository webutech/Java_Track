package com.yash.annotation.main;

import java.util.ArrayList;
import java.util.List;
import com.yash.annotation.pojo.Document;
public class SupressWarningTest {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List documentList=new ArrayList();
		documentList.add(new Document(1, "A"));
		documentList.add(new Document(2, "B"));
		for (Object document : documentList) {
			System.out.println(((Document)document).getName());
		}

	}

}
