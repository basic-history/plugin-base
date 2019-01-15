package io.github.pleuvoir.base.kit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.github.pleuvoir.base.kit.VersionUtils;

public class PluginLogo {

	private static final Logger logger = LoggerFactory.getLogger(PluginLogo.class);
	 
	private static final String LINE_SEPARATOR = System.getProperty("line.separator");
	
	 private static final String LOGO = "       _             _       \r\n" + 
	 		"      | |           (_)      \r\n" + 
	 		" _ __ | |_   _  __ _ _ _ __  \r\n" + 
	 		"| '_ \\| | | | |/ _` | | '_ \\ \r\n" + 
	 		"| |_) | | |_| | (_| | | | | |\r\n" + 
	 		"| .__/|_|\\__,_|\\__, |_|_| |_|\r\n" + 
	 		"| |             __/ |        \r\n" + 
	 		"|_|            |___/        ";

	    public void logo() {
	        String bannerText = buildBannerText();
	        if (logger.isInfoEnabled()) {
	            logger.info(bannerText);
	        } else {
	            System.out.print(bannerText);
	        }
	    }

	    private String buildBannerText() {
	        return LINE_SEPARATOR
	                + LINE_SEPARATOR
	                + LOGO
	                + LINE_SEPARATOR
	                + " :: plugin :: (v" + VersionUtils.getVersion(getClass(), "1.0.1") + ")"
	                + LINE_SEPARATOR;
	    }
	    
}
