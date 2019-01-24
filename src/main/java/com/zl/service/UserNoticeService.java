package com.zl.service;

import com.github.pagehelper.PageInfo;
import com.zl.pojo.UserNotice;

public interface UserNoticeService {

	/**
	 * 分页查询
	 * 
	 * @param pageNum  页码
	 * @param pageSize 页容量
	 * @return
	 */
	PageInfo<UserNotice> selectByPage(int pageNum, int pageSize);

	/**
	 * 根据id删除
	 * 
	 * @param id
	 */
	void deleteById(Integer id);
	
	/**
	 * 添加通知
	 * @param userNotice
	 */

	void adduserNotice(UserNotice userNotice);
	
	/**
	 * 根据id查询
	 * @param id
	 * @return
	 */
	UserNotice queryById(Integer id);

}
