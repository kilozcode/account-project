package com.qa.app;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class person_json {
	public static String convertPerson(account incomingAccount) throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		String JsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(incomingAccount);
		return JsonString;
	}

}
