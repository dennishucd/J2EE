package cn.dennishucd.t5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import cn.dennishucd.t3.MessageRenderer;

public class HelloWorldSpringDI {

	public static void main(String[] args) {
		// Initialize Spring ApplicationContext
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"classpath:cn/dennishucd/t5/app-context.xml");
		MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
		mr.render();
	}
}
