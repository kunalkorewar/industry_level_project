package com.kk.industrylevelproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.kk.industrylevelproject.main.IStudent;
import com.kk.industrylevelproject.util.IndustryLevelProjectResponseHandler;
import com.kk.industrylevelproject.model.Constants;
import com.kk.industrylevelproject.serviceImpl.StudentServiceImpl;

@RestController
public class StudentController extends Constants implements IStudent {

	@Autowired
	private StudentServiceImpl studentService;

	@Override
	@PostMapping("/addStudent")
	public ResponseEntity<Object> insertStudentDetails(@RequestBody JsonNode studentObj) {
		Long id = studentService.insertStudentDetails(studentObj);
		return IndustryLevelProjectResponseHandler.getResponseId(id, SUCCESSMESSAGE, FAILUREMESSAGE);
	}

}
