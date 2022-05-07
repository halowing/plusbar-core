package com.aircode.dtv.golf.plusbar.core.vo;

public class RankingVO {

	private String gameId;
	private String playerId;
	
	private Integer roundIdx;
	private Integer rankingOrder;
	private String ranking;
	private String holeIdx;
	private String todayScore;
	private String totalScore;
	
	
	
	@Override
	public String toString() {
		return "RankingVO [gameId=" + gameId + ", playerId=" + playerId + ", roundIdx=" + roundIdx + ", rankingOrder="
				+ rankingOrder + ", ranking=" + ranking + ", holeIdx=" + holeIdx + ", todayScore=" + todayScore
				+ ", totalScore=" + totalScore + "]";
	}
	
	/**
	 * @return the gameId
	 */
	public String getGameId() {
		return gameId;
	}
	/**
	 * @return the roundIdx
	 */
	public Integer getRoundIdx() {
		return roundIdx;
	}
	/**
	 * @param roundIdx the roundIdx to set
	 */
	public void setRoundIdx(Integer roundIdx) {
		this.roundIdx = roundIdx;
	}
	/**
	 * @return the playerId
	 */
	public String getPlayerId() {
		return playerId;
	}
	/**
	 * @return the ranking_order
	 */
	public Integer getRankingOrder() {
		return rankingOrder;
	}
	/**
	 * @return the ranking
	 */
	public String getRanking() {
		return ranking;
	}
	/**
	 * @return the holeIdx
	 */
	public String getHoleIdx() {
		return holeIdx;
	}
	/**
	 * @return the todayScore
	 */
	public String getTodayScore() {
		return todayScore;
	}
	/**
	 * @return the totalScore
	 */
	public String getTotalScore() {
		return totalScore;
	}
	/**
	 * @param gameId the gameId to set
	 */
	public void setGameId(String gameId) {
		this.gameId = gameId;
	}
	/**
	 * @param playerId the playerId to set
	 */
	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}
	/**
	 * @param ranking_order the ranking_order to set
	 */
	public void setRankingOrder(Integer rankingOrder) {
		this.rankingOrder = rankingOrder;
	}
	/**
	 * @param ranking the ranking to set
	 */
	public void setRanking(String ranking) {
		this.ranking = ranking;
	}
	/**
	 * @param holeIdx the holeIdx to set
	 */
	public void setHoleIdx(String holeIdx) {
		this.holeIdx = holeIdx;
	}
	/**
	 * @param todayScore the todayScore to set
	 */
	public void setTodayScore(String todayScore) {
		this.todayScore = todayScore;
	}
	/**
	 * @param totalScore the totalScore to set
	 */
	public void setTotalScore(String totalScore) {
		this.totalScore = totalScore;
	}
	
	
}
