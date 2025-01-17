package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppCtx;
import spring.Order;
import spring.OrderDao;
import spring.OrderResult;

public class Main2 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx 
		     = new AnnotationConfigApplicationContext(AppCtx.class);

		OrderDao dbQuery = ctx.getBean(OrderDao.class);

		for (OrderResult orderResult : dbQuery.selectByOrder("강하나")) {
			System.out.println(orderResult);
		}
		
		 //주문 생성
		Order order = new Order(999L, 1L, 0L, "서울 마포구", "가길", "301", null);
		Long num = dbQuery.insertOrder(order);
		System.out.println(num + "번 주문이 생성되었습니다.");
		
		ctx.close();
	}
}
