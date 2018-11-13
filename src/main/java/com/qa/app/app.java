package com.qa.app;

public class app {

	public static void main(String[] args) {
		System.out.println("Hello world to the standard out");
		service inputdata = new service();
		inputdata.addnewaccount("joe", "black", 1);
		inputdata.addnewaccount("chris", "grind", 2);
		inputdata.addnewaccount("steve", "blogs", 3);
		inputdata.addnewaccount("moe", "stacks", 4);

		account accountsearchedfor = inputdata.findaccount(3);
		app ap = new app();
		ap.printinfo(accountsearchedfor);

	}

	public void printinfo(account person) {
		System.out.println("first name " + person.getFirstName());
		System.out.println("surname " + person.getSurname());
		System.out.println("account number " + person.getAccountNumber());
	}
}
