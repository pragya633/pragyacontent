package com.cg.ibs.cardmanagement.service;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.cg.ibs.cardmanagement.cardbean.CaseIdBean;
import com.cg.ibs.cardmanagement.cardbean.CreditCardBean;
import com.cg.ibs.cardmanagement.cardbean.DebitCardBean;
import com.cg.ibs.cardmanagement.dao.BankDao;
import com.cg.ibs.cardmanagement.dao.CustomerDao;
import com.cg.ibs.cardmanagement.dao.DaoClass;

public class CustomerServiceImpl implements CustomerService {

	CustomerDao customerDao = new DaoClass();

	CaseIdBean caseIdObj = new CaseIdBean();

	Scanner scan = new Scanner(System.in);

	String caseIdGenOne = " ";
	String caseIdTotal = " ";
	static int caseIdGenTwo = 0;
	LocalDateTime timestamp;

	String addToQueryTable(String caseIdGenOne) {
		caseIdTotal = caseIdGenOne + caseIdGenTwo;
		caseIdGenTwo++;
		return caseIdTotal;
	}

	public CustomerServiceImpl() {
		super();
	}

	@Override
	public void applyNewDebitCard(BigInteger accountNumber) {
		boolean check = customerDao.verifyAccountNumber(accountNumber);
		if (check) {

			caseIdGenOne = "ANDC";
			timestamp = LocalDateTime.now();

			caseIdObj.setCaseIdTotal(addToQueryTable(caseIdGenOne));
			caseIdObj.setCaseTimeStamp(timestamp);
			caseIdObj.setStatusOfQuery("Pending");
			caseIdObj.setUCI(caseIdObj.getUCI());
			customerDao.newDebitCard(caseIdObj, accountNumber);
		}

		else {
			System.out.println("Something wrong !! Try Again");

		}

	}

	@Override
	public void applyNewCreditCard() {
		caseIdGenOne = "ANCD";
		timestamp = LocalDateTime.now();

		caseIdObj.setCaseIdTotal(addToQueryTable(caseIdGenOne));
		caseIdObj.setCaseTimeStamp(timestamp);
		caseIdObj.setStatusOfQuery("Pending");
		caseIdObj.setUCI(caseIdObj.getUCI());

		customerDao.newCreditCard(caseIdObj);

	}

	public boolean verifyDebitCardNumber(BigInteger debitCardNumber) {

		boolean check = customerDao.verifyDebitCardNumber(debitCardNumber);
		return (check);
	}

	@Override
	public void resetCreditPin(BigInteger creditCardNumber, long currentCreditPin) {
		// TODO Auto-generated method stub

	}

	public boolean verifyDebitPin(int pin, BigInteger debitCardNumber) {
		if (pin == customerDao.getDebitCardPin(debitCardNumber)) {

			return true;
		} else {
			return false;
		}
	}

	@Override
	public void resetDebitPin(BigInteger debitCardNumber, int newPin) {

		customerDao.setNewDebitPin(debitCardNumber, newPin);
		System.out.println("PIN UPDATED SUCCESSFULLY!");
	}

	@Override
	public void requestDebitCardLost(BigInteger debitCardNumber) {
		boolean check = customerDao.verifyDebitCardNumber(debitCardNumber);
		if (check) {

			caseIdObj.setCardNumber(debitCardNumber);

			caseIdGenOne = "RDCL";

			timestamp = LocalDateTime.now();

			caseIdObj.setCaseIdTotal(addToQueryTable(caseIdGenOne));
			caseIdObj.setCaseTimeStamp(timestamp);
			caseIdObj.setStatusOfQuery("Pending");
			caseIdObj.setUCI(caseIdObj.getUCI());

			customerDao.requestDebitCardLost(caseIdObj, debitCardNumber);
		} else {
			System.out.println("INVALID DEBIT CARD NUMBER");

		}
	}

	@Override
	public void requestCreditCardLost(BigInteger creditCardNumber) {
		boolean check = customerDao.verifyCreditCardNumber(creditCardNumber);
		if (check) {

			caseIdObj.setCardNumber(creditCardNumber);

			caseIdGenOne = "RDCL";

			timestamp = LocalDateTime.now();

			caseIdObj.setCaseIdTotal(addToQueryTable(caseIdGenOne));
			caseIdObj.setCaseTimeStamp(timestamp);
			caseIdObj.setStatusOfQuery("Pending");
			caseIdObj.setUCI(caseIdObj.getUCI());

			customerDao.requestCreditCardLost(caseIdObj, creditCardNumber);
		} else {
			System.out.println("INVALID CREDIT CARD NUMBER");

		}
	}

	public String verifyDebitcardType(BigInteger debitCardNumber) {
		boolean check = customerDao.verifyDebitCardNumber(debitCardNumber);
		if (check) {
			String type = customerDao.getdebitCardType(debitCardNumber);
			return type;
		} else {
			System.out.println("INVALID DEBIT CARD NUMBER");
			return null;
		}

	}

	@Override
	public void requestDebitCardUpgrade(BigInteger debitCardNumber, int myChoice) {
		// TODO Auto-generated method stub

		caseIdObj.setCardNumber(debitCardNumber);
		caseIdGenOne = "RDCU";
		timestamp = LocalDateTime.now();

		caseIdObj.setCaseIdTotal(addToQueryTable(caseIdGenOne));
		caseIdObj.setCaseTimeStamp(timestamp);
		caseIdObj.setStatusOfQuery("Pending");
		caseIdObj.setUCI(caseIdObj.getUCI());
		if (myChoice == 1) {
			caseIdObj.setDefineQuery("Upgrade to Gold");
			customerDao.requestDebitCardUpgrade(caseIdObj, debitCardNumber);
		} else if (myChoice == 2) {
			caseIdObj.setDefineQuery("Upgrade to Platinum");
			customerDao.requestDebitCardUpgrade(caseIdObj, debitCardNumber);
		} else {
			System.out.println("Choose a valid option");
		}

	}

	@Override
	public void requestCreditCardUpgrade(BigInteger creditCardNumber) {
		// TODO Auto-generated method stub

	}

	/*
	 * public TransactionBean showDebitCardStatement(Date fromDate, Date toDate,
	 * BigInteger debitCardNumber) { // TODO Auto-generated method stub return
	 * null; }
	 */
	@Override
	public void raiseDebitMismatchTicket(BigInteger debitCardNumber, BigInteger transactionId) {
		// TODO Auto-generated method stub
	}

	public List<DebitCardBean> viewAllDebitCards() {

		return customerDao.viewAllDebitCards();
	}

	@Override
	public List<CreditCardBean> viewAllCreditCards() {

		return customerDao.viewAllCreditCards();

	}

	public boolean verifyDebitPin(int pin) {
		// TODO Auto-generated method stub
		return false;
	}

}
