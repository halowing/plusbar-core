package com.aircode.dtv.golf.plusbar.core.kpga.dto.sk;

import java.io.Serializable;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 * 조편성 정보
 * 
 * KPGA SK API 연동 규격 
 * 
 * @author "aircode"
 *
 */
@JsonNaming(value = PropertyNamingStrategies.LowerCamelCaseStrategy.class)
public class SkGroupDTO implements Serializable {

	private static final long serialVersionUID = -7416809031899849136L;
	
	private String gameId       ;
	private Integer expGroupNo   ;
	private String startInOut   ;
	private String startTime    ;
	private String memberId     ;
	private String playerName   ;
	public String getGameId() {
		return gameId;
	}
	public void setGameId(String gameId) {
		this.gameId = gameId;
	}
	public Integer getExpGroupNo() {
		return expGroupNo;
	}
	public void setExpGroupNo(Integer expGroupNo) {
		this.expGroupNo = expGroupNo;
	}
	public String getStartInOut() {
		return startInOut;
	}
	public void setStartInOut(String startInOut) {
		this.startInOut = startInOut;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	@Override
	public String toString() {
		return "SkGroupDTO [gameId=" + gameId + ", expGroupNo=" + expGroupNo + ", startInOut=" + startInOut
				+ ", startTime=" + startTime + ", memberId=" + memberId + ", playerName=" + playerName + "]";
	}

	
}
