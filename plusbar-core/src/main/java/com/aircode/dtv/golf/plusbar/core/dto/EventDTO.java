package com.aircode.dtv.golf.plusbar.core.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Event 관련 정보
 * 
 * @author "sgkim@aircode.com"
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.USE_DEFAULTS)
public class EventDTO implements Serializable {

	private static final long serialVersionUID = 5628893468505756023L;
	
	@JsonIgnore
	private String gameId;
	
	@JsonIgnore
	private Integer order;

	@NotBlank
	private String eventId;
	
	private String eventName;
	
	@NotBlank
	private String thumbnailUrl;
	
	private String content;

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getThumbnailUrl() {
		return thumbnailUrl;
	}

	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
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
		return "EventDTO [gameId=" + gameId + ", order=" + order + ", eventId=" + eventId + ", eventName=" + eventName
				+ ", thumbnailUrl=" + thumbnailUrl + ", content=" + content + "]";
	}
}
