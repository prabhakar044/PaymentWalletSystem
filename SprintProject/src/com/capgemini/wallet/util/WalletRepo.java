package com.capgemini.wallet.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.capgemini.wallet.entity.WalletAccount;
import com.capgemini.wallet.entity.WalletUser;

public class WalletRepo {
 /*****************************Wallet Repository**********************************
 * 
 * 
 */
	public static Map<Long, WalletAccount> accountmap = new HashMap<>();
	
	
	
	public static void getAccount() {
		Set s1 = accountmap.entrySet();
		Iterator itr = s1.iterator();
		while(itr.hasNext()) {
		Map.Entry<Long , WalletAccount> m1 = (Map.Entry<Long, WalletAccount>) itr.next();
		System.out.println(" Account id is : " + m1.getValue().getAccId() + " Account balance is : " + m1.getValue().getBalance() + " Account status is : " + m1.getValue().getStatus() + " Account username is : " + m1.getValue().getUser().getUserName() +
				" Account phone number is : " + m1.getValue().getUser().getPhoneNumber() + " Account password is : "+m1.getValue().getUser().getPassword());
	}
		
	
	

}}