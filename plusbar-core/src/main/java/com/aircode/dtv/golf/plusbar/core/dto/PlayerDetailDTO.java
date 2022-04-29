package com.aircode.dtv.golf.plusbar.core.dto;

import java.util.List;

import com.aircode.dtv.golf.plusbar.core.dto.PlayerDetailDTO.genesisRecordDTO.CareerDTO;

public class PlayerDetailDTO extends PlayerDTO {
	
	private static final long serialVersionUID = -8615940689406589846L;
	
	private String playerId;   // "",
	private String playerName;   // "",
	private String playerEnglishName;   // "",
	private String playerImageUrl;   // "",
	private String bitrhDate;   // "",
	private String firstDebut;   // "",
	private String tourDebut;   // "",
	private String koreanTourDebut;   // "",
	private String contract;   // "",
	private String affiliatedTeam;   // "",
	
	private PerformanceDTO performance;
	private genesisRecordDTO genesisRecord;
	private List<CareerDTO> careerList;
	
	public String getPlayerId() {
		return playerId;
	}

	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getPlayerEnglishName() {
		return playerEnglishName;
	}

	public void setPlayerEnglishName(String playerEnglishName) {
		this.playerEnglishName = playerEnglishName;
	}

	public String getPlayerImageUrl() {
		return playerImageUrl;
	}

	public void setPlayerImageUrl(String playerImageUrl) {
		this.playerImageUrl = playerImageUrl;
	}

	public String getBitrhDate() {
		return bitrhDate;
	}

	public void setBitrhDate(String bitrhDate) {
		this.bitrhDate = bitrhDate;
	}

	public String getFirstDebut() {
		return firstDebut;
	}

	public void setFirstDebut(String firstDebut) {
		this.firstDebut = firstDebut;
	}

	public String getTourDebut() {
		return tourDebut;
	}

	public void setTourDebut(String tourDebut) {
		this.tourDebut = tourDebut;
	}

	public String getKoreanTourDebut() {
		return koreanTourDebut;
	}

	public void setKoreanTourDebut(String koreanTourDebut) {
		this.koreanTourDebut = koreanTourDebut;
	}

	public String getContract() {
		return contract;
	}

	public void setContract(String contract) {
		this.contract = contract;
	}

	public String getAffiliatedTeam() {
		return affiliatedTeam;
	}

	public void setAffiliatedTeam(String affiliatedTeam) {
		this.affiliatedTeam = affiliatedTeam;
	}
	
	@Override
	public String toString() {
		return "PlayerDetailDTO [playerId=" + playerId + ", playerName=" + playerName + ", playerEnglishName="
				+ playerEnglishName + ", playerImageUrl=" + playerImageUrl + ", bitrhDate=" + bitrhDate
				+ ", firstDebut=" + firstDebut + ", tourDebut=" + tourDebut + ", koreanTourDebut=" + koreanTourDebut
				+ ", contract=" + contract + ", affiliatedTeam=" + affiliatedTeam + ", performance=" + performance
				+ ", genesisRecord=" + genesisRecord + ", careerList=" + careerList + "]";
	}

	public PerformanceDTO getPerformance() {
		return performance;
	}

	public void setPerformance(PerformanceDTO performance) {
		this.performance = performance;
	}

	public genesisRecordDTO getGenesisRecord() {
		return genesisRecord;
	}

	public void setGenesisRecord(genesisRecordDTO genesisRecord) {
		this.genesisRecord = genesisRecord;
	}

	public List<CareerDTO> getCareerList() {
		return careerList;
	}

	public void setCareerList(List<CareerDTO> careerList) {
		this.careerList = careerList;
	}





	public static class PerformanceDTO {
		private String scoreAvg;   
		private String birdieAvg;   
		private String putAvg;   
		private String driveDistance;   
		private String fairwayLandingRate;   
		private String greenHitRate;
		
		public String getScoreAvg() {
			return scoreAvg;
		}
		public void setScoreAvg(String scoreAvg) {
			this.scoreAvg = scoreAvg;
		}
		public String getBirdieAvg() {
			return birdieAvg;
		}
		public void setBirdieAvg(String birdieAvg) {
			this.birdieAvg = birdieAvg;
		}
		public String getPutAvg() {
			return putAvg;
		}
		public void setPutAvg(String putAvg) {
			this.putAvg = putAvg;
		}
		public String getDriveDistance() {
			return driveDistance;
		}
		public void setDriveDistance(String driveDistance) {
			this.driveDistance = driveDistance;
		}
		public String getFairwayLandingRate() {
			return fairwayLandingRate;
		}
		public void setFairwayLandingRate(String fairwayLandingRate) {
			this.fairwayLandingRate = fairwayLandingRate;
		}
		public String getGreenHitRate() {
			return greenHitRate;
		}
		public void setGreenHitRate(String greenHitRate) {
			this.greenHitRate = greenHitRate;
		}
		@Override
		public String toString() {
			return "Performance [scoreAvg=" + scoreAvg + ", birdieAvg=" + birdieAvg + ", putAvg=" + putAvg
					+ ", driveDistance=" + driveDistance + ", fairwayLandingRate=" + fairwayLandingRate
					+ ", greenHitRate=" + greenHitRate + "]";
		} 
	}
	
	public static class genesisRecordDTO {
		
		private Integer point; 
		private Integer pointOrder; 
		private Long prizeMoney; 
		private Integer prizeMoneyOrder;
		
		public Integer getPoint() {
			return point;
		}
		public void setPoint(Integer point) {
			this.point = point;
		}
		public Integer getPointOrder() {
			return pointOrder;
		}
		public void setPointOrder(Integer pointOrder) {
			this.pointOrder = pointOrder;
		}
		public Long getPrizeMoney() {
			return prizeMoney;
		}
		public void setPrizeMoney(Long prizeMoney) {
			this.prizeMoney = prizeMoney;
		}
		public Integer getPrizeMoneyOrder() {
			return prizeMoneyOrder;
		}
		public void setPrizeMoneyOrder(Integer prizeMoneyOrder) {
			this.prizeMoneyOrder = prizeMoneyOrder;
		}
		@Override
		public String toString() {
			return "genesisRecord [point=" + point + ", pointOrder=" + pointOrder + ", prizeMoney=" + prizeMoney
					+ ", prizeMoneyOrder=" + prizeMoneyOrder + "]";
		}
		
		public static class CareerDTO {
			private String careerTitle;
			private List<String> contentList;
			public String getCareerTitle() {
				return careerTitle;
			}
			public void setCareerTitle(String careerTitle) {
				this.careerTitle = careerTitle;
			}
			public List<String> getContentList() {
				return contentList;
			}
			public void setContentList(List<String> contentList) {
				this.contentList = contentList;
			}
			@Override
			public String toString() {
				return "CareerDTO [careerTitle=" + careerTitle + ", contentList=" + contentList + "]";
			}
		}
	}

}
