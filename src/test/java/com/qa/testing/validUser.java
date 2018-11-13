package com.qa.testing;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import com.qa.app.account;

public class validUser {

	HashMap<Integer, account> map; 
	
	public validUser(HashMap<Integer, account> hashMap) {
		map = hashMap;
	
	}
	
 public int FirstNameCount(String chosenName){
	 return map.entrySet().stream().filter(e -> chosenName.equals(e.getValue().getFirstName()))
      .collect(Collectors.toList()).size();
}
}