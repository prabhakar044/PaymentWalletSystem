package com.capgemini.wallet.service;

import com.capgemini.wallet.entity.WalletAccount;
import com.capgemini.wallet.entity.WalletUser;
import com.capgemini.wallet.exceptions.PasswordException;
import com.capgemini.wallet.exceptions.PhoneNumberException;
import com.capgemini.wallet.exceptions.UserIdException;
import com.capgemini.wallet.exceptions.UserNameException;
import com.capgemini.wallet.exceptions.WalletException;

public interface WalletService {
	
	
	WalletAccount createAccount(String userName, String contactNo, String password)throws WalletException, UserIdException,PhoneNumberException,UserNameException,PasswordException;
	
	
	public WalletUser bindUser(String userName, String contactNo, String password);
	public long generateWalletAccountId();
	boolean validateUser(WalletUser user) throws UserIdException, PhoneNumberException, UserNameException, PasswordException;
}
