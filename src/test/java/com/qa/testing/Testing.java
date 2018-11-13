package com.qa.testing;

import static org.junit.Assert.*;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.qa.app.Service;
import com.qa.app.account;
import com.qa.app.person_json;


public class Testing {

	@Test
	public void test() {
		
		Service service = new Service();
		service.addnewaccount("steve", "blogs", 3);
		service.addnewaccount("joe", "blogs", 4);
		service.addnewaccount("joe", "blogs", 5);
		validUser userCheck = new validUser(service.retrieveMap());
		assertEquals(2,userCheck.FirstNameCount("joe"));
		Service s = new Service();
		s.addnewaccount("scott", "summers", 1);
		account a = s.findaccount(1);
		assertEquals("scott", a.getFirstName());

		
		
		
	}
	@Test
	public void test2() {
		account newAcc = new account ();
		newAcc.setSurname("black");
		assertEquals("black", newAcc.getSurname());
		
	}
	@Test
	public void test3() {
		account newAcc = new account ();
		newAcc.setFirstName("joe");
		assertEquals("joe", newAcc.getFirstName());
		

}
	
	@Test
	public void test4() {
		account a = new account() ;
		a.setFirstName("billy");
		a.setSurname("bob");
		a.setAccountNumber(1);
		String output = "";
		try {
			output = person_json.convertPerson(a);
		}
		catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		assertEquals("{\r\n" + 
				"  \"firstName\" : \"billy\",\r\n" + 
				"  \"surname\" : \"bob\",\r\n" + 
				"  \"accountNumber\" : 1\r\n" + 
				"}",output);
	
	
			}
		}
	
