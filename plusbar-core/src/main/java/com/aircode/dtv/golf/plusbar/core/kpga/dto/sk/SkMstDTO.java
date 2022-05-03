package com.aircode.dtv.golf.plusbar.core.kpga.dto.sk;

import java.io.Serializable;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 * 대회정보 
 * 
 * KPGA SK API 연동 규격 
 * 
 * @author "aircode"
 *
 */
@JsonNaming(value = PropertyNamingStrategies.LowerCamelCaseStrategy.class)
public class SkMstDTO implements Serializable {

	private static final long serialVersionUID = 6945427501184562241L;
	
	private String gameId             ;
	private String seriseId           ;
	private String tourId             ;
	private String seasonId           ;
	private String gameType           ;
	private String gameName           ;
	private String enName             ;
	private String apcYear            ;
	private Integer seriseDegree       ;
	private Integer seriseYearcnt      ;
	private String gameOfcrecordType  ;
	private String gameOpenDate       ;
	private String gameCloseDate      ;
	private String regOpenDate        ;
	private String regCloseDate       ;
	private String regOpenTime        ;
	private String regCloseTime       ;
	private Long gamePrize          ;
	private String amtUnit            ;
	private Integer gamePlayerCnt      ;
	private Integer gameRoundCnt       ;
	private String isGamefeeBundle    ;
	public String getGameId() {
		return gameId;
	}
	public void setGameId(String gameId) {
		this.gameId = gameId;
	}
	public String getSeriseId() {
		return seriseId;
	}
	public void setSeriseId(String seriseId) {
		this.seriseId = seriseId;
	}
	public String getTourId() {
		return tourId;
	}
	public void setTourId(String tourId) {
		this.tourId = tourId;
	}
	public String getSeasonId() {
		return seasonId;
	}
	public void setSeasonId(String seasonId) {
		this.seasonId = seasonId;
	}
	public String getGameType() {
		return gameType;
	}
	public void setGameType(String gameType) {
		this.gameType = gameType;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public String getEnName() {
		return enName;
	}
	public void setEnName(String enName) {
		this.enName = enName;
	}
	public String getApcYear() {
		return apcYear;
	}
	public void setApcYear(String apcYear) {
		this.apcYear = apcYear;
	}
	public Integer getSeriseDegree() {
		return seriseDegree;
	}
	public void setSeriseDegree(Integer seriseDegree) {
		this.seriseDegree = seriseDegree;
	}
	public Integer getSeriseYearcnt() {
		return seriseYearcnt;
	}
	public void setSeriseYearcnt(Integer seriseYearcnt) {
		this.seriseYearcnt = seriseYearcnt;
	}
	public String getGameOfcrecordType() {
		return gameOfcrecordType;
	}
	public void setGameOfcrecordType(String gameOfcrecordType) {
		this.gameOfcrecordType = gameOfcrecordType;
	}
	public String getGameOpenDate() {
		return gameOpenDate;
	}
	public void setGameOpenDate(String gameOpenDate) {
		this.gameOpenDate = gameOpenDate;
	}
	public String getGameCloseDate() {
		return gameCloseDate;
	}
	public void setGameCloseDate(String gameCloseDate) {
		this.gameCloseDate = gameCloseDate;
	}
	public String getRegOpenDate() {
		return regOpenDate;
	}
	public void setRegOpenDate(String regOpenDate) {
		this.regOpenDate = regOpenDate;
	}
	public String getRegCloseDate() {
		return regCloseDate;
	}
	public void setRegCloseDate(String regCloseDate) {
		this.regCloseDate = regCloseDate;
	}
	public String getRegOpenTime() {
		return regOpenTime;
	}
	public void setRegOpenTime(String regOpenTime) {
		this.regOpenTime = regOpenTime;
	}
	public String getRegCloseTime() {
		return regCloseTime;
	}
	public void setRegCloseTime(String regCloseTime) {
		this.regCloseTime = regCloseTime;
	}
	public Long getGamePrize() {
		return gamePrize;
	}
	public void setGamePrize(Long gamePrize) {
		this.gamePrize = gamePrize;
	}
	public String getAmtUnit() {
		return amtUnit;
	}
	public void setAmtUnit(String amtUnit) {
		this.amtUnit = amtUnit;
	}
	public Integer getGamePlayerCnt() {
		return gamePlayerCnt;
	}
	public void setGamePlayerCnt(Integer gamePlayerCnt) {
		this.gamePlayerCnt = gamePlayerCnt;
	}
	public Integer getGameRoundCnt() {
		return gameRoundCnt;
	}
	public void setGameRoundCnt(Integer gameRoundCnt) {
		this.gameRoundCnt = gameRoundCnt;
	}
	public String getIsGamefeeBundle() {
		return isGamefeeBundle;
	}
	public void setIsGamefeeBundle(String isGamefeeBundle) {
		this.isGamefeeBundle = isGamefeeBundle;
	}
	@Override
	public String toString() {
		return "SkMstDTO [gameId=" + gameId + ", seriseId=" + seriseId + ", tourId=" + tourId + ", seasonId=" + seasonId
				+ ", gameType=" + gameType + ", gameName=" + gameName + ", enName=" + enName + ", apcYear=" + apcYear
				+ ", seriseDegree=" + seriseDegree + ", seriseYearcnt=" + seriseYearcnt + ", gameOfcrecordType="
				+ gameOfcrecordType + ", gameOpenDate=" + gameOpenDate + ", gameCloseDate=" + gameCloseDate
				+ ", regOpenDate=" + regOpenDate + ", regCloseDate=" + regCloseDate + ", regOpenTime=" + regOpenTime
				+ ", regCloseTime=" + regCloseTime + ", gamePrize=" + gamePrize + ", amtUnit=" + amtUnit
				+ ", gamePlayerCnt=" + gamePlayerCnt + ", gameRoundCnt=" + gameRoundCnt + ", isGamefeeBundle="
				+ isGamefeeBundle + "]";
	}
	
	
}
