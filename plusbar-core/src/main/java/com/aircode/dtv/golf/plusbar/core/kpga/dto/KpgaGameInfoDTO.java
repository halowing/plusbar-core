package com.aircode.dtv.golf.plusbar.core.kpga.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(value = PropertyNamingStrategies.LowerCamelCaseStrategy.class)
public class KpgaGameInfoDTO implements Serializable {

	private static final long serialVersionUID = -694173196540893291L;

	private String  gameId             ;
	
	@JsonAlias(value = {"seriseId"})
	private String  seriesId           ;
	
	private String  gameName           ;
	private Long    gamePrize          ;
	private String  amtUnit            ;  // 상금 단위 "KSW"
	private Integer gamePlayerCnt      ;
	private Integer gameRoundCnt       ;
	private String  gameOpenDate	   ;
	private String  gameCloseDate	   ;
	private String  courseId		   ;
	@Override
	public String toString() {
		return "KpgaGameInfoDTO [gameId=" + gameId + ", seriesId=" + seriesId + ", gameName=" + gameName
				+ ", gamePrize=" + gamePrize + ", amtUnit=" + amtUnit + ", gamePlayerCnt=" + gamePlayerCnt
				+ ", gameRoundCnt=" + gameRoundCnt + ", gameOpenDate=" + gameOpenDate + ", gameCloseDate="
				+ gameCloseDate + ", courseId=" + courseId + "]";
	}
	/**
	 * @return the gameId
	 */
	public String getGameId() {
		return gameId;
	}
	/**
	 * @return the seriesId
	 */
	public String getSeriesId() {
		return seriesId;
	}
	/**
	 * @return the gameName
	 */
	public String getGameName() {
		return gameName;
	}
	/**
	 * @return the gamePrize
	 */
	public Long getGamePrize() {
		return gamePrize;
	}
	/**
	 * @return the amtUnit
	 */
	public String getAmtUnit() {
		return amtUnit;
	}
	/**
	 * @return the gamePlayerCnt
	 */
	public Integer getGamePlayerCnt() {
		return gamePlayerCnt;
	}
	/**
	 * @return the gameRoundCnt
	 */
	public Integer getGameRoundCnt() {
		return gameRoundCnt;
	}
	/**
	 * @return the gameOpenDate
	 */
	public String getGameOpenDate() {
		return gameOpenDate;
	}
	/**
	 * @return the gameCloseDate
	 */
	public String getGameCloseDate() {
		return gameCloseDate;
	}
	/**
	 * @return the courseId
	 */
	public String getCourseId() {
		return courseId;
	}
	/**
	 * @param gameId the gameId to set
	 */
	public void setGameId(String gameId) {
		this.gameId = gameId;
	}
	/**
	 * @param seriesId the seriesId to set
	 */
	public void setSeriesId(String seriesId) {
		this.seriesId = seriesId;
	}
	/**
	 * @param gameName the gameName to set
	 */
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	/**
	 * @param gamePrize the gamePrize to set
	 */
	public void setGamePrize(Long gamePrize) {
		this.gamePrize = gamePrize;
	}
	/**
	 * @param amtUnit the amtUnit to set
	 */
	public void setAmtUnit(String amtUnit) {
		this.amtUnit = amtUnit;
	}
	/**
	 * @param gamePlayerCnt the gamePlayerCnt to set
	 */
	public void setGamePlayerCnt(Integer gamePlayerCnt) {
		this.gamePlayerCnt = gamePlayerCnt;
	}
	/**
	 * @param gameRoundCnt the gameRoundCnt to set
	 */
	public void setGameRoundCnt(Integer gameRoundCnt) {
		this.gameRoundCnt = gameRoundCnt;
	}
	/**
	 * @param gameOpenDate the gameOpenDate to set
	 */
	public void setGameOpenDate(String gameOpenDate) {
		this.gameOpenDate = gameOpenDate;
	}
	/**
	 * @param gameCloseDate the gameCloseDate to set
	 */
	public void setGameCloseDate(String gameCloseDate) {
		this.gameCloseDate = gameCloseDate;
	}
	/**
	 * @param courseId the courseId to set
	 */
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	
	
	
	
}
