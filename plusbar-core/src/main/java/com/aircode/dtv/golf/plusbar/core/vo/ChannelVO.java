package com.aircode.dtv.golf.plusbar.core.vo;

import java.util.Arrays;

public class ChannelVO {
	
	private String channelId;
	private String channelName;
	private Integer refreshRate;
	private String[] unableMenuList;
	private boolean homeButtonUse;
	private Integer homeDelayTime;
	private boolean show;
	
	
	
	public String getChannelId() {
		return channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	public String getChannelName() {
		return channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	public Integer getRefreshRate() {
		return refreshRate;
	}
	public void setRefreshRate(Integer refreshRate) {
		this.refreshRate = refreshRate;
	}
	public String[] getUnableMenuList() {
		return unableMenuList;
	}
	public void setUnableMenuList(String[] unableMenuList) {
		this.unableMenuList = unableMenuList;
	}
	public boolean isHomeButtonUse() {
		return homeButtonUse;
	}
	public void setHomeButtonUse(boolean homeButtonUse) {
		this.homeButtonUse = homeButtonUse;
	}
	public Integer getHomeDelayTime() {
		return homeDelayTime;
	}
	public void setHomeDelayTime(Integer homeDelayTime) {
		this.homeDelayTime = homeDelayTime;
	}
	public boolean isShow() {
		return show;
	}
	public void setShow(boolean show) {
		this.show = show;
	}
	@Override
	public String toString() {
		return "ChannelVO [channelId=" + channelId + ", channelName=" + channelName + ", refreshRate=" + refreshRate
				+ ", unableMenuList=" + Arrays.toString(unableMenuList) + ", homeButtonUse=" + homeButtonUse
				+ ", homeDelayTime=" + homeDelayTime + ", show=" + show + "]";
	}
	
	
}
