package com.budget.service;

import com.budget.model.Contacts;
import com.budget.repository.ContactsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactsService {

    private final ContactsRepository repository;

    public ContactsService(ContactsRepository repository) {
        this.repository = repository;
    }

    public List<Contacts> getAllContacts() {
        try {
            return repository.findAll();
        } catch (Exception e) {
            throw new RuntimeException(e + "in getAllContacts");
        }
    }

    public Contacts getContactById(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Contact not found"));
    }
}