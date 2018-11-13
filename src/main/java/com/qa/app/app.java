package com.qa.app;

import com.fasterxml.jackson.core.JsonProcessingException;

public class app {

	public static void main(String[] args) {
		System.out.println("Hello world to the standard out");
		Service inputdata = new Service();
		inputdata.addnewaccount("joe", "black", 1);
		inputdata.addnewaccount("chris", "grind", 2);
		inputdata.addnewaccount("steve", "blogs", 3);
		inputdata.addnewaccount("moe", "stacks", 4);

		account accountsearchedfor = inputdata.findaccount(3);
		app ap = new app();
		try {
			ap.printinfo(accountsearchedfor);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void printinfo(account person) throws JsonProcessingException {
		System.out.println("first name " + person.getFirstName());
		System.out.println("surname " + person.getSurname());
		System.out.println("account number " + person.getAccountNumber());
		System.out.println(person_json.convertPerson(person));
	}
}
