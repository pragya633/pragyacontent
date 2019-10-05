package com.cg.ibs.cardmanagement.cardbean;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Date;

public class CreditCardBean {

	private BigInteger creditCardNumber;
	private boolean creditCardStatus;
	private String nameOnCreditCard;
	private int CreditCvvNum;
	private int creditCurrentPin;
	private LocalDate creditDateOfExpiry;
	private String UCI ="7894561239632587";
	private String creditCardType;
	private int creditScore;
	private BigDecimal creditLimit;
	private String incomeTaxReturn;
	
	public CreditCardBean(BigInteger creditCardNumber, boolean creditCardStatus, String nameOnCreditCard, int CreditCvvNum, int creditCurrentPin,
			LocalDate creditDateOfExpiry, String UCI, String creditCardType, int creditScore, BigDecimal creditLimit, String incomeTaxReturn) {
	
		this.creditCardNumber=creditCardNumber;
		this.creditCardStatus=creditCardStatus;
		this.nameOnCreditCard=nameOnCreditCard;
		this.CreditCvvNum=CreditCvvNum;
		this.creditCurrentPin=creditCurrentPin;
		this.creditDateOfExpiry=creditDateOfExpiry;
		this.UCI=UCI;
		this.creditCardType=creditCardType;
		this.creditScore=creditScore;
		this.creditLimit =creditLimit;
		this.incomeTaxReturn=incomeTaxReturn;
		
		
	}

			public BigInteger getCreditCardNumber() {
				return creditCardNumber;
			}

			public void setCreditCardNumber(BigInteger creditCardNumber) {
				this.creditCardNumber = creditCardNumber;
			}

			public boolean isCreditCardStatus() {
				return creditCardStatus;
			}

			public void setCreditCardStatus(boolean creditCardStatus) {
				this.creditCardStatus = creditCardStatus;
			}

			public String getNameOnCreditCard() {
				return nameOnCreditCard;
			}

			public void setNameOnCreditCard(String nameOnCreditCard) {
				this.nameOnCreditCard = nameOnCreditCard;
			}

			public int getCreditCvvNum() {
				return CreditCvvNum;
			}

			public void setCreditCvvNum(int creditCvvNum) {
				CreditCvvNum = creditCvvNum;
			}

			public int getCreditCurrentPin() {
				return creditCurrentPin;
			}

			public void setCreditCurrentPin(int creditCurrentPin) {
				this.creditCurrentPin = creditCurrentPin;
			}

			public LocalDate getCreditDateOfExpiry() {
				return creditDateOfExpiry;
			}

			public void setCreditDateOfExpiry(LocalDate creditDateOfExpiry) {
				this.creditDateOfExpiry = creditDateOfExpiry;
			}

			public String getUCI() {
				return UCI;
			}

			public void setUCI(String uCI) {
				UCI = uCI;
			}

			public String getCreditCardType() {
				return creditCardType;
			}

			public void setCreditCardType(String creditCardType) {
				this.creditCardType = creditCardType;
			}

			public int getCreditScore() {
				return creditScore;
			}

			public void setCreditScore(int creditScore) {
				this.creditScore = creditScore;
			}

			public BigDecimal getCreditLimit() {
				return creditLimit;
			}

			public void setCreditLimit(BigDecimal creditLimit) {
				this.creditLimit = creditLimit;
			}

			public String getIncomeTaxReturn() {
				return incomeTaxReturn;
			}

			public void setIncomeTaxReturn(String incomeTaxReturn) {
				this.incomeTaxReturn = incomeTaxReturn;
			}

			

	
	
	


	
	

}
