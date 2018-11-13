package com.qa.testing;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qa.app.Service;


public class Testing {

	@Test
	public void test() {
		
		Service service = new Service();
		service.addnewaccount("steve", "blogs", 3);
		service.addnewaccount("joe", "blogs", 4);
		service.addnewaccount("joe", "blogs", 5);
		validUser userCheck = new validUser(service.retrieveMap());
		assertEquals(2,userCheck.FirstNameCount("joe"));
		
	}

}
