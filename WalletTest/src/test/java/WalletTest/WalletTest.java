package WalletTest;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;


import org.junit.jupiter.api.Test;

import com.capgemini.wallet.entity.WalletAccount;
import com.capgemini.wallet.entity.WalletUser;
import com.capgemini.wallet.exceptions.PasswordException;
import com.capgemini.wallet.exceptions.PhoneNumberException;
import com.capgemini.wallet.exceptions.UserIdException;
import com.capgemini.wallet.exceptions.UserNameException;
import com.capgemini.wallet.exceptions.WalletException;
import com.capgemini.wallet.service.WalletService;
import com.capgemini.wallet.service.WalletServiceImpl;

public class WalletTest {
	

	@Test 
	public void walletTest1() throws PhoneNumberException, UserNameException, PasswordException {
		WalletService ser = new WalletServiceImpl();
		assertThrows(PasswordException.class,()->ser.createAccount("panduprabhakar", "8437481708", "pandu"));	
	}
	@Test
	public void walletTest2() throws PhoneNumberException, UserNameException, PasswordException {
		WalletService ser = new WalletServiceImpl();
		assertThrows(UserNameException.class,()->ser.createAccount("pandu12300", "8437487108", "pandu@123"));	
	}
	@Test  
	public void walletTest3()throws PhoneNumberException, UserNameException, PasswordException, UserIdException { 
		  WalletService ser = new WalletServiceImpl();
		  assertThrows(PhoneNumberException.class,()->ser.createAccount("panduprabhakar", "8487108", "pandu@123"));
				  }
	@Test
	public void walletTest4() throws WalletException, UserIdException, PhoneNumberException, UserNameException, PasswordException {
		WalletService ser = new WalletServiceImpl();
		assertNotNull(ser.createAccount("panduprabhakar", "8481708000", "pandu@123"));
	}
	
	
	 

}
