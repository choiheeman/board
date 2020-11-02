package com.sample.model;

import java.sql.Date;

public class MemberVo {
	private String id,pw;
	private Date signUpDate;
	
	public MemberVo() {}

	public MemberVo(String id, String pw, Date signUpDate) {
		this.id = id;
		this.pw = pw;
		this.signUpDate = signUpDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public Date getSignUpDate() {
		return signUpDate;
	}

	public void setSignUpDate(Date signUpDate) {
		this.signUpDate = signUpDate;
	}

	@Override
	public String toString() {
		return "MemberVo [id=" + id + ", pw=" + pw + ", signUpDate=" + signUpDate + "]";
	}
	
	
}
