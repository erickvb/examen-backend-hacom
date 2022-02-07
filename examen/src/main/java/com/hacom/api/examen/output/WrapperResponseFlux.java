package com.hacom.api.examen.output;

import java.io.Serializable;

import com.hacom.api.examen.dto.TraceMsgDto;

import reactor.core.publisher.Flux;

public class WrapperResponseFlux<T> implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer status;
	private String message;
	
	private Flux<T> result;
	
	
	public WrapperResponseFlux() {
		
	}
	
	public WrapperResponseFlux(Integer status) {
		this.status = status;
	}
	
	public WrapperResponseFlux(Integer status, String message) {
		this.status = status;
		this.message = message;
	}
	
	

	public WrapperResponseFlux(Integer status, String message, Flux<T> resFlux) {
		this.status = status;
		this.message = message;
		this.setResult(resFlux);
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

	public Flux<T> getResult() {
		return result;
	}

	public void setResult(Flux<T> result) {
		this.result = result;
	}

	
	
	
	
	


}
