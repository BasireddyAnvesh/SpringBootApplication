package com.powermock.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.stubbing.OngoingStubbing;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.modules.junit4.PowerMockRunner;

import com.sample.service.HelloWorldService;
import com.sample.service.impl.HelloWorldServiceImpl;

/**
 * @author Anvesh
 * This is a Test class using PowerMock
 *
 */

@RunWith(PowerMockRunner.class)
public class SampleTestClass {
private HelloWorldService helloWorldService;
	
	@Before
	public void setUp() {
		System.out.println("Setting up test class");
		helloWorldService = Mockito.mock(HelloWorldService.class);
		helloWorldService = new HelloWorldServiceImpl();	
	}
	
	@Test
	public void testMethod() {
		OngoingStubbing<String> className = PowerMockito.when(helloWorldService.getClassName()).thenReturn("HelloWorldServiceImpl");
		Assert.assertEquals("HelloWorldServiceImpl", className);
	}
	
}
