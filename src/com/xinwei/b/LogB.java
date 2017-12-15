package com.xinwei.b;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

public class LogB {

	private Logger logger = (Logger) LoggerFactory.getLogger(LogB.class);
	
	public void print(){
		logger.info("我是 logb，输出日志啦!info的");
		logger.debug("我是Logb，输入出日志 debug的");
	}
}
