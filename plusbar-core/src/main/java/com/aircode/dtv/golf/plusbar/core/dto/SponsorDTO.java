package com.aircode.dtv.golf.plusbar.core.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 * 광고주 정보
 * 
 * @author "sgkim@aircode.com"
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.USE_DEFAULTS)
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class SponsorDTO implements Serializable {
	
	private static final long serialVersionUID = 7107180519133172532L;

	@JsonIgnore
	private String gameId;
	
	@JsonIgnore
	private Integer order;
	
	@NotBlank
	private String sponsorId;
	
	private String sponsorName;
	
	@NotBlank
	private String thumbnailUrl;
	
	private String cdnId;
	private String playUri;
	
	
	public String getSponsorId() {
		return sponsorId;
	}
	public void setSponsorId(String sponsorId) {
		this.sponsorId = sponsorId;
	}
	public String getSponsorName() {
		return sponsorName;
	}
	public void setSponsorName(String sponsorName) {
		this.sponsorName = sponsorName;
	}
	public String getThumbnailUrl() {
		return thumbnailUrl;
	}
	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}
	public String getCdnId() {
		return cdnId;
	}
	public void setCdnId(String cdnId) {
		this.cdnId = cdnId;
	}
	public String getPlayUri() {
		return playUri;
	}
	public void setPlayUri(String playUri) {
		this.playUri = playUri;
	}
	public String getGameId() {
		return gameId;
	}
	public void setGameId(String gameId) {
		this.gameId = gameId;
	}
	public Integer getOrder() {
		return order;
	}
	public void setOrder(Integer order) {
		this.order = order;
	}
	@Override
	public String toString() {
		return "SponsorDTO [gameId=" + gameId + ", order=" + order + ", sponsorId=" + sponsorId + ", sponsorName="
				+ sponsorName + ", thumbnailUrl=" + thumbnailUrl + ", cdnId=" + cdnId + ", playUri=" + playUri + "]";
	}
	
	
}
