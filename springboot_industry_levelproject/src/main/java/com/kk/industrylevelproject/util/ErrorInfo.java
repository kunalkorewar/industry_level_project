package com.kk.industrylevelproject.util;

import java.io.Serializable;

import lombok.Data;

@Data
public class ErrorInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	// type can be error, warning, exception
	private String type;
	private String message;

	public ErrorInfo(String type, String message) {
		super();
		this.type = type;
		this.message = message;
	}

	public ErrorInfo() {
		super();
	}

}
