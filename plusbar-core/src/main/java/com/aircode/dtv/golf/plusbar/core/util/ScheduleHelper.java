package com.aircode.dtv.golf.plusbar.core.util;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.util.Assert;

import com.aircode.dtv.golf.plusbar.core.dto.OnAirScheduleDTO;

public class ScheduleHelper {
	
	/**
	 * 
	 * 
	 * @param gameId
	 * @return
	 */
	public static OnAirScheduleDTO getCurrentRound(String gameId, List<OnAirScheduleDTO> scheduleList) {

		Assert.notEmpty(scheduleList, "scheduleList shuoud have some data.");
		
		OnAirScheduleDTO lastSchedule = null, nextSchedule = null;
		
		LocalDateTime now = LocalDateTime.now();
		
		for(int i=0 ;i < scheduleList.size();i++) {
			OnAirScheduleDTO dto = scheduleList.get(i);
			if(gameId != null && !gameId.equals(dto.getGameId()))
				continue;
			
			if(lastSchedule == null && nextSchedule == null) 
			{
				lastSchedule = nextSchedule = dto;
				continue;
			}
			
			if(dto.getStartDatetime().isBefore(now) && dto.getStartDatetime().isAfter(lastSchedule.getStartDatetime()))
			{
				lastSchedule = dto;
				if(dto.getStartDatetime().isAfter(nextSchedule.getStartDatetime()))
					nextSchedule = dto;
			}else if(dto.getStartDatetime().isAfter(now) && dto.getStartDatetime().isBefore(nextSchedule.getStartDatetime()))
			{
				nextSchedule = dto;
				if(dto.getStartDatetime().isBefore(lastSchedule.getStartDatetime()))
					lastSchedule = dto;
			}
		}
		
		if(lastSchedule == null)
			return null;
	
		if(lastSchedule.getStartDatetime().equals(nextSchedule.getStartDatetime()))
			return lastSchedule;
		else if(now.plusMinutes(1).isAfter(nextSchedule.getStartDatetime()))
			return nextSchedule;
		
		return lastSchedule;
	}

}
