package com.yash.capp.dao;

import java.util.List;

import com.yash.capp.domain.Contact;

public interface ContactDao {
	public void insertContact(Contact contact);
	public void deleteContact(int id);
	public List<Contact> allContacts();
	public Contact showContact();

}
