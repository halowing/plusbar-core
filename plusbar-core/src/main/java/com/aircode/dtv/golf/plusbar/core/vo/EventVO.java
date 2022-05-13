package com.aircode.dtv.golf.plusbar.core.vo;

public class EventVO {

	private String  gameId 			;	
	private String  eventId			;	
	private String  eventName		;		
	private Integer viewOrder		;		
	private String  thumbnailUrl	;		
	private String  content			;
	
	@Override
	public String toString() {
		return "EventVO [gameId=" + gameId + ", eventId=" + eventId + ", eventName=" + eventName + ", viewOrder="
				+ viewOrder + ", thumbnailUrl=" + thumbnailUrl + ", content=" + content + "]";
	}
	public String getGameId() {
		return gameId;
	}
	public String getEventId() {
		return eventId;
	}
	public String getEventName() {
		return eventName;
	}
	public Integer getViewOrder() {
		return viewOrder;
	}
	public String getThumbnailUrl() {
		return thumbnailUrl;
	}
	public String getContent() {
		return content;
	}
	public void setGameId(String gameId) {
		this.gameId = gameId;
	}
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public void setViewOrder(Integer viewOrder) {
		this.viewOrder = viewOrder;
	}
	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}
	public void setContent(String content) {
		this.content = content;
	}		
	
	
}
