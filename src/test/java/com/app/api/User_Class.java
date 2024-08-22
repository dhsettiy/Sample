package com.app.api;

import java.util.List;

public class User_Class {
	private String squadName;
	private String homeTown;
	private String formed;
	private String secretBase;
	private String active;
	private List<MembersClass> members;
	public void setSquadName(String squadName) {
		this.squadName=squadName;
	}
	public String getSquadName() {
		return squadName;
	}
	public String getHomeTown() {
		return homeTown;
	}
	public void setHomeTown(String homeTown) {
		this.homeTown=homeTown;
	}
	public String getformed() {
		return formed;
	}
	public void setFormed(String formed) {
		this.formed=formed;
	}
	public String getsecretBase() {
		return secretBase;
	}
	public void setsecretBase(String secretBase) {
		this.secretBase=secretBase;
	}
	public String getactive() {
		return active;
	}
	public void setactive(String active) {
		this.active=active;
	}
//	public List<MembersClass> getMember(){
//		return members;
//	}
	public void setMembers(List<MembersClass> members) {
		this.members=members;
	}
	public List<MembersClass> getMember() {
		return members;
	}

}
