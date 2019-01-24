package com.zl.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.zl.pojo.UserNotice;
import com.zl.service.UserNoticeService;

@RestController
@RequestMapping("/userNotice")
public class UserNoticeController {
	
	@Autowired
	private UserNoticeService userNoticeService;
	
	@RequestMapping("/queryUserNotice.action")
	public PageInfo<UserNotice> queryUserNotice(@RequestParam(defaultValue = "1") Integer pageNum,
			@RequestParam(defaultValue = "7") Integer pageSize) {
		PageInfo<UserNotice> pageInfo = userNoticeService.selectByPage(pageNum, pageSize);
		System.out.println(pageInfo);
		return pageInfo;	
	}
	
	@RequestMapping("/deleteById.action")
	public String deleteById(@RequestParam(name = "id", required = true, defaultValue = "1") Integer id,Model model) {
		userNoticeService.deleteById(id);
		return "redirect:/userNotice/queryUserNotice.action"; 	
	}
	
	@RequestMapping("/addUserNoticeNotice.action")
	public Map<String,Object> adduserNotice(UserNotice userNotice, Model model) {
		userNoticeService.adduserNotice(userNotice);
		Map<String,Object> map = new HashMap<>();
		map.put("status", "succese");
		return map;
	}
	
	/**
	 * 通过用户id查询通知，然后返回到前台
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/queryById.action")
	public UserNotice queryById(HttpSession session) {
		Integer id = (Integer) session.getAttribute("userId");
		//id=4
		UserNotice userNotice = userNoticeService.queryById(id);
		System.err.println(userNotice);
		return userNotice;
	}
	/**
	 * 先将userId保存在session中，然后在前台跳转页面，发送ajax请求得到相关数据
	 * @param userId
	 * @param session
	 * @return
	 */
	@RequestMapping("/addIdInSession.action")
	public String queryById(@RequestParam(name = "userId", required = true) Integer userId, HttpSession session) {
		session.setAttribute("userId",userId);
		return "true";
	}
	
	
}
