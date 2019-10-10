package com.project.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 以这种方式注释的Bean可以在运行时刷新， 并且使用它们的任何组件将在下一个方法调用上获得一个新实例， 完全初始化所有依赖项。
 */
@Component
@RefreshScope
public class EmailConfig {
	@Value("${account}")
	private String account;

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}


}
