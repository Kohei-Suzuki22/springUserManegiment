package com.user.manegiment.basis.bean;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class JavaConfig {

	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		
		// ↓ここで "i18n/messages_en" のようにすると、ブラウザの言語を変更しても enのままになってしまうので注意
		// "i18n/messages" を指定すると、ブラウザの言語設定が反映される
		messageSource.setBasename("i18n/messages");
		messageSource.setDefaultEncoding("UTF-8");
		
		return messageSource;
		
	}
}
