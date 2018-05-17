package com.company.gifmanager.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

import com.company.gifmanager.giphy.service.GiphyAccess;
import com.company.gifmanager.service.GifManager;
import com.company.gifmanager.service.UserManager;
import com.company.gifmanager.util.RestResponseErrorHandler;


/**
 * Main application configuration class.
 * The application is configured to utilize flyway to maintain the database.
 * @author johnl
 */
@Configuration
@EnableTransactionManagement
@DependsOn("flyway")
public class AppConfig {

	@Value("${gifmanager.giphy.key}")
	private String key;
	
	@Value("${gifmanager.giphy.url}")
	private String url;
	
	@Value("${gifmanager.giphy.version}")
	private String version;
	
	@Value("${gifmanager.giphy.upload.url}")
	private String uploadUrl;
	
	@Value("${gifmanager.giphy.upload.version")
	private String uploadVersion;
	
	@Bean
	public RestTemplate restTemplate() {
		RestTemplate bean = new RestTemplate();
		bean.setErrorHandler(new RestResponseErrorHandler());
		return bean;
	}
	
	@Bean
	public UserManager userManager() {
		UserManager bean = new UserManager();
		return bean;
	}
	
	@Bean
	public GifManager gifManager() {
		GifManager bean = new GifManager();
		return bean;
	}
	
	@Bean
	public GiphyAccess giphyAccess() {
		GiphyAccess bean = new GiphyAccess();
		bean.setBaseUri(url);
		bean.setVersion(version);
		bean.setApiKey(key);
		bean.setUploadUrl(uploadUrl);
		
		if (StringUtils.isEmpty(uploadVersion)) {
			bean.setUploadVersion(version);
		}
		else {
			bean.setUploadVersion(uploadVersion);
		}
		
		return bean;
	}
	
}
