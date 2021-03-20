package com.example.demo.controller;

import com.example.demo.model.Contact;
import com.example.demo.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ContactController {

    @Autowired
    ContactService contactService;

    @RequestMapping("/list-contact")
    public String listContact(Model model) {
        List<Contact> contactList = contactService.getContactList();
        model.addAttribute("contacts", contactList);
        return "contact";
    }
}
