package com.aircode.dtv.golf.plusbar.core.vo;

public class SponsorVO {
	
	private String  gameId 		;	
	private String  sponsorId		;
	private String  sponsorName	;
	private Integer viewOrder		;
	private String  thumbnailUrl	;
	private String  cdnId			;
	private String  playUri		;
	
	@Override
	public String toString() {
		return "SponsorVO [gameId=" + gameId + ", sponsorId=" + sponsorId + ", sponsorName=" + sponsorName
				+ ", viewOrder=" + viewOrder + ", thumbnailUrl=" + thumbnailUrl + ", cdnId=" + cdnId + ", playUri="
				+ playUri + "]";
	}
	public String getGameId() {
		return gameId;
	}
	public String getSponsorId() {
		return sponsorId;
	}
	public String getSponsorName() {
		return sponsorName;
	}
	public Integer getViewOrder() {
		return viewOrder;
	}
	public String getThumbnailUrl() {
		return thumbnailUrl;
	}
	public String getCdnId() {
		return cdnId;
	}
	public String getPlayUri() {
		return playUri;
	}
	public void setGameId(String gameId) {
		this.gameId = gameId;
	}
	public void setSponsorId(String sponsorId) {
		this.sponsorId = sponsorId;
	}
	public void setSponsorName(String sponsorName) {
		this.sponsorName = sponsorName;
	}
	public void setViewOrder(Integer viewOrder) {
		this.viewOrder = viewOrder;
	}
	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}
	public void setCdnId(String cdnId) {
		this.cdnId = cdnId;
	}
	public void setPlayUri(String playUri) {
		this.playUri = playUri;
	}
	
	
}
