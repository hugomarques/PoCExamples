package com.hugodesmarques;

import com.hugodesmarques.controllers.HelloWorldController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(DemoApplication.class)
public class DemoApplicationTests {

	@Autowired
	private HelloWorldController helloWorldController;

	@Test
	public void contextLoads() {
        assertNotNull(helloWorldController);
	}

}
