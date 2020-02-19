package com.capgemini.wallet.exceptions;

public class UserIdException extends Exception {

	@Override
	public String toString() {
		
		return "Userid must contain aplhabets a-z followedby digits 0-9";
	}

	
}
