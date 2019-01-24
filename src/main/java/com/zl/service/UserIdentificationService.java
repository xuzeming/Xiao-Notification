package com.zl.service;

import com.github.pagehelper.PageInfo;
import com.zl.pojo.UserIdentification;
import com.zl.pojo.UserIdentificationCondition;

public interface UserIdentificationService {

	/**
	 * 分页查询
	 * 
	 * @param pageNum 页码
	 * @param pageSize 页容量
	 * @param userIdentificationCondition 查询条件
	 * @return
	 */

	PageInfo<UserIdentification> selectByPage(Integer pageNum, Integer pageSize,
			UserIdentificationCondition userIdentificationCondition);

}
