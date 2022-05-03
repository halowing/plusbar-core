package com.aircode.dtv.golf.plusbar.core.kpga.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(value = PropertyNamingStrategies.LowerCamelCaseStrategy.class)
public class GenesisGradeDTO implements Serializable {
	
	private static final long serialVersionUID = 3364982529095418886L;
	private GenesisDataDTO genesisPoint;
	private GenesisDataDTO genesisPrize;
	private GenesisDataDTO genesisBattingAvg;
	
	public GenesisDataDTO getGenesisPoint() {
		return genesisPoint;
	}

	public void setGenesisPoint(GenesisDataDTO genesisPoint) {
		this.genesisPoint = genesisPoint;
	}

	public GenesisDataDTO getGenesisPrize() {
		return genesisPrize;
	}

	public void setGenesisPrize(GenesisDataDTO genesisPrize) {
		this.genesisPrize = genesisPrize;
	}

	public GenesisDataDTO getGenesisBattingAvg() {
		return genesisBattingAvg;
	}

	public void setGenesisBattingAvg(GenesisDataDTO genesisBattingAvg) {
		this.genesisBattingAvg = genesisBattingAvg;
	}
	
	@Override
	public String toString() {
		return "GenesisGradeDTO [genesisPoint=" + genesisPoint + ", genesisPrize=" + genesisPrize
				+ ", genesisBattingAvg=" + genesisBattingAvg + "]";
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	@JsonNaming(value = PropertyNamingStrategies.LowerCamelCaseStrategy.class)
	public static class GenesisDataDTO implements Serializable{
		
		private static final long serialVersionUID = -1263246886151312064L;
		
		private String tourId;
		private Float point;
		private Long amt;
		private Integer rank;
		
		public String getTourId() {
			return tourId;
		}
		public void setTourId(String tourId) {
			this.tourId = tourId;
		}
		public Float getPoint() {
			return point;
		}
		public void setPoint(Float point) {
			this.point = point;
		}
		public Long getAmt() {
			return amt;
		}
		public void setAmt(Long amt) {
			this.amt = amt;
		}
		public Integer getRank() {
			return rank;
		}
		public void setRank(Integer rank) {
			this.rank = rank;
		}
		@Override
		public String toString() {
			return "GenesisDataDTO [tourId=" + tourId + ", point=" + point + ", amt=" + amt + ", rank=" + rank + "]";
		}
		
		
	}
}
