package com.yash.cms.dao;

import java.util.List;

import com.yash.cms.model.Contact;

public interface ContactDao {
	
	public void insertContact(Contact contact);
	public void deleteContact(int contactId);
	public void updateContact(Contact contact);
	public List<Contact> getAllContactsByUserId(int userId);

}
