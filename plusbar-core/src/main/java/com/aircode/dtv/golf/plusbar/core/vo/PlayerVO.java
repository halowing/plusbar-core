package com.aircode.dtv.golf.plusbar.core.vo;

/**
 * TB_Player
 * 
 * @author "sgkim@aircode.com"
 *
 */
public class PlayerVO {
	
	private String gameId;
	private String playerId;
	private String playerName;
	private String playerEnglishName;   // "",
	private String playerImageUrl;   // "",
	private String bitrhDate;   // "",
	private String firstDebut;   // 최초 입회,
	private String tourDebut;   // 투어프로 입회,
	private String koreanTourDebut;   // 코리안투어 데뷔,
	private String contract;   // "",
	private String affiliatedTeam;   // "",
	
	
	public String getGameId() {
		return gameId;
	}
	public void setGameId(String gameId) {
		this.gameId = gameId;
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
	public String getPlayerEnglishName() {
		return playerEnglishName;
	}
	public void setPlayerEnglishName(String playerEnglishName) {
		this.playerEnglishName = playerEnglishName;
	}
	public String getPlayerImageUrl() {
		return playerImageUrl;
	}
	public void setPlayerImageUrl(String playerImageUrl) {
		this.playerImageUrl = playerImageUrl;
	}
	public String getBitrhDate() {
		return bitrhDate;
	}
	public void setBitrhDate(String bitrhDate) {
		this.bitrhDate = bitrhDate;
	}
	public String getFirstDebut() {
		return firstDebut;
	}
	public void setFirstDebut(String firstDebut) {
		this.firstDebut = firstDebut;
	}
	public String getTourDebut() {
		return tourDebut;
	}
	public void setTourDebut(String tourDebut) {
		this.tourDebut = tourDebut;
	}
	public String getKoreanTourDebut() {
		return koreanTourDebut;
	}
	public void setKoreanTourDebut(String koreanTourDebut) {
		this.koreanTourDebut = koreanTourDebut;
	}
	public String getContract() {
		return contract;
	}
	public void setContract(String contract) {
		this.contract = contract;
	}
	public String getAffiliatedTeam() {
		return affiliatedTeam;
	}
	public void setAffiliatedTeam(String affiliatedTeam) {
		this.affiliatedTeam = affiliatedTeam;
	}
	@Override
	public String toString() {
		return "PlayerVO [gameId=" + gameId + ", playerId=" + playerId + ", playerName=" + playerName
				+ ", playerEnglishName=" + playerEnglishName + ", playerImageUrl=" + playerImageUrl + ", bitrhDate="
				+ bitrhDate + ", firstDebut=" + firstDebut + ", tourDebut=" + tourDebut + ", koreanTourDebut="
				+ koreanTourDebut + ", contract=" + contract + ", affiliatedTeam=" + affiliatedTeam + "]";
	}
	
}
