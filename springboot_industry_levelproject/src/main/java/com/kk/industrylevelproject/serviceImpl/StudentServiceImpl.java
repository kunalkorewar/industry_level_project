package com.kk.industrylevelproject.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;
import com.kk.industrylevelproject.daoImpl.StudentRepoImpl;
import com.kk.industrylevelproject.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private StudentRepoImpl studentRepo;

	@Override
	public Long insertStudentDetails(JsonNode studentObj) {
		Long id = studentRepo.insertStudentDetails(studentObj);
		return id;
	}

}
