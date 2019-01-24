package com.zl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zl.mapper.UserNoticeMapper;
import com.zl.pojo.UserNotice;
import com.zl.service.UserNoticeService;

@Service
public class UserNoticeServiceImpl implements UserNoticeService{
	
	@Autowired
	private UserNoticeMapper userNoticeMapper;

	@Override
	public PageInfo<UserNotice> selectByPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<UserNotice> list = userNoticeMapper.selectByPage();
		PageInfo<UserNotice> pageInfo = new PageInfo<UserNotice>(list);
		return pageInfo;
	}

	@Override
	public void deleteById(Integer id) {
		userNoticeMapper.deleteById(id);
	}

	@Override
	public void adduserNotice(UserNotice userNotice) {
		userNoticeMapper.adduserNotice(userNotice);
	}

	@Override
	public UserNotice queryById(Integer id) {
		return userNoticeMapper.queryById(id);
	}

}
