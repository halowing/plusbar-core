package com.aircode.dtv.golf.plusbar.core.dto;

import java.io.Serializable;
import java.util.Arrays;

import com.aircode.dtv.golf.plusbar.core.vo.ChannelVO;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Channel 상태 관리 DTO
 * 
 * @author "sgkim@aircode.com"
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
public class ChannelDTO implements Serializable {

	private static final long serialVersionUID = 7532166921258697688L;
	
	private String channelId;
	private String channelName;
	private Integer refreshRate;
	private String[] unableMenuList;
	private Boolean homeButtonUse;
	private Integer homeDelayTime;
	private String appVersion;
	private Boolean show;
	
	public ChannelDTO() {}
	
	public ChannelDTO(ChannelVO channelVO) {
		this.channelId = channelVO.getChannelId();
		this.channelName =  channelVO.getChannelName();
		this.refreshRate = channelVO.getRefreshRate();
		this.unableMenuList = channelVO.getUnableMenuList();
		this.homeButtonUse = channelVO.getHomeButtonUse();
		this.homeDelayTime = channelVO.getHomeDelayTime();
		this.appVersion = channelVO.getAppVersion();
		this.show = channelVO.getShow();
	}

	@Override
	public String toString() {
		return "ChannelDTO [channelId=" + channelId + ", channelName=" + channelName + ", refreshRate=" + refreshRate
				+ ", unableMenuList=" + Arrays.toString(unableMenuList) + ", homeButtonUse=" + homeButtonUse
				+ ", homeDelayTime=" + homeDelayTime + ", appVersion=" + appVersion + ", show=" + show + "]";
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

	public String getAppVersion() {
		return appVersion;
	}

	public Boolean getShow() {
		return show;
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

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public void setShow(Boolean show) {
		this.show = show;
	}
}
