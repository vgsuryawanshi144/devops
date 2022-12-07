package com.ecomm.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecomm.user.entity.Customer;
import com.ecomm.user.request.CustomerDetails;
import com.ecomm.user.respons.ICustomerResponse;
import com.ecomm.user.response.factory.ConvertToCustomer;
import com.ecomm.user.response.factory.CustomerResponseFactory;
import com.ecomm.user.serviceimpl.CustomerServiceImpl;

@RestController()
@RequestMapping("/customer")
public class CustomerController {
	@Autowired()
	CustomerServiceImpl customerService;

	@Autowired()
	CustomerResponseFactory customerResponse;

	@Autowired
	ConvertToCustomer convertToCustomer;

	@GetMapping()
	@CrossOrigin
	public ICustomerResponse get(@RequestParam String firstName) {
		List<Customer> customer = customerService.getCustomerDetails(firstName);
		ICustomerResponse iCustomerResponse = customerResponse.getResponse(customer);
		return iCustomerResponse;
	}

	@GetMapping("/{id}")
	@CrossOrigin
	public ICustomerResponse get(@PathVariable long id) {
		Customer customer = customerService.getCustomerById(id);
		ICustomerResponse iCustomerResponse = customerResponse.getResponseById(customer);
		return iCustomerResponse;
	}

	@PostMapping()
	@CrossOrigin
	public ICustomerResponse save(@RequestBody CustomerDetails customerDetailst) {
		Customer customer2 = convertToCustomer.createCustomer(customerDetailst);
		customerService.saveCustomer(customer2);
		ICustomerResponse iCustomerResponse = customerResponse.save(customer2);

		return iCustomerResponse;
	}

	@PatchMapping()
	@CrossOrigin
	public ICustomerResponse update(@RequestBody Customer customer) {
		customerService.saveCustomer(customer);
		ICustomerResponse iCustomerResponse = customerResponse.save(customer);
		return iCustomerResponse;
	}

	@DeleteMapping("/{id}")
	@CrossOrigin
	public ICustomerResponse delete(@PathVariable long id) {
		Customer customer = customerService.deleteById(id);
		ICustomerResponse iCustomerResponse = customerResponse.deleteById(id);
		return iCustomerResponse;
	}

}
