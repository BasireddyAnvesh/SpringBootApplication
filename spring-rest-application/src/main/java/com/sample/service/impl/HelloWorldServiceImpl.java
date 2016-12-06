package com.sample.service.impl;

import com.sample.service.HelloWorldService;

public class HelloWorldServiceImpl implements HelloWorldService {

	@Override
	public String getClassName() {
		return HelloWorldServiceImpl.class.getName();
	}

}
