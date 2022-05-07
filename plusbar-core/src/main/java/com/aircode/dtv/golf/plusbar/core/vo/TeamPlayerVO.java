package com.aircode.dtv.golf.plusbar.core.vo;

public class TeamPlayerVO {
	private String teamId;
	private String playerId;
	
	@Override
	public String toString() {
		return "TeamPlayerVO [teamId=" + teamId + ", playerId=" + playerId + "]";
	}
	public String getTeamId() {
		return teamId;
	}
	public String getPlayerId() {
		return playerId;
	}
	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}
	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}
	
}
