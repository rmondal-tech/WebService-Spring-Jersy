package com.java.spring.jersey.error;

import javax.xml.bind.annotation.XmlRootElement;
//I want to display my exception details as an XML, so created a simple java model ErrorProps.java and annotated
//with @XmlRootElement-Maps a class or an enum type to an XML element. 

@XmlRootElement
public class DisplayCustomException {


	private String status;
	private String errorMessage;
	
	public DisplayCustomException(){}
	
	public DisplayCustomException(String statusFromOutside, String errorMessageFromOutside)
	{
		this.status = statusFromOutside;
		this.errorMessage = errorMessageFromOutside;
	}
	
	
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}	

}