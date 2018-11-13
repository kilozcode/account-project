package com.qa.testing;

import java.util.HashMap;
import java.util.Map;

import com.qa.app.account;

public class validUser {

	HashMap<Integer, account> map; 
	
	public validUser(HashMap<Integer, account> hashMap) {
		map = hashMap;
	
	}
	
 public int FirstNameCount(String chosenName){
	 int count = 0;
	 for (Map.Entry<Integer, account> entry: map.entrySet()) {
	 account value = entry.getValue();
	 if(value.getFirstName().equals(chosenName)) {
		 count++;
	 }
 }
 return count;
}
}