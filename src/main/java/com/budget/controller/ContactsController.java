package com.budget.controller;

import com.budget.model.Contacts;
import com.budget.service.ContactsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContactsController {

    private final ContactsService service;

    public ContactsController(ContactsService service) {
        this.service = service;
    }

    @GetMapping("/contacts")
    public List<Contacts> getAllContacts() {
        return service.getAllContacts();
    }
}