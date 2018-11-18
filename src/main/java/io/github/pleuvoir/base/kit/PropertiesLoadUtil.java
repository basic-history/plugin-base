package io.github.pleuvoir.base.kit;

import java.io.IOException;
import java.util.Properties;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.PropertiesLoaderUtils;

public abstract class PropertiesLoadUtil {

	public static PropertiesWrap pathToProWrap(String location) throws IOException {
		Resource res = new PathMatchingResourcePatternResolver().getResource(location);
		Properties properties = PropertiesLoaderUtils.loadProperties(res);
		PropertiesWrap config = new PropertiesWrap(properties);
		return config;
	}
}
