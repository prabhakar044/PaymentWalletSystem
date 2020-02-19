package com.capgemini.wallet.service;

import java.util.Random;
import java.util.Scanner;

import com.capgemini.wallet.dao.WalletDao;
import com.capgemini.wallet.dao.WalletDaoImpl;
import com.capgemini.wallet.entity.WalletAccount;
import com.capgemini.wallet.entity.WalletUser;
import com.capgemini.wallet.exceptions.PasswordException;
import com.capgemini.wallet.exceptions.PhoneNumberException;
import com.capgemini.wallet.exceptions.UserIdException;
import com.capgemini.wallet.exceptions.UserNameException;
import com.capgemini.wallet.exceptions.WalletException;

public class WalletServiceImpl implements WalletService {
	private WalletDao dao = new WalletDaoImpl();
	WalletUser user = new WalletUser();
	/*****************************Create Account*******************************
     * Authour Name			:	P.Prabhakar
     * Meathod Name			:	cddAccount
     * Parameters			:	String userName, String contactnNo, String paasword 
     * Return Type			:	WalletAccount
     * Descrption			:	This meathod takes user state variables and binds it with instance of user.
     * 							then it generates a random number for wallet account id and validates the 
     * 							states accros different inputs if it donest not matches then throws different
     * 							Exceptions and if not throws an exception then it adds it into the map
     * Exceptions			:	UserNameException, PhoneNumberException, PasswordException  
     */
	public WalletAccount createAccount(String userName, String contactNo, String password) throws UserIdException, PhoneNumberException, UserNameException, PasswordException, WalletException {
	 user= bindUser(userName, contactNo, password);
	long walletaccid = generateWalletAccountId();
	WalletAccount account = new WalletAccount();
	if(validateUser(user)) {
		account.setUser(user);
		account.setBalance(0.0);
		account.setAccId(walletaccid);
		account.setStatus("Active");
		dao.addAccount(account);
		System.out.println("Account created succesfully");
	}
		return account;
	}
	/*****************************Generate Account Id*******************************
     * Authour Name			:	P.Prabhakar
     * Meathod Name			:	generateWalletAccountId
     * Parameters			:	No parameters
     * Return Type			:	Long WalletId
     * Descrption			:	This meathod takes no input and generates a random number which will
     * 							be assigned as account id while flag is true. Flag is set to false if
     * 							getAccount meathod throws an exception  
     */
	public long generateWalletAccountId() {
		Random rand = new Random();
		long walletId = 0;
		boolean flag = true;
		do {
			walletId = rand.nextInt(900000) + 100000;
			try {
				dao.getAccount(walletId);
			} catch (WalletException e) {
				flag=false;
			}
		} while (flag);
        return walletId;
	}
	/*****************************Validate Wallet User*******************************
     * Authour Name			:	P.Prabhakar
     * Meathod Name			:	validateUser
     * Parameters			:	WalletUser instance
     * Return Type			:	Boolean
     * Descrption			:	This meathod takes Wallet user instance and checks it accross different
     * 							parameters and if matches no exception is thorwn and if not matches
     * 							an appropriate exception is thrown
     * Exception			:	PhoneNumberException, UserNameException, PasswordException
     */
	public boolean validateUser(WalletUser user)throws  PhoneNumberException, UserNameException, PasswordException {
		if (!user.getPhoneNumber().matches("[0-9]{8,10}"))
			throw new PhoneNumberException();
		if (!user.getUserName().matches("[a-zA-Z]{8,20}"))
			throw new UserNameException();
		if (!user.getPassword().matches("[a-z@0-9]{8,15}"))
			throw new PasswordException();
		return true;
	}
	/*****************************Bind With User *******************************
     * Authour Name			:	P.Prabhakar
     * Meathod Name			:	bindUser
     * Parameters			:	String username, string contact number, string password
     * Return Type			:	WalletUser state variables
     * Descrption			:	This meathod takes Wallet user state variables and binds it with
     * 							wallet user instance 
     * Exception			:	PhoneNumberException, UserNameException, PasswordException
     */
	@Override
	public WalletUser bindUser(String userName, String contactNo, String password) {
		WalletUser user = new WalletUser();
		user.setUserName(userName);
		user.setPhoneNumber(contactNo);
		user.setPassword(password);
		return user;
	}

	

}
