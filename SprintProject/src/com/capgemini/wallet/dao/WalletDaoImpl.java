package com.capgemini.wallet.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.capgemini.wallet.entity.WalletAccount;
import com.capgemini.wallet.entity.WalletUser;
import com.capgemini.wallet.exceptions.WalletException;
import com.capgemini.wallet.util.WalletRepo;

import java.util.Set;

public class WalletDaoImpl implements WalletDao{
    private Map<Long, WalletAccount> wmap = WalletRepo.accountmap;
    /*****************************Add Account*******************************
     * Authour Name			:	P.Prabhakar
     * Meathod Name			:	AddAccount
     * Parameters			:	WalletAccount Instance
     * Return Type			:	Boolean
     * Descrption			:	This meathod takes account instance and call getAccount meathod
     * 							which validate account id and if it is not null then it throws an error
     * 							and in catch block it is handled by putting the value in the map.
     */
	@Override
	public boolean addAccount(WalletAccount account)  {
		try {
			if(getAccount(account.getAccId()) != null)
				return true;
				
		} catch (WalletException e) {
			wmap.put(account.getAccId(), account);
		}
		return false;
	}
	 /*****************************Get Account*******************************
     * Authour Name			:	P.Prabhakar
     * Meathod Name			:	getAccount
     * Parameters			:	Long walletId
     * Return Type			:	WalletAccount
     * Descrption			:	this meathod takes walletId as an input and it checks for that
     * 							key in map. If it is present it returns that entry and if not present it 
     * 							throws Wallet exception 
     */
	@Override
	public WalletAccount getAccount(long walletID)throws WalletException {
		if(wmap.containsKey(walletID))
			return wmap.get(walletID);
		throw new WalletException("No WalletAccount Found!.");
	}
	
	
	
	
	
}
