package com.bwsk.config;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 图片绝对地址与虚拟地址映射
 */

@Component
public class WebMvcConfig implements WebMvcConfigurer {

	/**
	 * 虚拟路径配置
	 * 
	 * @param registry
	 */
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		String newrootPath = System.getProperty("user.dir") + "/upload";
		newrootPath = newrootPath.replaceAll("\\\\", "/");
		System.out.println("file:/" + newrootPath + "/file/");
		registry.addResourceHandler("/file/**").addResourceLocations("file:/" + newrootPath + "/file/");
		// registry.addResourceHandler("/image/picture/**").addResourceLocations("file:/"
		// + newrootPath + "/picture/");
		// registry.addResourceHandler("/image/模型描述/**").addResourceLocations("file:/usr/local/jar/D:/upload/模型描述/");//linux
		// registry.addResourceHandler("/image/web/模型封面/**").addResourceLocations("file:/usr/local/jar/D:/upload/web/模型封面/");//linux
		WebMvcConfigurer.super.addResourceHandlers(registry);
	}

}