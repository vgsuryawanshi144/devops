package com.ecomm.user.response.factory;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecomm.user.entity.Customer;
import com.ecomm.user.respons.CustomerResponse;
import com.ecomm.user.respons.ICustomerResponse;
import com.ecomm.user.respons.Status;

@Service()
public class CustomerResponseFactory
{

	public ICustomerResponse getResponse(List<Customer> customer)
	{
		CustomerResponse customerResponse = new CustomerResponse();
		if (customer != null && !customer.isEmpty())
		{
			customerResponse.setStatus_code("200");
			customerResponse.setMessage("Success");
			customerResponse.setData(customer);

		} else
		{
			customerResponse.setStatus_code("404");
			customerResponse.setMessage("Required Data Not Found");
			customerResponse.setData(customer);

		}
		return customerResponse;
	}

	public ICustomerResponse getResponseById(Customer customer)
	{
		CustomerResponse customerResponse = new CustomerResponse();
		if (customer != null)
		{
			customerResponse.setStatus_code("200");
			customerResponse.setMessage("Success");
			customerResponse.setData(customer);
			
		} else
		{
			customerResponse.setStatus_code("404");
			customerResponse.setMessage("Required Data Not Found");
			customerResponse.setData(customer);
		}
		return customerResponse;
	}

	public ICustomerResponse deleteById(long id)
	{
		Status status = null;
		System.out.println("Deleted Successfully" + id);
		return (ICustomerResponse) status;

	}

	public ICustomerResponse save(Customer customer)
	{
		CustomerResponse customerResponse = new CustomerResponse();
		if (customer == null)
		{
			customerResponse.setStatus_code("404");
			customerResponse.setMessage("Incorrect Data");
			customerResponse.setData(customer);
		} else
		{
			customerResponse.setStatus_code("200");
			customerResponse.setMessage("Added Successfully");
			customerResponse.setData(customer);
		}
		return customerResponse;

	}

	public ICustomerResponse update(Customer customer)
	{
		CustomerResponse customerResponse = new CustomerResponse();

		if (customer == null)
		{
			customerResponse.setStatus_code("404");
			customerResponse.setMessage("Incorrect Data");
			customerResponse.setData(customer);
		} else
		{
			customerResponse.setStatus_code("200");
			customerResponse.setMessage("Updated Successfully");
			customerResponse.setData(customer);
		}
		return customerResponse;

	}
}
