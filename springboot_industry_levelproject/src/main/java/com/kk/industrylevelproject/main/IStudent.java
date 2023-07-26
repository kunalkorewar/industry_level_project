package com.kk.industrylevelproject.main;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.databind.JsonNode;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "Student", value = "Student Controller")
@RequestMapping("/studentWebService")
public interface IStudent {

	@ApiOperation(value = "Add API for student")
	public ResponseEntity<Object> insertStudentDetails(@RequestBody JsonNode studentObj);

}
