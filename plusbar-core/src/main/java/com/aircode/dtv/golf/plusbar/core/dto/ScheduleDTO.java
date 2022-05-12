package com.aircode.dtv.golf.plusbar.core.dto;

import java.io.Serializable;

import com.aircode.dtv.golf.plusbar.core.vo.ScheduleVO;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.USE_DEFAULTS)
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ScheduleDTO extends ScheduleVO implements Serializable {

	private static final long serialVersionUID = 7101019338426826882L;
	
	public ScheduleDTO () {}

	public ScheduleDTO (ScheduleVO vo) {
		this.setChannelId(vo.getChannelId());
		this.setDayIdx(vo.getDayIdx());
		this.setEndDatetime(vo.getEndDatetime());
		this.setGameId(vo.getGameId());
		this.setOnAirDate(vo.getOnAirDate());
		this.setRegistDatetime(vo.getRegistDatetime());
		this.setRoundIdx(vo.getRoundIdx());
		this.setScheduleId(vo.getScheduleId());
		this.setStartDatetime(vo.getStartDatetime());
	}
}
