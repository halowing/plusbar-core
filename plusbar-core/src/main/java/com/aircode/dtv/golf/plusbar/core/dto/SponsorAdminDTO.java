package com.aircode.dtv.golf.plusbar.core.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

import com.aircode.dtv.golf.plusbar.core.vo.SponsorVO;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.USE_DEFAULTS)
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class SponsorAdminDTO extends SponsorVO implements Serializable {

	private static final long serialVersionUID = 5536109976148563035L;
	
	public SponsorAdminDTO() {}
	
	public SponsorAdminDTO(SponsorVO vo) {
		this.setCdnId(vo.getCdnId());
		this.setGameId(vo.getGameId());
		this.setPlayUri(vo.getPlayUri());
		this.setSponsorId(vo.getSponsorId());
		this.setSponsorName(vo.getSponsorName());
		this.setThumbnailUrl(vo.getThumbnailUrl());
		this.setViewOrder(vo.getViewOrder());
	}
	
	@NotBlank
	private String  gameId 		;	
	
	@NotBlank
	private String  sponsorId		;

	@Override
	public String toString() {
		return "SponsorAdminDTO [gameId=" + gameId + ", sponsorId=" + sponsorId + ", toString()=" + super.toString()
				+ "]";
	}

	public String getGameId() {
		return gameId;
	}

	public String getSponsorId() {
		return sponsorId;
	}

	public void setGameId(String gameId) {
		this.gameId = gameId;
	}

	public void setSponsorId(String sponsorId) {
		this.sponsorId = sponsorId;
	}
	
	

}
