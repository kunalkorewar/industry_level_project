package com.kk.industrylevelproject.dao;

import org.springframework.web.bind.annotation.RequestBody;

import com.fasterxml.jackson.databind.JsonNode;

public interface IStudentRepo {

	public Long insertStudentDetails(@RequestBody JsonNode studentObj);

}
