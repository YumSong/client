package com.lames.client.utils;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class PropertiesUtilsTest {

	@Test
	public void testGetPropertyString() {
		String str = PropertiesUtils.getProperty("adminUrl");
		System.out.println(str);
		Assert.assertNotNull(str);
	}

}
