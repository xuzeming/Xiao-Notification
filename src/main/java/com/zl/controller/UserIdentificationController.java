package com.zl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.zl.pojo.UserIdentification;
import com.zl.pojo.UserIdentificationCondition;
import com.zl.pojo.UserStatus;
import com.zl.service.UserIdentificationService;
import com.zl.service.UserStatusService;

@RestController
@RequestMapping(value="/userIdentification")
public class UserIdentificationController {
	
	@Autowired
	private UserStatusService UserStatusService;
	
	@Autowired
	private UserIdentificationService userIdentificationService;
	
	@RequestMapping("/queryUserIdentification.action")
	public PageInfo<UserIdentification> queryUserIdentification(@RequestParam(defaultValue = "1") Integer pageNum,
			@RequestParam(defaultValue = "4") Integer pageSize,UserIdentificationCondition userIdentificationCondition) {
		if(pageNum<1) pageNum =1;
		/**
		 * 打印传入的条件类用于测试
		 */
		if(userIdentificationCondition!=null) {
			if(userIdentificationCondition.getUserName()==null||userIdentificationCondition.getUserName().isEmpty()) {
				userIdentificationCondition.setUserName(null);
			}
			if(userIdentificationCondition.getIdentificationID()==null||userIdentificationCondition.getIdentificationID()=="") {
				userIdentificationCondition.setIdentificationID(null);
			}
			if(userIdentificationCondition.getStatus()==null||userIdentificationCondition.getStatus().trim().isEmpty()
					||userIdentificationCondition.getStatus().trim().equals("-1")) {
				userIdentificationCondition.setStatus(null);
			}
		}
		PageInfo<UserIdentification> pageInfo = userIdentificationService.selectByPage(pageNum, pageSize,userIdentificationCondition);
		System.out.println(pageInfo);
		return pageInfo;	
	}
	
	@RequestMapping("/queryState.action")
	public List<UserStatus> queryAllState(){
		return UserStatusService.queryAll();
	}
	
	
}
