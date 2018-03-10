package cn.itheima.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import cn.itheima.springboot.pojo.Notice;

@Mapper
public interface NoticeMapper {
	@Select("select * from notice")
	List<Notice> findAll();
}
