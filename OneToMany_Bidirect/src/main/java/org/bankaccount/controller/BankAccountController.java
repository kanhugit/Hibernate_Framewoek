package org.bankaccount.controller;

import java.util.ArrayList;
import java.util.List;

import org.account.dto.Account;
import org.bank.dto.Bank;
import org.bankaccount.dao.BankAccountDao;

public class BankAccountController {
	public static void main(String[] args) {
		Account account1 = new Account();

		account1.setAccountId(207);
		account1.setAccountNum(908978585521L);
		account1.setAccountType("Zero Account");
		account1.setMobile(8112146097L);
		account1.setAccountAddress("BDK");

		Account account2 = new Account();
		account2.setAccountId(208);
		account2.setAccountNum(120699678565L);
		account2.setAccountType("Zero Account");
		account2.setMobile(7980785890L);
		account2.setAccountAddress("BBSR");

		Account account3 = new Account();
		account3.setAccountId(209);
		account3.setAccountNum(900099678123L);
		account3.setAccountType("Saving Account");
		account3.setMobile(7894144194L);
		account3.setAccountAddress("AP");
		
	

		Bank bank = new Bank();
		bank.setBankId(11);
		bank.setBankName("SBI");
		bank.setIFSC("12KLO234");
		bank.setAddress("Motto");

		account1.setBank(bank);
		account2.setBank(bank);
		account3.setBank(bank);

		List<Account> listaAccount = new ArrayList<Account>();
		listaAccount.add(account1);
		listaAccount.add(account2);
		listaAccount.add(account3);

		BankAccountDao dao = new BankAccountDao();

//		System.out.println("Case 1: Bank has Account and Account has Bank");
//		bank.setAccount(listaAccount);
//		dao.saveBank(bank);

		// -------- Case 2: Account has Bank and Bank has Account --------
//		System.out.println("Case 2: Account has Bank and Bank has Account");
//		dao.saveAccount(account1);
//		dao.saveAccount(account2);
//		dao.saveAccount(account3);

		// -------- Case 3: Bank has Account but Account does not have Bank --------
//		bank.setAccount(listaAccount);
//		dao.saveBank(bank);
//		dao.addAccount(11, listaAccount);
//		dao.deleteAccount(account3);
		
		
		

		// -------- Case 4: Account has Bank but Bank does not have Account --------
//		System.out.println("Case 4: Account has Bank but Bank does not have Account");

//        bank.setAccount(listaAccount);
//        account3.setBank(bank);
//		 dao.saveAccount(account3);
//		 dao.saveBank(bank);

	}
}
