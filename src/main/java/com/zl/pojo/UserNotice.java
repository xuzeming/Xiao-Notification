package com.zl.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户通知类
 * 
 * @author THINK
 *
 */

public class UserNotice implements Serializable {

	private static final long serialVersionUID = -2099847575228796475L;
	private Integer noticeID;// 通知ID
	private Integer userID;// 用户ID
	private String noticeTitle;// 标题
	private String noticeContent;// 内容
	private Date noticeTime;// 时间
	private Integer readed;// 是否阅读(1: 表示阅读，0: 表示没阅读)

	public Integer getNoticeID() {
		return noticeID;
	}

	public void setNoticeID(Integer noticeID) {
		this.noticeID = noticeID;
	}

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	public String getNoticeTitle() {
		return noticeTitle;
	}

	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}

	public String getNoticeContent() {
		return noticeContent;
	}

	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}

	public Date getNoticeTime() {
		return noticeTime;
	}

	public void setNoticeTime(Date noticeTime) {
		this.noticeTime = noticeTime;
	}

	public Integer getReaded() {
		return readed;
	}

	public void setReaded(Integer readed) {
		this.readed = readed;
	}

	@Override
	public String toString() {
		return "UserNotice [noticeID=" + noticeID + ", userID=" + userID + ", noticeTitle=" + noticeTitle
				+ ", noticeContent=" + noticeContent + ", noticeTime=" + noticeTime + ", readed=" + readed + "]";
	}

}
