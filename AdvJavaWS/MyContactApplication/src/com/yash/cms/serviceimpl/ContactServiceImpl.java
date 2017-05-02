package com.yash.cms.serviceimpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.yash.cms.dao.ContactDao;
import com.yash.cms.daoimpl.ContactDaoImpl;
import com.yash.cms.model.Contact;
import com.yash.cms.service.ContactService;

public class ContactServiceImpl implements ContactService {
	 private static final Logger logger=
				LoggerFactory.getLogger(ContactServiceImpl.class);

	private ContactDao contactDao=null;
	public ContactServiceImpl() {
		contactDao=new ContactDaoImpl();
	}
	@Override
	public void createNewContact(Contact contact) {
		contactDao.insertContact(contact);
		logger.info("Success :  New Contact Created...");

	}

	@Override
	public void editContactByContactId(int contactId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Contact> listAllContactsByUserId(int userId) {
		
		return contactDao.getAllContactsByUserId(userId);
	}

}
