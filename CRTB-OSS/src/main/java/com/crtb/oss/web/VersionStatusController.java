package com.crtb.oss.web;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;

import com.crtb.oss.model.TVersionstatus;
import com.crtb.oss.service.VersionStatusService;
import com.crtb.oss.utils.CTools;

@Controller// 指出一个注解的类是一个"Controller"( 一个 Web 控制器 )
@RequestMapping("/version")
public class VersionStatusController {
	
	private final VersionStatusService versionStatusService;

	@Autowired
	public VersionStatusController(VersionStatusService versionStatusService) {
		this.versionStatusService = versionStatusService;
	}

	@RequestMapping(value="/check", method = RequestMethod.POST)
	public @ResponseBody ObjectNode check(@RequestBody TVersionstatus versionStatus) {
		ObjectNode node = new ObjectMapper().createObjectNode();
		
		versionStatus.setReportTime(CTools.dateToString(System.currentTimeMillis()));

		boolean ret = versionStatusService.save(versionStatus);
		
		if (ret) {
			node.put("code", 2000);
			node.put("msg", "success");
		}
		else {
			node.put("code", 3001);
			node.put("msg", "failed");
		}

//		node.put("code", "3001");
		
		return node;
	}
}