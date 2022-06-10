package com.aircode.dtv.golf.plusbar.core.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.aircode.dtv.golf.plusbar.core.vo.GameVO;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.halowing.util.StringUtility;
import com.halowing.util.TimeUtility;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.USE_DEFAULTS)
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class GameDTO extends GameVO implements Serializable {

	private static final long serialVersionUID = 3937496993425389927L;

	public GameDTO() {}
	
	public GameDTO(GameVO vo) {
		setAmtUnit(vo.getAmtUnit());
		setGameId(vo.getGameId());
		setGameName(vo.getGameName());
		setGamePlayerCnt(vo.getGamePlayerCnt());
		setGamePrize(vo.getGamePrize());
		setGameRoundCnt(vo.getGameRoundCnt());
		setSeriesId(vo.getSeriesId());
		
		if(StringUtility.isBlank(vo.getGameCloseDate()))
			setGameCloseDate(null);
		else 
			setGameCloseDate(LocalDate.parse(vo.getGameCloseDate(),TimeUtility.DB_DATE_FORMATTER).format(TimeUtility.JSON_DATE_FORMATTER)  );
		
		if(StringUtility.isBlank(vo.getGameOpenDate()))
			setGameOpenDate(null);
		else 
			setGameOpenDate(LocalDate.parse(vo.getGameOpenDate(),TimeUtility.DB_DATE_FORMATTER).format(TimeUtility.JSON_DATE_FORMATTER)  );
		
	}
}
