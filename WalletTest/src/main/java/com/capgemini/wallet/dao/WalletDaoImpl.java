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
   
	public boolean addAccount(WalletAccount account)  {
		try {
			if(getAccount(account.getAccId()) != null)
				return true;
				
		} catch (WalletException e) {
			wmap.put(account.getAccId(), account);
		}
		return false;
	}

	public WalletAccount getAccount(long walletID)throws WalletException {
		if(wmap.containsKey(walletID))
			return wmap.get(walletID);
		throw new WalletException("No WalletAccount Found!.");
	}
	
	
	
	
	
}
