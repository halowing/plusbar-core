package com.aircode.dtv.golf.plusbar.core.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import com.aircode.dtv.golf.plusbar.core.code.VideoResolution;
import com.aircode.dtv.golf.plusbar.core.vo.VodInfoVO;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.USE_DEFAULTS)
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class VodInfoDTO implements Serializable {

	private static final long serialVersionUID = -7855570639626855914L;
	
	private String vodId;
	
	@NotBlank
	private String gameId;
	
	@NotBlank
	private String playerId;
	
	@Min(value = 1)
	private Integer roundIdx;
	
	@NotNull
	@Past
	private LocalDateTime produceDatetime;
	
	private LocalDateTime registDatetime;
	
	@NotBlank
	private String cdnId;
	
	@NotBlank
	private String playUri;
	
	private String playerName;
	private String title;
	private String description;
	private String posterUri;
	private VideoResolution resolution;
	private Long playTime;
	
	@NotNull
	private Boolean isRoundHighlight;
	
	@NotNull
	private Boolean hasAd;
	
	
	public VodInfoDTO() {}
	
	public VodInfoDTO(VodInfoVO vo) {
		
		this.cdnId 			= vo.getCdnId();
		this.description 	= vo.getDescription();
		this.gameId			= vo.getGameId();
		this.hasAd			= vo.getHasAd();
		this.isRoundHighlight	= vo.getIsRoundHighlight();
		this.playerId			= vo.getPlayerId();
		this.playerName			= vo.getPlayerName();
		this.playTime			= vo.getPlayTime();
		this.playUri			= vo.getPlayUri();
		this.posterUri			= vo.getPosterUri();
		this.produceDatetime	= vo.getProduceDatetime();
		this.registDatetime		= vo.getRegistDatetime();
		this.resolution			= vo.getResolution();
		this.roundIdx			= vo.getRoundIdx();
		this.title				= vo.getTitle();
		this.vodId				= vo.getVodId();
		
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

	@Override
	public String toString() {
		return "VodInfoDTO [vodId=" + vodId + ", gameId=" + gameId + ", playerId=" + playerId + ", roundIdx=" + roundIdx
				+ ", produceDatetime=" + produceDatetime + ", registDatetime=" + registDatetime + ", cdnId=" + cdnId
				+ ", playUri=" + playUri + ", playerName=" + playerName + ", title=" + title + ", description="
				+ description + ", posterUri=" + posterUri + ", resolution=" + resolution + ", playTime=" + playTime
				+ ", isRoundHighlight=" + isRoundHighlight + ", hasAd=" + hasAd + "]";
	}

	public LocalDateTime getRegistDatetime() {
		return registDatetime;
	}

	public void setRegistDatetime(LocalDateTime registDatetime) {
		this.registDatetime = registDatetime;
	}

	
	
}
