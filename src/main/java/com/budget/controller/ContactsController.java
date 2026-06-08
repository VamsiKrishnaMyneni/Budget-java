package com.budget.controller;

import com.budget.model.Contacts;
import com.budget.service.ContactsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ContactsController {

    private final ContactsService service;

    public ContactsController(ContactsService service) {
        this.service = service;
    }

    @GetMapping("/contacts")
    public List<Contacts> getAllContacts() {
        return service.getAllContacts();
    }

    @GetMapping("/contacts/{id}")
    public Contacts getContactById(@PathVariable Long id) {
        return service.getContactById(id);
    }
}