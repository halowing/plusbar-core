package com.aircode.dtv.golf.plusbar.core.vo;

import java.time.LocalDateTime;

import com.aircode.dtv.golf.plusbar.core.code.VideoResolution;

public class VodInfoVO {

	
	private String vodId;
	private String gameId;
	private String playerId;
	private Integer roundIdx;
	private LocalDateTime produceDatetime;
	private String cdnId;
	private String playUri;
	private String playerName;
	private String title;
	private String description;
	private String posterUri;
	private VideoResolution resolution;
	private Long playTime;
	private LocalDateTime registDatetime;
	private Boolean isRoundHighlight;
	private Boolean hasAd;
	
	@Override
	public String toString() {
		return "VodInfoVO [vodId=" + vodId + ", gameId=" + gameId + ", playerId=" + playerId + ", roundIdx=" + roundIdx
				+ ", produceDatetime=" + produceDatetime + ", cdnId=" + cdnId + ", playUri=" + playUri + ", playerName="
				+ playerName + ", title=" + title + ", description=" + description + ", posterUri=" + posterUri
				+ ", resolution=" + resolution + ", playTime=" + playTime + ", registDatetime=" + registDatetime
				+ ", isRoundHighlight=" + isRoundHighlight + ", hasAd=" + hasAd + "]";
	}

	public String getVodId() {
		return vodId;
	}

	public void setVodId(String vodId) {
		this.vodId = vodId;
	}

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

	public Integer getRoundIdx() {
		return roundIdx;
	}

	public void setRoundIdx(Integer roundIdx) {
		this.roundIdx = roundIdx;
	}

	public LocalDateTime getProduceDatetime() {
		return produceDatetime;
	}

	public void setProduceDatetime(LocalDateTime produceDatetime) {
		this.produceDatetime = produceDatetime;
	}

	public String getCdnId() {
		return cdnId;
	}

	public void setCdnId(String cdnId) {
		this.cdnId = cdnId;
	}

	public String getPlayUri() {
		return playUri;
	}

	public void setPlayUri(String playUri) {
		this.playUri = playUri;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPosterUri() {
		return posterUri;
	}

	public void setPosterUri(String posterUri) {
		this.posterUri = posterUri;
	}

	public VideoResolution getResolution() {
		return resolution;
	}

	public void setResolution(VideoResolution resolution) {
		this.resolution = resolution;
	}

	public Long getPlayTime() {
		return playTime;
	}

	public void setPlayTime(Long playTime) {
		this.playTime = playTime;
	}

	public LocalDateTime getRegistDatetime() {
		return registDatetime;
	}

	public void setRegistDatetime(LocalDateTime registDatetime) {
		this.registDatetime = registDatetime;
	}

	public Boolean getIsRoundHighlight() {
		return isRoundHighlight;
	}

	public void setIsRoundHighlight(Boolean isRoundHighlight) {
		this.isRoundHighlight = isRoundHighlight;
	}

	public Boolean getHasAd() {
		return hasAd;
	}

	public void setHasAd(Boolean hasAd) {
		this.hasAd = hasAd;
	}
	
	
}
