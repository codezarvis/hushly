package org.codezarvis.artifactory.hushly;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	

	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {
		App app = new App();
		assertEquals("App", app.getAppName());
	}
}
