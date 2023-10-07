package com.example.kinoxpproject.service;

import com.example.kinoxpproject.entity.Customer;
import com.example.kinoxpproject.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public Customer getCustomerById(int customerId) {
        return customerRepository.findById(customerId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Customer with this ID does not exist"));
    }
}
