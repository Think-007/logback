package com.xinwei.c;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

public class LogC {

	private Logger logger = (Logger) LoggerFactory.getLogger(LogC.class);
	
	public void print(){
		logger.info("我是 logc，输出日志啦!info的");
		logger.debug("我是Logc，输入出日志 ！debug的");
	}
}
