package com.example.postgresql.repository;


import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.postgresql.entity.Customer;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CustomerRepositoryTests {

    @Autowired
    private CustomerRepository customers;

    @Test
    public void testFindByLastName() {
        Customer customer = new Customer("first", "last");

        List<Customer> findByLastName = customers.findByLastName(customer.getLastName());

        assertThat(findByLastName).extracting(Customer::getLastName).containsOnly(customer.getLastName());
    }
}