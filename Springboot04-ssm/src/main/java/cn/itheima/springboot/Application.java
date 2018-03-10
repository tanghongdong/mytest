package cn.itheima.springboot;


import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//代表为springboot应用的运行主类
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		//运行springboot应用
		//SpringApplication.run(Application.class, args);
		SpringApplication springApplication = new SpringApplication(Application.class);
		//设置横幅模式（设置关闭）
		springApplication.setBannerMode(Banner.Mode.OFF);
		springApplication.run(args);
	}
	
	
}
