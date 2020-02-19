package com.capgemini.wallet.exceptions;

public class PasswordException extends Exception {


	@Override
	public String toString() {
		
		return "Password must contain aplhabets a-z followed by @ and digits 0-9";
	}
	
}
