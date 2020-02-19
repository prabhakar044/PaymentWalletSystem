package com.capgemini.wallet.exceptions;

public class PhoneNumberException extends Exception {


	@Override
	public String toString() {
		
		return "Phonenumber must contain digits 0-9 of 10 digts";
	}

}
