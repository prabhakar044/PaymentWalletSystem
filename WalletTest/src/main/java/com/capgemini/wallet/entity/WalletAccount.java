package com.capgemini.wallet.entity;

public class WalletAccount {
	
	private long accId;
	private double balance;
	private String status;
	WalletUser user = new WalletUser();
	/****************Parametrized Constructor***************
	 * Authour Name			:	P.Prabhakar 
	 * Description			:   This meathods sets the Wallet account state varibles at the time of object creation
	 * Meathod Name			:	WalletAccount
	 * Meathod parameters	:	Long account id, Double account balance, String wallet status, Walletuser user 
	 * Meathod return type	:	no return type
	 *     
	 */
	public WalletAccount(long accId, double balance, String status, WalletUser user) {
		super();
		this.accId = accId;
		this.balance = balance;
		this.status = status;
		this.user = user;
	}
	
	
	public WalletAccount() {
		super();
	}
	/****************Get Wallet Account***************
	 * Authour Name			:	P.Prabhakar 
	 * Description			:   This meathods gets the wallet user account id
	 * Meathod Name			:	getAccId
	 * Meathod parameters	:	No parameters
	 * Meathod return type	:	Long 
	 *     
	 */

	public long getAccId() {
		return accId;
	}
	/****************Set Wallet Account***************
	 * Authour Name			:	P.Prabhakar 
	 * Description			:   This meathods sets the wallet user account id
	 * Meathod Name			:	setAccId
	 * Meathod parameters	:	Long account id 
	 * Meathod return type	:	void
	 *     
	 */
	public void setAccId(long accId) {
		this.accId = accId;
	}
	/****************Get Wallet Status***************
	 * 
	 * Authour Name			:	P.Prabhakar 
	 * Description			:   This meathod gets the wallet user account status
	 * Meathod Name			:	getStatus
	 * Meathod parameters	:	No parameters
	 * Meathod return type	:	String 
	 *     
	 */

	public String getStatus() {
		return status;
	}
	/****************Set Wallet Status***************
	 * 
	 * Authour Name			:	P.Prabhakar 
	 * Description			:   This meathod sets the wallet user account status
	 * Meathod Name			:	setStatus
	 * Meathod parameters	:	String
	 * Meathod return type	:	void 
	 *     
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/****************Get Wallet Account User Details***************
	 * 
	 * Authour Name			:	P.Prabhakar 
	 * Description			:   This meathod gets the wallet account user details
	 * Meathod Name			:	getUser
	 * Meathod parameters	:	No parameters
	 * Meathod return type	:	WalletUser 
	 *     
	 */
	public WalletUser getUser() {
		return user;
	}
	/****************Set Wallet Account User Details***************
	 * 
	 * Authour Name			:	P.Prabhakar 
	 * Description			:   This meathod sets the wallet account user details
	 * Meathod Name			:	setUser
	 * Meathod parameters	:	Wallet user instance
	 * Meathod return type	:	void 
	 *     
	 */
	public void setUser(WalletUser user) {
		this.user=user;
	}
	/****************Get Wallet Account Balance***************
	 * 
	 * Authour Name			:	P.Prabhakar 
	 * Description			:   This meathod gets the wallet account balancce
	 * Meathod Name			:	getBalance
	 * Meathod parameters	:	No parameters
	 * Meathod return type	:	Double 
	 *     
	 */
	public double getBalance() {
		return balance;
	}
	/****************Set Wallet Account Balance***************
	 * 
	 * Authour Name			:	P.Prabhakar 
	 * Description			:   This meathod sets the wallet account balancce
	 * Meathod Name			:	setBalance
	 * Meathod parameters	:	Double Balance
	 * Meathod return type	:	void 
	 *     
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	

	
	
	
	
	
	

}
