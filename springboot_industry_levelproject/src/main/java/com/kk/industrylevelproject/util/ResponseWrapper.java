package com.kk.industrylevelproject.util;

import java.util.List;

import lombok.Data;

@Data
public class ResponseWrapper {

	private String httpStatus;
	private Boolean isSuccess;
	private String message;
	private Object data;
	private List<ErrorInfo> errorInfo;

	public ResponseWrapper(String httpStatus, Boolean isSuccess, String message, Object data,
			List<ErrorInfo> errorInfo) {
		super();
		this.httpStatus = httpStatus;
		this.isSuccess = isSuccess;
		this.message = message;
		this.data = data;
		this.errorInfo = errorInfo;
	}

	public ResponseWrapper(String httpStatus, Boolean isSuccess, String message, List<Object> data,
			List<ErrorInfo> errorInfo) {
		super();
		this.httpStatus = httpStatus;
		this.isSuccess = isSuccess;
		this.message = message;
		this.data = data;
		this.errorInfo = errorInfo;
	}

	public ResponseWrapper(String httpStatus, Boolean isSuccess, String message, List<ErrorInfo> errorInfo) {
		this(httpStatus, isSuccess, message, null, errorInfo);

	}

	public ResponseWrapper(String httpStatus, Boolean isSuccess, String message, Object data) {
		this(httpStatus, isSuccess, message, data, null);

	}

}
