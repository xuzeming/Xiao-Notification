package com.zl.pojo;

import java.io.Serializable;

/**
 * 条件类
 * 
 * @author THINK
 *
 */

public class UserIdentificationCondition implements Serializable {

	private static final long serialVersionUID = 3199100075587408099L;
	private Integer userID;// 用户id
	private String userName;// 姓名
	private String identificationID;// 身份证号
	private String status;// 1 正常 2冻结 3销户
	private Integer firstPage;// 首页
	private Integer lastPage;// 尾页

	public UserIdentificationCondition(Integer userID, String userName, String identificationID, String status,
			Integer firstPage, Integer lastPage) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.identificationID = identificationID;
		this.status = status;
		this.firstPage = firstPage;
		this.lastPage = lastPage;
	}

	public String getIdentificationID() {
		return identificationID;
	}

	public void setIdentificationID(String identificationID) {
		this.identificationID = identificationID;
	}

	public UserIdentificationCondition() {
		super();
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getFirstPage() {
		return firstPage;
	}

	public void setFirstPage(Integer firstPage) {
		this.firstPage = firstPage;
	}

	public Integer getLastPage() {
		return lastPage;
	}

	public void setLastPage(Integer lastPage) {
		this.lastPage = lastPage;
	}

	@Override
	public String toString() {
		return "UserIdentificationCondition [userID=" + userID + ", userName=" + userName + ", identificationID="
				+ identificationID + ", status=" + status + ", firstPage=" + firstPage + ", lastPage=" + lastPage + "]";
	}

}
