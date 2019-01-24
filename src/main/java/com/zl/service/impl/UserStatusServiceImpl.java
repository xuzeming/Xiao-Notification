package com.zl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.mapper.UserStatusMapper;
import com.zl.pojo.UserStatus;
import com.zl.service.UserStatusService;
@Service
public class UserStatusServiceImpl implements UserStatusService {
	@Autowired
	private UserStatusMapper userStatusMapper;
	
	@Override
	public List<UserStatus> queryAll() {
		return userStatusMapper.queryAll();
	}

}
