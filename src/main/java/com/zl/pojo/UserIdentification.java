package com.zl.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户身份证
 * 
 * @author THINK
 *
 */

public class UserIdentification implements Serializable {

	private static final long serialVersionUID = 5350483539614669467L;

	private String identificationID;
	private Integer userID;
	private String userName;
	private String userSex;
	private String userNation;
	private String userAdderss;
	private String signAgency;
	private Date startTime;
	private Date endTime;
	private String frontImg;
	private String backImg;
	private String userStatus;

	

	public String getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	public String getIdentificationID() {
		return identificationID;
	}

	public void setIdentificationID(String identificationID) {
		this.identificationID = identificationID;
	}

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserSex() {
		return userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	public String getUserNation() {
		return userNation;
	}

	public void setUserNation(String userNation) {
		this.userNation = userNation;
	}

	public String getUserAdderss() {
		return userAdderss;
	}

	public void setUserAdderss(String userAdderss) {
		this.userAdderss = userAdderss;
	}

	public String getSignAgency() {
		return signAgency;
	}

	public void setSignAgency(String signAgency) {
		this.signAgency = signAgency;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getFrontImg() {
		return frontImg;
	}

	public void setFrontImg(String frontImg) {
		this.frontImg = frontImg;
	}

	public String getBackImg() {
		return backImg;
	}

	public void setBackImg(String backImg) {
		this.backImg = backImg;
	}

	@Override
	public String toString() {
		return Messages.getString("UserIdentification.0") + identificationID + Messages.getString("UserIdentification.1") + userID + Messages.getString("UserIdentification.2") //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				+ userName + Messages.getString("UserIdentification.3") + userSex + Messages.getString("UserIdentification.4") + userNation + Messages.getString("UserIdentification.5") + userAdderss //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				+ Messages.getString("UserIdentification.6") + signAgency + Messages.getString("UserIdentification.7") + startTime + Messages.getString("UserIdentification.8") + endTime + Messages.getString("UserIdentification.9") //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
				+ frontImg + Messages.getString("UserIdentification.10") + backImg + Messages.getString("UserIdentification.11"); //$NON-NLS-1$ //$NON-NLS-2$
	}

}
