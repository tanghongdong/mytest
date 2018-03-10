package cn.itheima.springboot.service;

import java.util.List;

import cn.itheima.springboot.pojo.Notice;

public interface NoticeService {
	/**
	 * 查询所有
	 * @return
	 */
	List<Notice> findAll();
}
