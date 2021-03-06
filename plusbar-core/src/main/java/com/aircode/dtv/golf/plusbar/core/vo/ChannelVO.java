package com.aircode.dtv.golf.plusbar.core.vo;

import java.util.Arrays;

public class ChannelVO {
	
	private String channelId;
	private String channelName;
	private Integer refreshRate;
	private String[] unableMenuList;
	private Boolean homeButtonUse;
	private Integer homeDelayTime;
	private Boolean show;
	private String appVersion;
	@Override
	public String toString() {
		return "ChannelVO [channelId=" + channelId + ", channelName=" + channelName + ", refreshRate=" + refreshRate
				+ ", unableMenuList=" + Arrays.toString(unableMenuList) + ", homeButtonUse=" + homeButtonUse
				+ ", homeDelayTime=" + homeDelayTime + ", show=" + show + ", appVersion=" + appVersion + "]";
	}
	public String getChannelId() {
		return channelId;
	}
	public String getChannelName() {
		return channelName;
	}
	public Integer getRefreshRate() {
		return refreshRate;
	}
	public String[] getUnableMenuList() {
		return unableMenuList;
	}
	public Boolean getHomeButtonUse() {
		return homeButtonUse;
	}
	public Integer getHomeDelayTime() {
		return homeDelayTime;
	}
	public Boolean getShow() {
		return show;
	}
	public String getAppVersion() {
		return appVersion;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	public void setRefreshRate(Integer refreshRate) {
		this.refreshRate = refreshRate;
	}
	public void setUnableMenuList(String[] unableMenuList) {
		this.unableMenuList = unableMenuList;
	}
	public void setHomeButtonUse(Boolean homeButtonUse) {
		this.homeButtonUse = homeButtonUse;
	}
	public void setHomeDelayTime(Integer homeDelayTime) {
		this.homeDelayTime = homeDelayTime;
	}
	public void setShow(Boolean show) {
		this.show = show;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}
	
	
	
}
