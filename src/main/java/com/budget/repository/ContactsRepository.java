package com.budget.repository;

import com.budget.model.Contacts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactsRepository extends JpaRepository<Contacts, Long> {
//    Optional<Contacts> contact = repository.findById(5L);
}