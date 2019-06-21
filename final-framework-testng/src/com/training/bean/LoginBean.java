package com.training.bean;

public class LoginBean {
	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	private String eMail;
	private String phoneNO;
	private String userLogin;
	private String enterPassword;

	public LoginBean() {
	}

	public LoginBean(String userName, String password, String firstName, String lastName, String eMail, String phoneNO, String userLogin, String enterPassword ) {
		super();
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.eMail = eMail;
		this.phoneNO = phoneNO;
		this.userLogin = userLogin;
		this.enterPassword = enterPassword;
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
	
	public String getEMail() {
		return eMail;
	}

	public void setEMail(String eMail) {
		this.eMail = eMail;
	}
	
	public String getPhoneNo() {
		return phoneNO;
	}

	public void setPhoneNO(String phoneNO) {
		this.phoneNO = phoneNO;
	}
	
	public String getUserLogin() {
		return userLogin;
	}

	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}
	
	public String getEnterPassword() {
		return enterPassword;
	}

	public void setEnterPassword(String enterPassword) {
		this.enterPassword = enterPassword;
	}
	
	

	@Override
	public String toString() {
		return "LoginBean [userName=" + userName + ", password=" + password + ", firstName=" + firstName + ", lastName=" + lastName + ",  eMail=" + eMail + ",  phoneNo=" + phoneNO + ",  userLogin=" + userLogin + ",  enterPassword=" + enterPassword + "  ]";
	}

}
