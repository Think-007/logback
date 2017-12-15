package com.xinwei.a;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

public class LogA {

	private Logger logger = (Logger) LoggerFactory.getLogger(LogA.class);
	
	public void print(){
		logger.info("我是loga 输出日志啦！info的");
		logger.debug("我是loga 输出日志 debug");
	}
}
