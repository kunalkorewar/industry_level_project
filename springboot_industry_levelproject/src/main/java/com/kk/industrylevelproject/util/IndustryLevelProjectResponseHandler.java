package com.kk.industrylevelproject.util;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class IndustryLevelProjectResponseHandler {

	private static final Logger logger = LoggerFactory.getLogger(IndustryLevelProjectResponseHandler.class);

	public static ResponseEntity<Object> getResponseId(Long id, String successMessage, String failureMessage) {

		try {

			if (id > 0) {
				return new ResponseEntity<>(
						new ResponseWrapper(HttpStatus.OK.toString(), true, successMessage, id, null), HttpStatus.OK);
			} else {
				return new ResponseEntity<>(
						new ResponseWrapper(HttpStatus.BAD_REQUEST.toString(), false, failureMessage, null, null),
						HttpStatus.BAD_REQUEST);
			}

		} catch (Exception e) {
			logger.error(e.getMessage());
			logger.error(Arrays.toString(e.getStackTrace()));
			return new ResponseEntity<>(
					new ResponseWrapper(HttpStatus.INTERNAL_SERVER_ERROR.toString(), false, null, null),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

}
