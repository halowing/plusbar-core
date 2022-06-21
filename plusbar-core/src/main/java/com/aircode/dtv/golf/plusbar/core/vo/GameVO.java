package com.aircode.dtv.golf.plusbar.core.vo;

public class GameVO {

	private String gameId;
	private String seriesId           ;
	private String gameName;
	private Long    gamePrize          	;
	private Long 	winningPrize		;
	private String  amtUnit            	;  // 상금 단위 "KSW"
	private Integer gamePlayerCnt      	;
	private Integer gameRoundCnt       	;
	private String  gameOpenDate	   	;
	private String  gameCloseDate	   	;
	private String 	title				;
	private String 	content				;
	private String 	gameImageUrl		;
	
	
	
	@Override
	public String toString() {
		return String.format(
				"GameVO [gameId=%s, seriesId=%s, gameName=%s, gamePrize=%s, winningPrize=%s, amtUnit=%s, gamePlayerCnt=%s, gameRoundCnt=%s, gameOpenDate=%s, gameCloseDate=%s, title=%s, content=%s, gameImageUrl=%s]",
				gameId, seriesId, gameName, gamePrize, winningPrize, amtUnit, gamePlayerCnt, gameRoundCnt, gameOpenDate,
				gameCloseDate, title, content, gameImageUrl);
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
	public String getTitle() {
		return title;
	}
	public String getContent() {
		return content;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getGameImageUrl() {
		return gameImageUrl;
	}
	public void setGameImageUrl(String gameImageUrl) {
		this.gameImageUrl = gameImageUrl;
	}

	public Long getWinningPrize() {
		return winningPrize;
	}

	public void setWinningPrize(Long winningPrize) {
		this.winningPrize = winningPrize;
	}
	
	
}
