package com.aircode.dtv.golf.plusbar.core.vo;

public class GameVO {

	private String gameId;
	private String gameName;
	private String courseId;
	
	public String getGameId() {
		return gameId;
	}
	public void setGameId(String gameId) {
		this.gameId = gameId;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	@Override
	public String toString() {
		return "GameVO [gameId=" + gameId + ", gameName=" + gameName + ", courseId=" + courseId + "]";
	}
	
	
}
