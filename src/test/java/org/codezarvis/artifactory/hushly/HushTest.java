package org.codezarvis.artifactory.hushly;

import junit.framework.TestCase;

public class HushTest extends TestCase{

	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public HushTest(String testName) {
		super(testName);
	}

	

	/**
	 * Rigourous Test :-)
	 */
	
	public void testHush() {
		Hush hush = new Hush();
		assertEquals("Hush", hush.getHush());
	}
}
