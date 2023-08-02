package com.kk.industrylevelproject.daoImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kk.industrylevelproject.model.Student;
import com.kk.industrylevelproject.service.IStudentService;

@PropertySource({ "classpath:jdbcQueries.properties" })
@Repository("studentRepository")
public class StudentRepoImpl implements IStudentService {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private NamedParameterJdbcOperations namedParameter;

	@Value("${add_student_details}")
	private String addStudentDetails;

	@Override
	public Long insertStudentDetails(JsonNode studentObj) {
		ObjectMapper mapper = new ObjectMapper();
		Student student;
		Long id = 0l;
		try {
			student = mapper.treeToValue(studentObj, Student.class);

			GeneratedKeyHolder keyHolder = new GeneratedKeyHolder();

			MapSqlParameterSource parameters = new MapSqlParameterSource()

					.addValue("param1", student.getStudentName())
					.addValue("param2", student.getStudentLastName())
					.addValue("param3", student.getStudentClgName())
					.addValue("param4", student.getStudentBranch());

			namedParameter.update(addStudentDetails, parameters, keyHolder);

			id = keyHolder.getKey().longValue();
			
			if (id > 0) {
				student.setStudentID(id);
			}

		} catch (JsonProcessingException e) {

			logger.error("context", e);

		} catch (Exception ex) {

			logger.error("context", ex);

		}
		return id;
	}

}
