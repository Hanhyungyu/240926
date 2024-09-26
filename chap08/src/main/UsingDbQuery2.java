package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.DbConfig;
import spring.MemberDao;


public class UsingDbQuery2 {

	public static void main(String[]args) {
		AnnotationConfigApplicationContext ctx=
				new AnnotationConfigApplicationContext(DbConfig.class);
		
		MemberDao dbQuery =ctx.getBean(MemberDao.class);
	
		System.out.println(dbQuery.selectByEmail("ko1@naver.com"));
		ctx.close();

	}
}
