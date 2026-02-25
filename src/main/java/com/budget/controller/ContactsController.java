package com.budget.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactsController {

    @RequestMapping("")
    public String getContacts() {
return "vamsi krishna";
    }

}
