package com.lam.xacn.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.v2.DbxClientV2;

@Configuration
public class WebConfig {

	@Bean
	public DbxClientV2 dropboxClient(){
		
		DbxRequestConfig config = new DbxRequestConfig("gamesneed/1.0");
		
		DbxClientV2 client = new DbxClientV2(config, "XOlBm2Ym0wAAAAAAAAAAB_tdaVVMWVwBnbF-y6sPi5QzeDdsDxwrpCPXFpUH-eC2");

		return client;
	}
	
}
