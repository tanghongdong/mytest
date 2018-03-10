package cn.itcast.springboot.Service;

import java.util.List;
import java.util.Map;

import cn.itcast.springboot.pojo.Notice;

public interface NoticeService {
	/**
	 * 查询所有的公告
	 * @return
	 */
	public List<Notice> findAll();
	/**
	 * 分页查询公告
	 * @param page
	 * @param rows
	 * @return
	 */
	public Map<String, Object>findByPage(Integer page,Integer rows);
}
