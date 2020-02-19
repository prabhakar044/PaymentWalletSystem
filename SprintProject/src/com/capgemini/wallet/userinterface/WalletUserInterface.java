package com.capgemini.wallet.userinterface;

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
import com.capgemini.wallet.service.WalletService;
import com.capgemini.wallet.service.WalletServiceImpl;
import com.capgemini.wallet.util.WalletRepo;

public class WalletUserInterface {

	public static void main(String[] args) throws UserIdException,  UserNameException, PasswordException, PhoneNumberException, WalletException {
		Scanner scan = new Scanner(System.in);
		WalletUser w1  = new WalletUser();
		//WalletAccount acc1 = new WalletAccount();
		WalletService ser = new WalletServiceImpl();
		//WalletDao dao =new WalletDaoImpl();
		System.out.println("---------------------Enter your details to create a Wallet Account-----------------------");
		System.out.println("enter the userName");
		String s3 = scan.next();
		w1.setUserName(s3);
		System.out.println("enter the phoneNumber");
		String s2 = scan.next();
		w1.setPhoneNumber(s2);
		System.out.println("enter the password");
		String s4 = scan.next();
		w1.setPassword(s4);
		ser.validateUser(w1);
		ser.bindUser(s3,s2,s4);
		ser.createAccount(s3,s2,s4);
		WalletUser w2  = new WalletUser();
		System.out.println("---------------------Enter your details to create a Wallet Account-----------------------");
		System.out.println("enter the userName");
		String s5 = scan.next();
		w2.setUserName(s5);
		System.out.println("enter the phoneNumber");
		String s6 = scan.next();
		w2.setPhoneNumber(s6);
		System.out.println("enter the password");
		String s7 = scan.next();
		w2.setPassword(s7);
		ser.validateUser(w2);
		ser.bindUser(s5, s6, s7);
		ser.createAccount(s5, s6, s7);
		WalletRepo.getAccount();
		
		
		
	}}
