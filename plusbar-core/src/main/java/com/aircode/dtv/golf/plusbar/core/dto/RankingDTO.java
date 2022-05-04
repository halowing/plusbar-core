package com.aircode.dtv.golf.plusbar.core.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 * 실시간 순위 정보
 * 
 * @author "sgkim@aircode.com"
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.USE_DEFAULTS)
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class RankingDTO implements Serializable {
	
	private static final long serialVersionUID = -5534693820653498271L;
	
	private int order = 0;
	
	@NotBlank
	private String ranking;
	
	@NotBlank
	private String playerId;
	
	@NotBlank
	private String playerName;
	
	private String holeIdx;
	
	@NotBlank
	private String totalScore;
	
	@NotBlank
	private String todayScore;
	
	
	public int getOrder() {
		return order;
	}
	public void setOrder(int order) {
		this.order = order;
	}
	public String getRanking() {
		return ranking;
	}

	public void setRanking(String ranking) {
		this.ranking = ranking;
	}
	public String getPlayerId() {
		return playerId;
	}
	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getHoleIdx() {
		return holeIdx;
	}
	public void setHoleIdx(String holeIdx) {
		this.holeIdx = holeIdx;
	}
	public String getTotalScore() {
		return totalScore;
	}
	public void setTotalScore(String totalScore) {
		this.totalScore = totalScore;
	}
	public String getTodayScore() {
		return todayScore;
	}
	public void setTodayScore(String todayScore) {
		this.todayScore = todayScore;
	}
	@Override
	public String toString() {
		return "RankingDTO [order=" + order + ", ranking=" + ranking + ", playerId=" + playerId + ", playerName="
				+ playerName + ", holeIdx=" + holeIdx + ", totalScore=" + totalScore + ", todayScore=" + todayScore
				+ "]";
	}
	
	
	
}
