package com.capgemini.wallet.dao;

import java.util.HashMap;
import java.util.Map;

import com.capgemini.wallet.entity.WalletAccount;
import com.capgemini.wallet.entity.WalletUser;
import com.capgemini.wallet.exceptions.WalletException;

public interface WalletDao {
	public boolean addAccount(WalletAccount account)throws WalletException;
	public WalletAccount getAccount(long walletId)throws WalletException;
	
}
