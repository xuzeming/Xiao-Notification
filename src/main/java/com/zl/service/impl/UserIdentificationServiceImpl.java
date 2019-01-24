package com.zl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zl.mapper.UserIdentificationMapper;
import com.zl.pojo.UserIdentification;
import com.zl.pojo.UserIdentificationCondition;
import com.zl.service.UserIdentificationService;
@Service
public class UserIdentificationServiceImpl implements UserIdentificationService{
	@Autowired
	private UserIdentificationMapper userIdentificationMapper;

	@Override
	public PageInfo<UserIdentification> selectByPage(Integer pageNum, Integer pageSize,
			UserIdentificationCondition userIdentificationCondition) {
		PageHelper.startPage(pageNum, pageSize);
		/**
		   * 为条件内添加首条和尾条的rownum值
		 */
		userIdentificationCondition.setFirstPage((pageNum-1)*pageSize+1);
		userIdentificationCondition.setLastPage(pageNum*pageSize);
		System.err.println(userIdentificationCondition);
		
		List<UserIdentification> list = userIdentificationMapper.selectByPage(userIdentificationCondition);
		PageInfo<UserIdentification> pageInfo = new PageInfo<UserIdentification>(list);
		return pageInfo;
	}

}
