package com.example.demo.service;

import com.example.demo.model.Contact;
import com.example.demo.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    public List<Contact> getContactList() {
        //insert into contact (name, email, country)
        // VALUES ('Maloya Nitini', 'nitini@gmail.com', 'america');

        Contact contact = new Contact();
        contact.setName("Mohamed Nazir");
        contact.setEmail("nasirzeo@gmail.com");
        contact.setCountry("Sri Lanka");
        contactRepository.save(contact);

        //updating contact SET email = 'nasirinfo@gmail.com' WHERE id = 1;
        Contact updatedContact = contactRepository.findById(1).orElse(null);
        updatedContact.setEmail("nasirinfo@gmail.com");
        contactRepository.save(updatedContact);

        //DELETE FROm contact  WHERE id = 1;
        contactRepository.deleteById(1);

        //SELECT * FROM Contact
        return contactRepository.findAll();
    }
}
