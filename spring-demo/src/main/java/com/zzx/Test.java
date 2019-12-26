package com.zzx;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Desc
 * @Author CHANG.CHI.HUNG
 * @Date 17:35 2019-12-26
 */
public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println(context.getBean(CityService.class));
	}
}
