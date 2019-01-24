package com.zl.mapper;

import java.util.List;

import com.zl.pojo.UserNotice;

public interface UserNoticeMapper {

	/**
	 * 查询所有通知内容
	 * 
	 * @return
	 */
	List<UserNotice> selectByPage();

	/**
	 * 根据id删除
	 * 
	 * @param id
	 */
	void deleteById(Integer id);

	/**
	 * 添加通知
	 * 
	 * @param userNotice
	 */
	void adduserNotice(UserNotice userNotice);

	/**
	 * 根据id查询
	 * 
	 * @param id
	 * @return
	 */
	UserNotice queryById(Integer id);

}
