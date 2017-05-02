package com.ezeon.capp.domain;
public class Contact extends BaseContact {
    int contactId;
    int userId;
  
    String category;

   

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "{name: "+name+", contactId: "+contactId+"}";
    }


    
}
