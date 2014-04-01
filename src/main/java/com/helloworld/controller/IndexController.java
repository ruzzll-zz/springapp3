package com.helloworld.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.helloworld.model.JobInfo;
import com.helloworld.service.JobService;

@Controller
public class IndexController {

	private final Log log = LogFactory.getLog(this.getClass());

	@Autowired
	private JobService jobService;
	
	@RequestMapping(value = "/index")
	@ResponseBody 
	public List<JobInfo> requestIndex(){
		// jobService = new JobService();
		
		log.debug("controller is called");
		return jobService.getSampleInfo();
	}
	
}