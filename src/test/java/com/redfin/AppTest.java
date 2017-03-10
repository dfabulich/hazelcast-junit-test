package com.redfin;

import org.junit.Test;

public class AppTest {

	@Test
	public void testGo() throws Exception {
		Thread.sleep(10000L);
		new App().go();
	}
}