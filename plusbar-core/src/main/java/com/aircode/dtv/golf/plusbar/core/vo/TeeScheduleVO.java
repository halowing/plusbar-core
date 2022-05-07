package com.aircode.dtv.golf.plusbar.core.vo;

import java.time.LocalDate;
import java.time.LocalTime;

public class TeeScheduleVO {
	
	private String teamId;
	private String teePosition;
	private String teeDate;
	private LocalTime teeTime;
	private LocalDate onAirDate;
	
	@Override
	public String toString() {
		return "TeeScheduleVO [teamId=" + teamId + ", teePosition=" + teePosition + ", teeDate=" + teeDate
				+ ", teeTime=" + teeTime + ", onAirDate=" + onAirDate + "]";
	}
	public String getTeamId() {
		return teamId;
	}
	public String getTeePosition() {
		return teePosition;
	}
	public String getTeeDate() {
		return teeDate;
	}
	public LocalTime getTeeTime() {
		return teeTime;
	}
	public LocalDate getOnAirDate() {
		return onAirDate;
	}
	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}
	public void setTeePosition(String teePosition) {
		this.teePosition = teePosition;
	}
	public void setTeeDate(String teeDate) {
		this.teeDate = teeDate;
	}
	public void setTeeTime(LocalTime teeTime) {
		this.teeTime = teeTime;
	}
	public void setOnAirDate(LocalDate onAirDate) {
		this.onAirDate = onAirDate;
	}
	
	
}
