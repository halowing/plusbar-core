package com.aircode.dtv.golf.plusbar.core.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

/**
 * 방송 스케줄 정보
 * 
 * @author "sgkim@aircode.com"
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.USE_DEFAULTS)
public class OnAirScheduleDTO implements Serializable {

	private static final long serialVersionUID = -5421744748452626641L;
	
	@NotBlank
	private String gameId;
	
	@NotBlank
	private String gameName;
	
	@Max(value = 4)
	@Min(value = 1)
	private Integer roundIdx;
	
	@JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
	private LocalDateTime startDatetime;
	
	@JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
	private LocalDateTime endDatetime;
	
	public String getGameId() {
		return gameId;
	}
	public void setGameId(String gameId) {
		this.gameId = gameId;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public Integer getRoundIdx() {
		return roundIdx;
	}
	public void setRoundIdx(Integer roundIdx) {
		this.roundIdx = roundIdx;
	}
	public LocalDateTime getStartDatetime() {
		return startDatetime;
	}
	public void setStartDatetime(LocalDateTime startDatetime) {
		this.startDatetime = startDatetime;
	}
	public LocalDateTime getEndDatetime() {
		return endDatetime;
	}
	public void setEndDatetime(LocalDateTime endDatetime) {
		this.endDatetime = endDatetime;
	}
	@Override
	public String toString() {
		return "Schedule [gameId=" + gameId + ", gameName=" + gameName + ", roundIdx=" + roundIdx
				+ ", startDatetime=" + startDatetime + ", endDatetime=" + endDatetime + "]";
	}
}
