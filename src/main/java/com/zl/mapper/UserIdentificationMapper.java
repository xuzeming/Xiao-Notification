package com.zl.mapper;

import java.util.List;

import com.zl.pojo.UserIdentification;
import com.zl.pojo.UserIdentificationCondition;

public interface UserIdentificationMapper {

	/**
	 * 分页查询
	 * @param userIdentificationCondition 条件
	 * @return
	 */
	List<UserIdentification> selectByPage(UserIdentificationCondition userIdentificationCondition);

}
