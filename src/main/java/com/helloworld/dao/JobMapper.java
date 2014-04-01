package com.helloworld.dao;

import java.util.List;

import com.helloworld.model.JobInfo;

public interface JobMapper {

	List<JobInfo> selectAll();
	int insert(JobInfo sampleInfo);
	int update(JobInfo sampleInfo);
	int delete(JobInfo sampleInfo);
}

