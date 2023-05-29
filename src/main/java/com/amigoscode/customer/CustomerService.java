package com.amigoscode.customer;

import com.amigoscode.exception.ResourceNotFound;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerDao customerDAO;

    public CustomerService(CustomerDao customerDao) {

        this.customerDAO = customerDao;
    }

    public List<Customer> getAllCustomers() {
        return customerDAO.selectAllCustomers();

    }

    public Customer getCustomerById(Integer id) {
        return customerDAO.selectCustomerById(id)
                .orElseThrow(() -> new ResourceNotFound(
                        "customer with id [%s] not found".formatted(id)
                ));
    }

    public Customer getCustomerByName(String name) {
        return customerDAO.selectCustomerByName(name)
                .orElseThrow(() -> new IllegalArgumentException(
                        "customer with id [%s] not found".formatted(name)
                ));
    }
}