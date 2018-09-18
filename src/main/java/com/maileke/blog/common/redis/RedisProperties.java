package com.maileke.blog.common.redis;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/** 
 * shieason 2018.09.18
 */
@Component
@ConfigurationProperties(prefix = "redis.cache")
public class RedisProperties {

	private int    expireSeconds;
    private String clusterNodes;
    private int    commandTimeout;
	
    public int getExpireSeconds() {
		return expireSeconds;
	}
	public void setExpireSeconds(int expireSeconds) {
		this.expireSeconds = expireSeconds;
	}
	public String getClusterNodes() {
		return clusterNodes;
	}
	public void setClusterNodes(String clusterNodes) {
		this.clusterNodes = clusterNodes;
	}
	public int getCommandTimeout() {
		return commandTimeout;
	}
	public void setCommandTimeout(int commandTimeout) {
		this.commandTimeout = commandTimeout;
	}
}

