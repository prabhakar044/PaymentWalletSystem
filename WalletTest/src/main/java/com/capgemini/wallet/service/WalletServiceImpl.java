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
		System.out.println("Account created successfully");
	}
		return account;
	}
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
	public boolean validateUser(WalletUser user)throws UserIdException, PhoneNumberException, UserNameException, PasswordException {
		if (!user.getPhoneNumber().matches("[0-9]{8,10}"))
			throw new PhoneNumberException();
		if (!user.getUserName().matches("[a-zA-Z]{8,20}"))
			throw new UserNameException();
		if (!user.getPassword().matches("[a-z@0-9]{8,15}"))
			throw new PasswordException();
		return true;
	}
	public WalletUser bindUser(String userName, String contactNo, String password) {
		WalletUser user = new WalletUser();
		user.setUserName(userName);
		user.setPhoneNumber(contactNo);
		user.setPassword(password);
		return user;
	}

	

}
