package com.capgemini.wallet.exceptions;

public class UserNameException extends Exception{

	@Override
	public String toString() {
		
		return "username must aplhabets a-z minmum 8 leters maximum 20";
	}

	

}
