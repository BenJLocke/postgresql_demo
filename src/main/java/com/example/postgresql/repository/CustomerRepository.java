package com.example.postgresql.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.postgresql.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

	@Query("select t from Customer t where t.lastName = :lastName")
    List<Customer> findByLastName(@Param("lastName") String lastName);
}
