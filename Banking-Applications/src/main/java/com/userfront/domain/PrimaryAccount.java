package com.userfront.domain;

import java.math.BigDecimal;
import java.util.List;

public class PrimaryAccount {
	private Long id;
	private int accountNumber;
	private BigDecimal accountBallace;
	
	private List<PrimaryTransaction> primaryTransactionList;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public BigDecimal getAccountBallace() {
		return accountBallace;
	}

	public void setAccountBallace(BigDecimal accountBallace) {
		this.accountBallace = accountBallace;
	}

	public List<PrimaryTransaction> getPrimaryTransactionList() {
		return primaryTransactionList;
	}

	public void setPrimaryTransactionList(List<PrimaryTransaction> primaryTransactionList) {
		this.primaryTransactionList = primaryTransactionList;
	}

	@Override
	public String toString() {
		return "PrimaryAccount [id=" + id + ", accountNumber=" + accountNumber + ", accountBallace=" + accountBallace
				+ ", primaryTransactionList=" + primaryTransactionList + "]";
	}

}
