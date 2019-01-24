package com.zl.pojo;

import java.io.Serializable;

/**
 * 用户中心类
 * 
 * @author THINK
 *
 */

public class UserCenters implements Serializable {

	private static final long serialVersionUID = 4229006170488771477L;
	private Integer userID;
	private Integer userStatusID;
	private String userLoginName;
	private String netName;
	private String userTel;
	private String userPWD;
	private Integer accountNum;
	private String capitalPWD;

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	public Integer getUserStatusID() {
		return userStatusID;
	}

	public void setUserStatusID(Integer userStatusID) {
		this.userStatusID = userStatusID;
	}

	public String getUserLoginName() {
		return userLoginName;
	}

	public void setUserLoginName(String userLoginName) {
		this.userLoginName = userLoginName;
	}

	public String getNetName() {
		return netName;
	}

	public void setNetName(String netName) {
		this.netName = netName;
	}

	public String getUserTel() {
		return userTel;
	}

	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}

	public String getUserPWD() {
		return userPWD;
	}

	public void setUserPWD(String userPWD) {
		this.userPWD = userPWD;
	}

	public Integer getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(Integer accountNum) {
		this.accountNum = accountNum;
	}

	public String getCapitalPWD() {
		return capitalPWD;
	}

	public void setCapitalPWD(String capitalPWD) {
		this.capitalPWD = capitalPWD;
	}

	@Override
	public String toString() {
		return "UserCenters [userID=" + userID + ", userStatusID=" + userStatusID + ", userLoginName=" + userLoginName
				+ ", netName=" + netName + ", userTel=" + userTel + ", userPWD=" + userPWD + ", accountNum="
				+ accountNum + ", capitalPWD=" + capitalPWD + "]";
	}

}
