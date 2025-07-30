package org.bankaccount.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.account.dto.Account;
import org.bank.dto.Bank;

public class BankAccountDao {
	
	
	private	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	private	EntityManager entityManager = entityManagerFactory.createEntityManager();
	private EntityTransaction entityTranscation=entityManager.getTransaction();
	
	
	public void saveBank(Bank bank) {
		List<Account> listAccount=bank.getAccount();
		
		for(Account account:listAccount) {
			account.setBank(bank);
		}
		
		entityTranscation.begin();
		entityManager.persist(bank);
		entityTranscation.commit();
	}
	public void saveAccount(Account account) {
		entityTranscation.begin();
		entityManager.persist(account);
		entityTranscation.commit();
	}
	
	
	public void deleteAccount(Account accountId) {
		if(accountId !=null) {
		entityTranscation.begin();

		entityManager.remove(accountId);
	
		entityTranscation.commit();
		
		}
	}
	
	public void addAccount(int bankId, List<Account> account) {
		Bank bank=entityManager.find(Bank.class, bankId);
		
		if(bank !=null) {
			List<Account> accountdb = bank.getAccount();
			accountdb.addAll(account);
			bank.setAccount(accountdb);
			
			for(Account acc:accountdb) {
				acc.setBank(bank);
			}
			
			entityTranscation.begin();
			entityManager.merge(account);
			entityTranscation.commit();
		}	
	}
	
}
