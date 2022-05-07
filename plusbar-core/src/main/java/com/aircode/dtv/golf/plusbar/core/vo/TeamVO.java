package com.aircode.dtv.golf.plusbar.core.vo;

public class TeamVO {

	private String teamId;
	private String gameId;
	private Integer roundIdx;
	private Integer teamOrder;
	@Override
	public String toString() {
		return "TeamVO [teamId=" + teamId + ", gameId=" + gameId + ", roundIdx=" + roundIdx + ", teamOrder=" + teamOrder
				+ "]";
	}
	public String getTeamId() {
		return teamId;
	}
	public String getGameId() {
		return gameId;
	}
	public Integer getRoundIdx() {
		return roundIdx;
	}
	public Integer getTeamOrder() {
		return teamOrder;
	}
	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}
	public void setGameId(String gameId) {
		this.gameId = gameId;
	}
	public void setRoundIdx(Integer roundIdx) {
		this.roundIdx = roundIdx;
	}
	public void setTeamOrder(Integer teamOrder) {
		this.teamOrder = teamOrder;
	}
	
	
	
}
