package com.neo.banner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BannerApplication {
	//原来没有设置可访问链接最后是会退出来着
	public static void main(String[] args) {
		SpringApplication.run(BannerApplication.class, args);
	}
}
