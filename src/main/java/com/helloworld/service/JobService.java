package com.helloworld.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.helloworld.dao.JobMapper;
import com.helloworld.model.JobInfo;

@Service
public class JobService {

	private Log log = LogFactory.getLog(getClass());
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	public List<JobInfo> getSampleInfo(){
		
		log.debug("getSampleInfo is called");
		
		JobMapper sampleMapper = sqlSession.getMapper(JobMapper.class);
		
		return sampleMapper.selectAll();
	}

}
