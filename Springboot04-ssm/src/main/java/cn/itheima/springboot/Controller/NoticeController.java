package cn.itheima.springboot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.itheima.springboot.pojo.Notice;
import cn.itheima.springboot.service.NoticeService;

@RestController
public class NoticeController {
	@Autowired
	private NoticeService noticeService;
	@GetMapping("/findAll")
	public List<Notice> findAll(){
		return noticeService.findAll();
		
	}
}
