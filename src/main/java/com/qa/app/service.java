package com.qa.app;

import java.util.HashMap;

public class service {
	HashMap<Integer, account> accountinfo = new HashMap<Integer, account>();
	 private int key =1; 
	 
	 public void addnewaccount (String firstName, String surname, int accountnumber) {
		 account accountobj = new account();
		 accountobj.setFirstName(firstName);
		 accountobj.setSurname(surname);
		 accountobj.setAccountNumber(accountnumber);
		accountinfo.put(key, accountobj);
		System.out.println("account with account number"+ accountnumber + "and key" + key + "has been created" );
		key++;
		
	 }
	 
	 public account findaccount (int accountID) {
		 account retrievedaccount = accountinfo.get(accountID);
		 return retrievedaccount;
	 }
	 
}
