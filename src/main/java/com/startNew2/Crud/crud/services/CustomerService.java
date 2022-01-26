package com.startNew2.Crud.crud.services;


import com.startNew2.Crud.crud.entity.Customer;
import com.startNew2.Crud.crud.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {


    @Autowired
    CustomerRepository customerRepository;

    //save methodu
    public Customer addCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    //Listeleme methodu
    public List<Customer> findAllCustomer(){
        return customerRepository.findAll();
    }
    //Id ye göre Customer getirme
    public Customer getCustomerById (Long customerId){
        return customerRepository.findById(customerId).get();
    }

    public void deleteCustomerById(Long customerId){
        customerRepository.deleteById(customerId);
    }


}
