package com.app.api;

public class MembersClass {
	private String ID;
	private String age;
	private String secretIdentity;
	private String state;
	private String city;

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSecretIdentity() {
		return secretIdentity;
	}

	public void setSecretIdentity(String secretIdentity) {
		this.secretIdentity = secretIdentity;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
