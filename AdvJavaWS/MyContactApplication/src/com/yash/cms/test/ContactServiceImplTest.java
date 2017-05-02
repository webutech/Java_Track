package com.yash.cms.test;

import com.yash.cms.model.Contact;
import com.yash.cms.service.ContactService;
import com.yash.cms.serviceimpl.ContactServiceImpl;

public class ContactServiceImplTest {

	public static void main(String[] args) {
		ContactService contactService=new ContactServiceImpl();
		Contact contact=new Contact();
		contact.setUserid(12);
		contact.setName("Sweta");
		contactService.createNewContact(contact);

	}

}
