package com.aircode.dtv.golf.plusbar.core.kpga.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(value = PropertyNamingStrategies.LowerCamelCaseStrategy.class)
public class ChartDTO implements Serializable {

	private static final long serialVersionUID = 894564343997676175L;
	
	private String fairway;   // "73.2143",
	private String fairwayRankRate;   // "3",
	private String fairwayRank;   // "57",
	private String green;   // "73.611",
	private String greenRankRate;   // "4",
	private String greenRank;   // "64",
	private String avgPutting;   // "1.717",
	private String avgPuttingRankRate;   // "1",
	private String avgPuttingRank;   // "7",
	private String driveDistance;   // "271.4392",
	private String driveDistanceRankRate;   // "5",
	private String driveDistanceRank;   // "100",
	private String avgStroke;   // "70",
	private String avgStrokeRankRate;   // "1",
	private String avgStrokeRank;   // "10",
	private String avgRecovery;   // "47.3684",
	private String avgRecoveryRankRate;   // "3",
	private String avgRecoveryRank;   // "51",
	private String topTenFinish;   // "1",
	private String topTenFinishRankRate;   // "1",
	private String topTenFinishRank;   // "1",
	private String birdy;   // "18",
	private String birdyRankRate;   // "1",
	private String birdyRank;   // "5",
	private String avgBirdy;   // "4.5",
	private String avgBirdyRankRate;   // "1",
	private String avgBirdyRank;   // "7"
	
	
	public String getFairway() {
		return fairway;
	}
	public void setFairway(String fairway) {
		this.fairway = fairway;
	}
	public String getFairwayRankRate() {
		return fairwayRankRate;
	}
	public void setFairwayRankRate(String fairwayRankRate) {
		this.fairwayRankRate = fairwayRankRate;
	}
	public String getFairwayRank() {
		return fairwayRank;
	}
	public void setFairwayRank(String fairwayRank) {
		this.fairwayRank = fairwayRank;
	}
	public String getGreen() {
		return green;
	}
	public void setGreen(String green) {
		this.green = green;
	}
	public String getGreenRankRate() {
		return greenRankRate;
	}
	public void setGreenRankRate(String greenRankRate) {
		this.greenRankRate = greenRankRate;
	}
	public String getGreenRank() {
		return greenRank;
	}
	public void setGreenRank(String greenRank) {
		this.greenRank = greenRank;
	}
	public String getAvgPutting() {
		return avgPutting;
	}
	public void setAvgPutting(String avgPutting) {
		this.avgPutting = avgPutting;
	}
	public String getAvgPuttingRankRate() {
		return avgPuttingRankRate;
	}
	public void setAvgPuttingRankRate(String avgPuttingRankRate) {
		this.avgPuttingRankRate = avgPuttingRankRate;
	}
	public String getAvgPuttingRank() {
		return avgPuttingRank;
	}
	public void setAvgPuttingRank(String avgPuttingRank) {
		this.avgPuttingRank = avgPuttingRank;
	}
	public String getDriveDistance() {
		return driveDistance;
	}
	public void setDriveDistance(String driveDistance) {
		this.driveDistance = driveDistance;
	}
	public String getDriveDistanceRankRate() {
		return driveDistanceRankRate;
	}
	public void setDriveDistanceRankRate(String driveDistanceRankRate) {
		this.driveDistanceRankRate = driveDistanceRankRate;
	}
	public String getDriveDistanceRank() {
		return driveDistanceRank;
	}
	public void setDriveDistanceRank(String driveDistanceRank) {
		this.driveDistanceRank = driveDistanceRank;
	}
	public String getAvgStroke() {
		return avgStroke;
	}
	public void setAvgStroke(String avgStroke) {
		this.avgStroke = avgStroke;
	}
	public String getAvgStrokeRankRate() {
		return avgStrokeRankRate;
	}
	public void setAvgStrokeRankRate(String avgStrokeRankRate) {
		this.avgStrokeRankRate = avgStrokeRankRate;
	}
	public String getAvgStrokeRank() {
		return avgStrokeRank;
	}
	public void setAvgStrokeRank(String avgStrokeRank) {
		this.avgStrokeRank = avgStrokeRank;
	}
	public String getAvgRecovery() {
		return avgRecovery;
	}
	public void setAvgRecovery(String avgRecovery) {
		this.avgRecovery = avgRecovery;
	}
	public String getAvgRecoveryRankRate() {
		return avgRecoveryRankRate;
	}
	public void setAvgRecoveryRankRate(String avgRecoveryRankRate) {
		this.avgRecoveryRankRate = avgRecoveryRankRate;
	}
	public String getAvgRecoveryRank() {
		return avgRecoveryRank;
	}
	public void setAvgRecoveryRank(String avgRecoveryRank) {
		this.avgRecoveryRank = avgRecoveryRank;
	}
	public String getTopTenFinish() {
		return topTenFinish;
	}
	public void setTopTenFinish(String topTenFinish) {
		this.topTenFinish = topTenFinish;
	}
	public String getTopTenFinishRankRate() {
		return topTenFinishRankRate;
	}
	public void setTopTenFinishRankRate(String topTenFinishRankRate) {
		this.topTenFinishRankRate = topTenFinishRankRate;
	}
	public String getTopTenFinishRank() {
		return topTenFinishRank;
	}
	public void setTopTenFinishRank(String topTenFinishRank) {
		this.topTenFinishRank = topTenFinishRank;
	}
	public String getBirdy() {
		return birdy;
	}
	public void setBirdy(String birdy) {
		this.birdy = birdy;
	}
	public String getBirdyRankRate() {
		return birdyRankRate;
	}
	public void setBirdyRankRate(String birdyRankRate) {
		this.birdyRankRate = birdyRankRate;
	}
	public String getBirdyRank() {
		return birdyRank;
	}
	public void setBirdyRank(String birdyRank) {
		this.birdyRank = birdyRank;
	}
	public String getAvgBirdy() {
		return avgBirdy;
	}
	public void setAvgBirdy(String avgBirdy) {
		this.avgBirdy = avgBirdy;
	}
	public String getAvgBirdyRankRate() {
		return avgBirdyRankRate;
	}
	public void setAvgBirdyRankRate(String avgBirdyRankRate) {
		this.avgBirdyRankRate = avgBirdyRankRate;
	}
	public String getAvgBirdyRank() {
		return avgBirdyRank;
	}
	public void setAvgBirdyRank(String avgBirdyRank) {
		this.avgBirdyRank = avgBirdyRank;
	}
	@Override
	public String toString() {
		return "ChartDTO [fairway=" + fairway + ", fairwayRankRate=" + fairwayRankRate + ", fairwayRank=" + fairwayRank
				+ ", green=" + green + ", greenRankRate=" + greenRankRate + ", greenRank=" + greenRank + ", avgPutting="
				+ avgPutting + ", avgPuttingRankRate=" + avgPuttingRankRate + ", avgPuttingRank=" + avgPuttingRank
				+ ", driveDistance=" + driveDistance + ", driveDistanceRankRate=" + driveDistanceRankRate
				+ ", driveDistanceRank=" + driveDistanceRank + ", avgStroke=" + avgStroke + ", avgStrokeRankRate="
				+ avgStrokeRankRate + ", avgStrokeRank=" + avgStrokeRank + ", avgRecovery=" + avgRecovery
				+ ", avgRecoveryRankRate=" + avgRecoveryRankRate + ", avgRecoveryRank=" + avgRecoveryRank
				+ ", topTenFinish=" + topTenFinish + ", topTenFinishRankRate=" + topTenFinishRankRate
				+ ", topTenFinishRank=" + topTenFinishRank + ", birdy=" + birdy + ", birdyRankRate=" + birdyRankRate
				+ ", birdyRank=" + birdyRank + ", avgBirdy=" + avgBirdy + ", avgBirdyRankRate=" + avgBirdyRankRate
				+ ", avgBirdyRank=" + avgBirdyRank + "]";
	}
	
	
}
