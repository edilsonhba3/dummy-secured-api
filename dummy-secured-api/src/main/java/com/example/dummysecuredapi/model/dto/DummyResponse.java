package com.example.dummysecuredapi.model.dto;

public class DummyResponse 
{
	private String error;
	private Object response;
	private String status;
	
	public String getError() 
	{
		return error;
	}
	
	public void setError(String error) 
	{
		this.error = error;
	}
	
	public Object getResponse() 
	{
		return response;
	}
	
	public void setResponse(Object response)
	{
		this.response = response;
	}
	
	public String getStatus()
	{
		return status;
	}
	
	public void setStatus(String status)
	{
		this.status = status;
	}
	
}
