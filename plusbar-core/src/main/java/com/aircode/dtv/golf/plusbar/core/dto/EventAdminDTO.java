package com.aircode.dtv.golf.plusbar.core.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

import com.aircode.dtv.golf.plusbar.core.vo.EventVO;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 * Event 관련 정보
 * 
 * @author "sgkim@aircode.com"
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.USE_DEFAULTS)
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class EventAdminDTO extends EventVO implements Serializable {

	private static final long serialVersionUID = 5628893468505756023L;
	
	@NotBlank
	private String  gameId 			;	
	
	@NotBlank
	private String  eventId			;

	@Override
	public String toString() {
		return "EventAdminDTO [gameId=" + gameId + ", eventId=" + eventId + ", toString()=" + super.toString() + "]";
	}

	public String getGameId() {
		return gameId;
	}

	public String getEventId() {
		return eventId;
	}

	public void setGameId(String gameId) {
		this.gameId = gameId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}	
	
	
	
}
