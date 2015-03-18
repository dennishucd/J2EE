package com.crtb.oss.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.crtb.oss.model.TVersionstatus;
import com.crtb.oss.repository.VersionStatusRepository;

@Service //指明一个被注解的类是一个"Service". 这个 annotation当作一种特性的 @Component被使用，允许 classpath 扫描自动探测。
@Transactional //在一个方法或类上描述事务属性
public class VersionStatusService {

	@Autowired //标记一个构造器，域， setter 方法或者配置方法能够被 Spring 依赖注入的工具自动绑定。
	VersionStatusRepository versionStatusRepository;

	public boolean save(TVersionstatus versionStatus) {
		TVersionstatus ret = versionStatusRepository.save(versionStatus);
		
		if (ret != null) {
			return true;
		}
		else {
			return false;
		}
	}

//	public static void main(String[] args) {
//
//		TVersionstatus versionStatus = new TVersionstatus();
//
//		versionStatus.setImei("1234567890");
//		versionStatus.setVersionNo("1.0.7");
//		versionStatus.setReportTime("2015-03-17 22:35");
//
//		ApplicationContext ctx = new ClassPathXmlApplicationContext(
//				"app-context.xml");	
//
//		VersionStatusService versionStatusService = (VersionStatusService) ctx
//				.getBean("versionStatusService");
//
//		versionStatusService.save(versionStatus);
//	}
}
