package com.aircode.dtv.golf.plusbar.core.vo;

public class GameVO {

	private String gameId;
	private String seriesId           ;
	private String gameName;
	private Long    gamePrize          ;
	private String  amtUnit            ;  // 상금 단위 "KSW"
	private Integer gamePlayerCnt      ;
	private Integer gameRoundCnt       ;
	private String  gameOpenDate	   ;
	private String  gameCloseDate	   ;
	@Override
	public String toString() {
		return "GameVO [gameId=" + gameId + ", seriesId=" + seriesId + ", gameName=" + gameName + ", gamePrize="
				+ gamePrize + ", amtUnit=" + amtUnit + ", gamePlayerCnt=" + gamePlayerCnt + ", gameRoundCnt="
				+ gameRoundCnt + ", gameOpenDate=" + gameOpenDate + ", gameCloseDate=" + gameCloseDate + "]";
	}
	public String getGameId() {
		return gameId;
	}
	public String getSeriesId() {
		return seriesId;
	}
	public String getGameName() {
		return gameName;
	}
	public Long getGamePrize() {
		return gamePrize;
	}
	public String getAmtUnit() {
		return amtUnit;
	}
	public Integer getGamePlayerCnt() {
		return gamePlayerCnt;
	}
	public Integer getGameRoundCnt() {
		return gameRoundCnt;
	}
	public String getGameOpenDate() {
		return gameOpenDate;
	}
	public String getGameCloseDate() {
		return gameCloseDate;
	}
	public void setGameId(String gameId) {
		this.gameId = gameId;
	}
	public void setSeriesId(String seriesId) {
		this.seriesId = seriesId;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public void setGamePrize(Long gamePrize) {
		this.gamePrize = gamePrize;
	}
	public void setAmtUnit(String amtUnit) {
		this.amtUnit = amtUnit;
	}
	public void setGamePlayerCnt(Integer gamePlayerCnt) {
		this.gamePlayerCnt = gamePlayerCnt;
	}
	public void setGameRoundCnt(Integer gameRoundCnt) {
		this.gameRoundCnt = gameRoundCnt;
	}
	public void setGameOpenDate(String gameOpenDate) {
		this.gameOpenDate = gameOpenDate;
	}
	public void setGameCloseDate(String gameCloseDate) {
		this.gameCloseDate = gameCloseDate;
	}
	
	
}
