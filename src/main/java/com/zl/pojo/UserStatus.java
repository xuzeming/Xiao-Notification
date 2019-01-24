package com.zl.pojo;

import java.io.Serializable;

/**
 * 用户状态类
 * 
 * @author THINK
 *
 */

public class UserStatus implements Serializable {

	private static final long serialVersionUID = -8478257349803878122L;
	private Integer userStatusID;
	private String status;

	public Integer getUserStatusID() {
		return userStatusID;
	}

	public void setUserStatusID(Integer userStatusID) {
		this.userStatusID = userStatusID;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "UserStatus [userStatusID=" + userStatusID + ", status=" + status + "]";
	}

}
