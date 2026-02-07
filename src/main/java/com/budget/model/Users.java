package com.budget.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Users")
public class Users {

    @Id
    @Column(name = "UserId")
    private int UserId;

    @Column(name = "UserName")
    private  String UserName;

    @Column(name = "Gender")
    private  int Gender;
}
