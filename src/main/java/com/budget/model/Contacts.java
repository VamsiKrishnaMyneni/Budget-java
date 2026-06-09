package com.budget.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Contacts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "contactname")
    private String contactName;

    @Column(name = "phonenumber")
    private String phoneNumber;

    public Contacts() {
    }
}
