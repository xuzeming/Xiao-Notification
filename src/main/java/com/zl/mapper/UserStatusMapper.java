package com.zl.mapper;

import java.util.List;

import com.zl.pojo.UserStatus;

public interface UserStatusMapper {

	/**
	 * 用户状态
	 * 
	 * @return
	 */

	List<UserStatus> queryAll();

}
