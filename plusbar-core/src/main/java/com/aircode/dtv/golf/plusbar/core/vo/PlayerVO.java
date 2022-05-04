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
	@Override
	public String toString() {
		return "PlayerVO [gameId=" + gameId + ", playerId=" + playerId + ", playerName=" + playerName
				+ ", playerEnglishName=" + playerEnglishName + ", playerImageUrl=" + playerImageUrl + "]";
	}

	
}
