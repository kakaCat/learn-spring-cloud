package com.learn.springcloudlearn1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCloudLearn1Application {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(SpringCloudLearn1Application.class);
		//非web启动 和 web启动
		springApplication.setWebEnvironment(true);
		springApplication.run(args);
	}
}
