package com.hacom.api.examen.output;

import java.io.Serializable;

public class WrapperResponse<T> implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer status;
	private String message;
	
	private T result;
	
	
	public WrapperResponse() {
		
	}
	
	public WrapperResponse(Integer status) {
		this.status = status;
	}
	
	public WrapperResponse(Integer status, String message) {
		this.status = status;
		this.message = message;
	}
	
	public WrapperResponse(Integer status, String message, T body) {
		this.status = status;
		this.message = message;
		this.result = body;
	}

	

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getResult() {
		return result;
	}

	public void setResult(T result) {
		this.result = result;
	}
	
	
	
	


}
