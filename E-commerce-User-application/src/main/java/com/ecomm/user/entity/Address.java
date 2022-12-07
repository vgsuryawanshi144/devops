package com.ecomm.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cust_address")
public class Address
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	@Column(name = "attention")
	private String attention;
	
	@Column(name = "line_1")
	private String line_1;
	
	@Column(name = "line_2")
	private String line_2;
	
	@Column(name = "landmark")
	private String landmark;
	
	@Column(name = "street_number")
	private String streetNumber;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "state")
	private String State;
	
	@Column(name = "pin_code")
	private String pincode;
	
	@OneToOne(mappedBy = "address")
	private Customer customer;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getAttention()
	{
		return attention;
	}

	public void setAttention(String attention)
	{
		this.attention = attention;
	}

	public String getLine_1()
	{
		return line_1;
	}

	public void setLine_1(String line_1)
	{
		this.line_1 = line_1;
	}

	public String getLine_2()
	{
		return line_2;
	}

	public void setLine_2(String line_2)
	{
		this.line_2 = line_2;
	}

	public String getLandmark()
	{
		return landmark;
	}

	public void setLandmark(String landmark)
	{
		this.landmark = landmark;
	}

	public String getStreetNumner()
	{
		return streetNumber;
	}

	public void setStreetNumner(String streetNumber)
	{
		this.streetNumber = streetNumber;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public String getState()
	{
		return State;
	}

	public void setState(String state)
	{
		State = state;
	}

	public String getPincode()
	{
		return pincode;
	}

	public void setPincode(String string)
	{
		this.pincode = string;
	}

}

