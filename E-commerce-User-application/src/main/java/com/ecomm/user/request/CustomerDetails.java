package com.ecomm.user.request;

public class CustomerDetails {
	private String firstName;
	private String lastName;
	private String email;
	private String mobile;
	private String addressOne;
	private String addressTwo;
	private String city;
	private String state;
	private String zip;
	private String paymentmode;

	// Getter Methods

	public String getFirstName()
	{
		return firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public String getEmail()
	{
		return email;
	}

	public String getMobile()
	{
		return mobile;
	}

	public String getAddressOne()
	{
		return addressOne;
	}

	public String getAddressTwo()
	{
		return addressTwo;
	}

	public String getCity()
	{
		return city;
	}

	public String getState()
	{
		return state;
	}

	public String getZip()
	{
		return zip;
	}

	public String getPaymentmode()
	{
		return paymentmode;
	}

	// Setter Methods

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public void setMobile(String mobile)
	{
		this.mobile = mobile;
	}

	public void setAddressOne(String addressOne)
	{
		this.addressOne = addressOne;
	}

	public void setAddressTwo(String addressTwo)
	{
		this.addressTwo = addressTwo;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public void setState(String state)
	{
		this.state = state;
	}

	public void setZip(String zip)
	{
		this.zip = zip;
	}

	public void setPaymentmode(String paymentmode)
	{
		this.paymentmode = paymentmode;
	}
}
