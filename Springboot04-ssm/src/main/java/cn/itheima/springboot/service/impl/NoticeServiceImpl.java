package cn.itheima.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.itheima.springboot.mapper.NoticeMapper;
import cn.itheima.springboot.pojo.Notice;
import cn.itheima.springboot.service.NoticeService;
@Service
@Transactional
public class NoticeServiceImpl implements NoticeService {
	@Autowired
	private NoticeMapper noticeMapper;
	public List<Notice> findAll() {
		return noticeMapper.findAll();
	}

}
