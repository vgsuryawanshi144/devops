package com.ecomm.user.respons;

public class Status {
	String status_code;
	String message;
	Object data;

	public String getStatus_code()
	{
		return status_code;
	}

	public void setStatus_code(String status_code)
	{
		this.status_code = status_code;
	}

	public String getMessage()
	{
		return message;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}

	public Object getData()
	{
		return data;
	}

	public void setData(Object data)
	{
		this.data = data;
	}
}
