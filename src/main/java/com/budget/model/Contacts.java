package com.budget.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "contacts")
public class Contacts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ContactName;

    private String PhoneNumber;

    public Contacts(String name, String phone) {
        this.ContactName = name;
        this.PhoneNumber = phone;
    }
}
