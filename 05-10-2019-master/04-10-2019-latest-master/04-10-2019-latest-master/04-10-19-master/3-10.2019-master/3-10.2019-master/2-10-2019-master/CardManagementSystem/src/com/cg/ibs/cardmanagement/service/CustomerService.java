package com.cg.ibs.cardmanagement.service;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import com.cg.ibs.cardmanagement.cardbean.CaseIdBean;
import com.cg.ibs.cardmanagement.cardbean.CreditCardBean;
import com.cg.ibs.cardmanagement.cardbean.DebitCardBean;
import com.cg.ibs.cardmanagement.dao.CustomerDao;
import com.cg.ibs.cardmanagement.dao.DaoClass;

public interface CustomerService {

	public boolean verifyDebitCardNumber(BigInteger debitCardNumber) ;
	public List<DebitCardBean> viewAllDebitCards();

	public List<CreditCardBean> viewAllCreditCards();

	void applyNewDebitCard(BigInteger accountNumber);

	void applyNewCreditCard();

	void resetCreditPin(BigInteger creditCardNumber, long currentCreditPin);
	

	String verifyDebitcardType(BigInteger debitCardNumber);

	void requestDebitCardLost(BigInteger debitCardNumber);

	void requestCreditCardLost(BigInteger creditCardNumber);

	void requestDebitCardUpgrade(BigInteger debitCardNumber, int myChoice);

	void requestCreditCardUpgrade(BigInteger creditCardNumber);
	void resetDebitPin(BigInteger debitCardNumber, int newPin);
	// TransactionBean showDebitCardStatement(Date fromDate , Date toDate ,
	// BigInteger debitCardNumber);
	// void showCreditCardStatement(Date fromDate , Date toDate , BigInteger
	// creditCardNumber);
	void raiseDebitMismatchTicket(BigInteger debitCardNumber, BigInteger transactionId);
	// void raiseCreditMismatchTicket(BigInteger creditCardNumber,BigInteger
	// transactionId );
	public boolean verifyDebitPin(int pin, BigInteger debitCardNumber);

}
