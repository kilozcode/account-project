package com.qa.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testing {

	@Test
	public void test() {
		
		validUser search = new validUser();
		assertEquals(1, search.searchFirstname("joe"));
		
	}

}
