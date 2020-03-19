package com.shicongyuan.signin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@MapperScan("com.shicongyuan.signin.*.mapper")
/*配置过滤器*/
@ServletComponentScan(basePackages = "com.shicongyuan.signin.base.filter")
/*开启事务支持*/
@EnableTransactionManagement
@SpringBootApplication
public class SigninApplication {

	public static void main(String[] args) {
		SpringApplication.run(SigninApplication.class, args);
	}

}
