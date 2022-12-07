package com.ecomm.user.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecomm.user.entity.Customer;

@Repository()
public interface CustomerRepo extends CrudRepository<Customer, Long> {

	List<Customer> findByFirstName(String firstName);

}
