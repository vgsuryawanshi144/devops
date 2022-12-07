package com.ecomm.user.response.factory;

import org.springframework.stereotype.Service;

import com.ecomm.user.entity.Address;
import com.ecomm.user.entity.Customer;
import com.ecomm.user.request.CustomerDetails;

@Service
public class ConvertToCustomer
{
	
	public Customer createCustomer(CustomerDetails customerDetailst)
	{
		Customer customer =  new Customer();
		customer.setFirstName(customerDetailst.getFirstName());
		customer.setLastName(customerDetailst.getLastName());
		customer.seteMail(customerDetailst.getEmail());
		customer.setMobileNumber(customerDetailst.getMobile());
		Address address =  createAddress(customerDetailst);
		
	
		return customer;
	}
	
	public Address createAddress(CustomerDetails customerDetailst)
	{
		Address address = new Address();
		address.setAttention(customerDetailst.getFirstName());
		address.setCity(customerDetailst.getCity());
		address.setLandmark(customerDetailst.getAddressOne());
		address.setPincode(customerDetailst.getZip());
		address.setState(customerDetailst.getState());
		address.setLine_1(customerDetailst.getAddressOne());
		address.setLine_2(customerDetailst.getAddressTwo());
		return address;
//		
//		
//		  "itmes": [
//		            {
//		              "name": "string",
//		              "pid": "string",
//		              "price": 10,
//		              "qty": 10
//		            }
//		          ],
//		          "orderDate": "string",
//		          "orderNumber": 10,
//		          "orderTotal":10
//		
//		private long id;
//		private String orderNumber;
//		private String weight;
//		private Date expiryOfDelivery;
//		private double fertilizersPrice;
//		private double delveiryCharges;
//		private String deliveyPersonContact;
//		@ManyToOne
//		@JoinColumn(name="customer_id", nullable=false)
//		private Customer customer;
		
	
		
	}

}
