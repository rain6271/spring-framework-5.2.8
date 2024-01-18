package org.springframework.zpr.properties;

import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Properties;

public class PropertiesTest {


	@Test
	public void testProperties() throws Exception {
		Properties properties = new Properties();
		URL url = new URL("file:D:\\spring-source\\smart-park-framework\\spring-zpr\\src\\main\\resources\\properties.test");
		URLConnection connection = url.openConnection();
		InputStream inputStream = connection.getInputStream();
		properties.load(inputStream);
		System.out.println(properties);


	}
}
