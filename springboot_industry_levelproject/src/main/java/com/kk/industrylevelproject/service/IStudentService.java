package com.kk.industrylevelproject.service;

import org.springframework.web.bind.annotation.RequestBody;
import com.fasterxml.jackson.databind.JsonNode;


public interface IStudentService {

	public Long insertStudentDetails(@RequestBody JsonNode studentObj);

}
