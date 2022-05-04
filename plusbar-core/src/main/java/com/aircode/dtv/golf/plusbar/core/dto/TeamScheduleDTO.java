package com.aircode.dtv.golf.plusbar.core.dto;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Round별 팀 출발 스케줄 정보
 * 
 * @author "sgkim@aircode.com"
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.USE_DEFAULTS)
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TeamScheduleDTO implements Serializable {
	
	private static final long serialVersionUID = 2701891001915999247L;
	
	@JsonIgnore
	private String teamId;
	
	@JsonIgnore
	private String gameId;
	
	@JsonIgnore
	private Integer roundIdx;

	private int order;
	
	@NotBlank
	private String teePosition;
	
	@NotNull
	@JsonFormat(shape = Shape.STRING, pattern = "HH:mm")
	private LocalTime teeTime;
	
	private String teeDate;
	
	@NotEmpty
	@Valid
	private List<PlayerDTO> palyerList;

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public String getTeePosition() {
		return teePosition;
	}

	public void setTeePosition(String teePosition) {
		this.teePosition = teePosition;
	}

	public LocalTime getTeeTime() {
		return teeTime;
	}

	public void setTeeTime(LocalTime teeTime) {
		this.teeTime = teeTime;
	}

	public String getTeeDate() {
		return teeDate;
	}

	public void setTeeDate(String teeDate) {
		this.teeDate = teeDate;
	}

	public List<PlayerDTO> getPalyerList() {
		return palyerList;
	}

	public void setPalyerList(List<PlayerDTO> palyerList) {
		this.palyerList = palyerList;
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

	public String getTeamId() {
		return teamId;
	}

	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}

	@Override
	public String toString() {
		return "TeamScheduleDTO [teamId=" + teamId + ", gameId=" + gameId + ", roundIdx=" + roundIdx + ", order="
				+ order + ", teePosition=" + teePosition + ", teeTime=" + teeTime + ", teeDate=" + teeDate
				+ ", palyerList=" + palyerList + "]";
	}
}
