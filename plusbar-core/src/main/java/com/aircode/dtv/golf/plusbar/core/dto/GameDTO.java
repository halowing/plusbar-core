package com.aircode.dtv.golf.plusbar.core.dto;

import java.io.Serializable;

import com.aircode.dtv.golf.plusbar.core.vo.GameVO;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.USE_DEFAULTS)
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class GameDTO extends GameVO implements Serializable {

	private static final long serialVersionUID = 3937496993425389927L;

	public GameDTO() {}
	
	public GameDTO(GameVO vo) {
		setAmtUnit(vo.getAmtUnit());
		setGameCloseDate(vo.getGameCloseDate());
		setGameId(vo.getGameId());
		setGameName(vo.getGameName());
		setGameOpenDate(vo.getGameOpenDate());
		setGamePlayerCnt(vo.getGamePlayerCnt());
		setGamePrize(vo.getGamePrize());
		setGameRoundCnt(vo.getGameRoundCnt());
		setSeriesId(vo.getSeriesId());
	}
}
