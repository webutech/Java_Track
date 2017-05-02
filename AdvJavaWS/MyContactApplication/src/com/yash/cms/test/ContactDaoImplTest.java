package com.yash.cms.test;

import java.util.List;

import com.yash.cms.dao.ContactDao;
import com.yash.cms.daoimpl.ContactDaoImpl;
import com.yash.cms.model.Contact;

public class ContactDaoImplTest {

	public static void main(String[] args) {
		ContactDao contactDao=new ContactDaoImpl();
		List<Contact> contacts=null;
		contacts=contactDao.getAllContactsByUserId(10);
		for (Contact contact : contacts) {
			System.out.println(contact.getName());
		}

	}

}
