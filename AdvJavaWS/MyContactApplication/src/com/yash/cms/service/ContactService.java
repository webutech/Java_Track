package com.yash.cms.service;

import java.util.List;

import com.yash.cms.model.Contact;

/**
 * 
 * @author sharma.pankaj
 *
 */
public interface ContactService {

	public void createNewContact(Contact contact);
	public void editContactByContactId(int contactId);
	public List<Contact> listAllContactsByUserId(int userId);
	
}
