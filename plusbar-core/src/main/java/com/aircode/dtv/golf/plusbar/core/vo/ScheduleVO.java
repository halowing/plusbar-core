package com.aircode.dtv.golf.plusbar.core.vo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ScheduleVO {
	
	private String scheduleId;
	private String channelId;
	private String gameId;
	private Integer roundIdx;
	private Integer dayIdx;
	private LocalDateTime startDatetime;
	private LocalDateTime endDatetime;
	private LocalDate onAirDate;
	private LocalDateTime registDatetime;
	
	
	@Override
	public String toString() {
		return "ScheduleVO [scheduleId=" + scheduleId + ", channelId=" + channelId + ", gameId=" + gameId
				+ ", roundIdx=" + roundIdx + ", dayIdx=" + dayIdx + ", startDatetime=" + startDatetime
				+ ", endDatetime=" + endDatetime + ", onAirDate=" + onAirDate + ", registDatetime=" + registDatetime
				+ "]";
	}
	public String getScheduleId() {
		return scheduleId;
	}
	public String getChannelId() {
		return channelId;
	}
	public String getGameId() {
		return gameId;
	}
	public Integer getRoundIdx() {
		return roundIdx;
	}
	public Integer getDayIdx() {
		return dayIdx;
	}
	public LocalDateTime getStartDatetime() {
		return startDatetime;
	}
	public LocalDateTime getEndDatetime() {
		return endDatetime;
	}
	public LocalDate getOnAirDate() {
		return onAirDate;
	}
	public LocalDateTime getRegistDatetime() {
		return registDatetime;
	}
	public void setScheduleId(String scheduleId) {
		this.scheduleId = scheduleId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	public void setGameId(String gameId) {
		this.gameId = gameId;
	}
	public void setRoundIdx(Integer roundIdx) {
		this.roundIdx = roundIdx;
	}
	public void setDayIdx(Integer dayIdx) {
		this.dayIdx = dayIdx;
	}
	public void setStartDatetime(LocalDateTime startDatetime) {
		this.startDatetime = startDatetime;
	}
	public void setEndDatetime(LocalDateTime endDatetime) {
		this.endDatetime = endDatetime;
	}
	public void setOnAirDate(LocalDate onAirDate) {
		this.onAirDate = onAirDate;
	}
	public void setRegistDatetime(LocalDateTime registDatetime) {
		this.registDatetime = registDatetime;
	}
	
	
	
}
