package com.aircode.dtv.golf.plusbar.core.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.aircode.dtv.golf.plusbar.core.vo.ScheduleVO;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.USE_DEFAULTS)
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ScheduleDTO implements Serializable {

	private static final long serialVersionUID = 7101019338426826882L;
	
	private String scheduleId;
	
	@NotBlank
	private String channelId;
	
	@NotBlank
	private String gameId;
	
	@NotNull
	private Integer roundIdx;
	
	@NotNull
	private Integer dayIdx;
	
	@NotNull
	private LocalDateTime startDatetime;
	
	@NotNull
	private LocalDateTime endDatetime;
	
	@NotNull
	private LocalDate onAirDate;
	
	private LocalDateTime registDatetime;
	
	public ScheduleDTO () {}

	public ScheduleDTO (ScheduleVO vo) {
		this.setChannelId(vo.getChannelId());
		this.setDayIdx(vo.getDayIdx());
		this.setEndDatetime(vo.getEndDatetime());
		this.setGameId(vo.getGameId());
		this.setOnAirDate(vo.getOnAirDate());
		this.setRegistDatetime(vo.getRegistDatetime());
		this.setRoundIdx(vo.getRoundIdx());
		this.setScheduleId(vo.getScheduleId());
		this.setStartDatetime(vo.getStartDatetime());
	}

	@Override
	public String toString() {
		return "ScheduleDTO [scheduleId=" + scheduleId + ", channelId=" + channelId + ", gameId=" + gameId
				+ ", roundIdx=" + roundIdx + ", dayIdx=" + dayIdx + ", startDatetime=" + startDatetime
				+ ", endDatetime=" + endDatetime + ", onAirDate=" + onAirDate + ", registDatetime=" + registDatetime
				+ "]";
	}

	public String getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(String scheduleId) {
		this.scheduleId = scheduleId;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getGameId() {
		return gameId;
	}

	public void setGameId(String gameId) {
		this.gameId = gameId;
	}

	public Integer getRoundIdx() {
		return roundIdx;
	}

	public void setRoundIdx(Integer roundIdx) {
		this.roundIdx = roundIdx;
	}

	public Integer getDayIdx() {
		return dayIdx;
	}

	public void setDayIdx(Integer dayIdx) {
		this.dayIdx = dayIdx;
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

	public LocalDate getOnAirDate() {
		return onAirDate;
	}

	public void setOnAirDate(LocalDate onAirDate) {
		this.onAirDate = onAirDate;
	}

	public LocalDateTime getRegistDatetime() {
		return registDatetime;
	}

	public void setRegistDatetime(LocalDateTime registDatetime) {
		this.registDatetime = registDatetime;
	}
}
