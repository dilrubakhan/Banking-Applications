package com.userfront.domain;

import java.util.List;

public class User {
	private Long userId;
	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	
	private boolean enabled = true;
	
	private PrimaryAccount primaryAccount;
	
	private SavingsAccount savingsAccount;
	
	private List<Appoinment> appoinment;
	
	private List<Recipient> recipient;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public PrimaryAccount getPrimaryAccount() {
		return primaryAccount;
	}

	public void setPrimaryAccount(PrimaryAccount primaryAccount) {
		this.primaryAccount = primaryAccount;
	}

	public SavingsAccount getSavingsAccount() {
		return savingsAccount;
	}

	public void setSavingsAccount(SavingsAccount savingsAccount) {
		this.savingsAccount = savingsAccount;
	}

	public List<Appoinment> getAppoinment() {
		return appoinment;
	}

	public void setAppoinment(List<Appoinment> appoinment) {
		this.appoinment = appoinment;
	}

	public List<Recipient> getRecipient() {
		return recipient;
	}

	public void setRecipient(List<Recipient> recipient) {
		this.recipient = recipient;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", firstName="
				+ firstName + ", lastName=" + lastName + ", email=" + email + ", phone=" + phone + ", enabled="
				+ enabled + ", primaryAccount=" + primaryAccount + ", savingsAccount=" + savingsAccount
				+ ", appoinment=" + appoinment + ", recipient=" + recipient + "]";
	}
	
	

}
