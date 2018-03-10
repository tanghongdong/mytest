package cn.itcast.springboot.Service.Impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.itcast.springboot.Service.NoticeService;
import cn.itcast.springboot.mapper.NoticeMapper;
import cn.itcast.springboot.pojo.Notice;
@Service
@Transactional
public class NoticeServiceImpl implements NoticeService{
	@Autowired
	private NoticeMapper niticeMapper;
	
	/**
	 * 查询所有公告
	 */
	public List<Notice> findAll() {
		List<Notice> findAl = niticeMapper.findAll();
		return findAl;
	}

	/**
	 * 分页查询
	 */
	public Map<String, Object> findByPage(Integer page, Integer rows) {
		// 创建map集合封装响应数据
		Map<String, Object> data=new HashMap<>();
		//统计查询
		Long count = niticeMapper.count();
		data.put("total", count);
		/**
		 * 分页查询
		 */
		List<Notice> notices = niticeMapper.findByPage(page, rows);
		data.put("rows", notices);
		return data;
	}

}
