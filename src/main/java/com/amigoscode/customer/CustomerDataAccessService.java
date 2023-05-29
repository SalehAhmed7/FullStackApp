package com.amigoscode.customer;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class CustomerDataAccessService implements CustomerDao {

    private static List<Customer> customers;

    static {
        customers = new ArrayList<>();

        Customer saleh = new Customer(
                1, "Saleh",
                "Saleh@gmail.com", 23);
        customers.add(saleh);


        Customer hanbal = new Customer(
                2, "Hanbal",
                "Hanbal@gmail.com", 63);
        customers.add(hanbal);
    }

    @Override
    public List<Customer> selectAllCustomers() {
        return customers;
    }

    @Override
    public Optional<Customer> selectCustomerById(Integer id) {
        return customers.stream()
                .filter(c -> c.getId().equals(id)).findFirst();
    }

    @Override
    public Optional<Customer> selectCustomerByName(String name) {
        return selectCustomerByName(name);
    }


}
