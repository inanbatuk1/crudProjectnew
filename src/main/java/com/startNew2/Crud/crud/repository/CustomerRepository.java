package com.startNew2.Crud.crud.repository;

import com.startNew2.Crud.crud.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
