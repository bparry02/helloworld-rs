package org.jboss.as.quickstarts.rshelloworld;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class HelloServiceTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void createHelloMessageReturnsMessage() {
		// given
		String name = "Joe";
		String expectedMessage = "Hello " + name + "!";
		
		HelloService service = new HelloService();
		
		// when
		String message = service.createHelloMessage(name);
		
		// then
		assertEquals(expectedMessage, message);
	}

}
