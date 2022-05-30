package com.aircode.dtv.golf.plusbar.core.kpga.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 * 대회 스코어 관련
 * 
 * KPGA SK API 연동 규격 
 * 
 * @author "aircode"
 *
 */
@JsonNaming(value = PropertyNamingStrategies.LowerCamelCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class KpgaScoreDTO implements Serializable {

	private static final long serialVersionUID = 3116201584856006474L;
	
	private String  gameId            ;
	
	@JsonAlias(value = {"roundNo"})
	private Integer roundIdx;
	
	private String  rankNo            ;			// 랭킹 , 순위 
	private String  startInOut        ;			// IN/OUT
	private Integer rankUnderpar      ;			// 누적 토탈 타수 , -6
	private Integer udparSumTot       ;			// 라운드 토탈 스코어, -6
	
	@JsonAlias(value = {"memberId"})
	private String playerId;
	
	private Integer startTimeId       ;			// 선수 조 번호
	private String  playerName        ;
//	private Integer holePar1          ;			// 1홀 기준타 , 4
//	private Integer holePar2          ;
//	private Integer holePar3          ;
//	private Integer holePar4          ;
//	private Integer holePar5          ;
//	private Integer holePar6          ;
//	private Integer holePar7          ;
//	private Integer holePar8          ;
//	private Integer holePar9          ;
//	private Integer holePar10         ;
//	private Integer holePar11         ;
//	private Integer holePar12         ;
//	private Integer holePar13         ;
//	private Integer holePar14         ;
//	private Integer holePar15         ;
//	private Integer holePar16         ;
//	private Integer holePar17         ;
//	private Integer holePar18         ;
	
	@JsonAlias(value = {"score1"})
	private Integer hole1;
	
	@JsonAlias(value = {"score2"})
	private Integer hole2;
	
	@JsonAlias(value = {"score3"})
	private Integer hole3;
	
	@JsonAlias(value = {"score4"})
	private Integer hole4;
	
	@JsonAlias(value = {"score5"})
	private Integer hole5;
	
	@JsonAlias(value = {"score6"})
	private Integer hole6;
	
	@JsonAlias(value = {"score7"})
	private Integer hole7;
	
	@JsonAlias(value = {"score8"})
	private Integer hole8;
	
	@JsonAlias(value = {"score9"})
	private Integer hole9;
	
	@JsonAlias(value = {"score10"})
	private Integer hole10;
	
	@JsonAlias(value = {"score11"})
	private Integer hole11;
	
	@JsonAlias(value = {"score12"})
	private Integer hole12;
	
	@JsonAlias(value = {"score13"})
	private Integer hole13;
	
	@JsonAlias(value = {"score14"})
	private Integer hole14;
	
	@JsonAlias(value = {"score15"})
	private Integer hole15;
	
	@JsonAlias(value = {"score16"})
	private Integer hole16;
	
	@JsonAlias(value = {"score17"})
	private Integer hole17;
	
	@JsonAlias(value = {"score18"})
	private Integer hole18;
	
	@JsonAlias(value = {"udpar1"})    
	private Integer holeCode1;
	
	@JsonAlias(value = {"udpar2"})    
	private Integer holeCode2;
	
	@JsonAlias(value = {"udpar3"})    
	private Integer holeCode3;
	
	@JsonAlias(value = {"udpar4"})    
	private Integer holeCode4;
	
	@JsonAlias(value = {"udpar5"})    
	private Integer holeCode5;
	
	@JsonAlias(value = {"udpar6"})    
	private Integer holeCode6;
	
	@JsonAlias(value = {"udpar7"})    
	private Integer holeCode7;
	
	@JsonAlias(value = {"udpar8"})    
	private Integer holeCode8;
	
	@JsonAlias(value = {"udpar9"})    
	private Integer holeCode9;
	
	@JsonAlias(value = {"udpar10"})    
	private Integer holeCode10;
	
	@JsonAlias(value = {"udpar11"})    
	private Integer holeCode11;
	
	@JsonAlias(value = {"udpar12"})    
	private Integer holeCode12;
	
	@JsonAlias(value = {"udpar13"})    
	private Integer holeCode13;
	
	@JsonAlias(value = {"udpar14"})    
	private Integer holeCode14;
	
	@JsonAlias(value = {"udpar15"})    
	private Integer holeCode15;
	
	@JsonAlias(value = {"udpar16"})    
	private Integer holeCode16;
	
	@JsonAlias(value = {"udpar17"})    
	private Integer holeCode17;
	
	@JsonAlias(value = {"udpar18"})    
	private Integer holeCode18;
	
	
	
	private String roundEnd          ;			// 현재 종료홀 , F
	
	@JsonAlias(value = {"scoreSumTot"})    			
	private Integer totalScore        ;			// 라운드 토탈 타수, 3
	
	private Integer accuSumUnderpar   ;			// 누적 스코어    , -6
	private Integer accuSumScore      ;			// 누적 타수      , 65
	private Integer totalHoleCnt      ;			// 토탈홀카운트		, 18.0
	private Integer udparSum1         ;			// 1라운드 타수
	private Integer udparSum2         ;
	private Integer udparSum3         ;
	private Integer udparSum4         ;			// 0
	
	
	public Integer getOutScore() {
		
		
		return getSum(hole1 , hole2 , hole3 , hole4 , hole5 , hole6 , hole7 , hole8 , hole9) ;
	}
	
	public Integer getInScore() {
		
		return getSum(hole10, hole11, hole12, hole13, hole14, hole15, hole16, hole17, hole18);
		
	}
	
	private Integer getSum(Integer... arr ) {
		
		Integer sum = null;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == null) continue;
			
			if(sum == null) sum = arr[i];
			
			sum += arr[i];
		}
		
		return sum;
	}
	
	private Integer getHoleCode(Integer holeCode) {
		
		if(holeCode != null) {
			holeCode += 2;
			if(holeCode < 0) holeCode = 0;
			else if(holeCode > 4) holeCode = 4;
		}
		
		return holeCode;
	}

	@Override
	public String toString() {
		return "SkScoreDTO [gameId=" + gameId + ", roundIdx=" + roundIdx + ", rankNo=" + rankNo + ", startInOut="
				+ startInOut + ", rankUnderpar=" + rankUnderpar + ", udparSumTot=" + udparSumTot + ", playerId="
				+ playerId + ", startTimeId=" + startTimeId + ", playerName=" + playerName + ", hole1=" + hole1
				+ ", hole2=" + hole2 + ", hole3=" + hole3 + ", hole4=" + hole4 + ", hole5=" + hole5 + ", hole6=" + hole6
				+ ", hole7=" + hole7 + ", hole8=" + hole8 + ", hole9=" + hole9 + ", hole10=" + hole10 + ", hole11="
				+ hole11 + ", hole12=" + hole12 + ", hole13=" + hole13 + ", hole14=" + hole14 + ", hole15=" + hole15
				+ ", hole16=" + hole16 + ", hole17=" + hole17 + ", hole18=" + hole18 + ", holeCode1=" + holeCode1
				+ ", holeCode2=" + holeCode2 + ", holeCode3=" + holeCode3 + ", holeCode4=" + holeCode4 + ", holeCode5="
				+ holeCode5 + ", holeCode6=" + holeCode6 + ", holeCode7=" + holeCode7 + ", holeCode8=" + holeCode8
				+ ", holeCode9=" + holeCode9 + ", holeCode10=" + holeCode10 + ", holeCode11=" + holeCode11
				+ ", holeCode12=" + holeCode12 + ", holeCode13=" + holeCode13 + ", holeCode14=" + holeCode14
				+ ", holeCode15=" + holeCode15 + ", holeCode16=" + holeCode16 + ", holeCode17=" + holeCode17
				+ ", holeCode18=" + holeCode18 + ", roundEnd=" + roundEnd + ", totalScore=" + totalScore
				+ ", accuSumUnderpar=" + accuSumUnderpar + ", accuSumScore=" + accuSumScore + ", totalHoleCnt="
				+ totalHoleCnt + ", udparSum1=" + udparSum1 + ", udparSum2=" + udparSum2 + ", udparSum3=" + udparSum3
				+ ", udparSum4=" + udparSum4 + ", getOutScore()=" + getOutScore() + ", getInScore()=" + getInScore()
				+ "]";
	}

	/**
	 * @return the gameId
	 */
	public String getGameId() {
		return gameId;
	}

	/**
	 * @return the roundIdx
	 */
	public Integer getRoundIdx() {
		return roundIdx;
	}

	/**
	 * @return the rankNo
	 */
	public String getRankNo() {
		return rankNo;
	}

	/**
	 * @return the startInOut
	 */
	public String getStartInOut() {
		return startInOut;
	}

	/**
	 * @return the rankUnderpar
	 */
	public Integer getRankUnderpar() {
		return rankUnderpar;
	}

	/**
	 * @return the udparSumTot
	 */
	public Integer getUdparSumTot() {
		return udparSumTot;
	}

	/**
	 * @return the playerId
	 */
	public String getPlayerId() {
		return playerId;
	}

	/**
	 * @return the startTimeId
	 */
	public Integer getStartTimeId() {
		return startTimeId;
	}

	/**
	 * @return the playerName
	 */
	public String getPlayerName() {
		return playerName;
	}

	/**
	 * @return the hole1
	 */
	public Integer getHole1() {
		return hole1;
	}

	/**
	 * @return the hole2
	 */
	public Integer getHole2() {
		return hole2;
	}

	/**
	 * @return the hole3
	 */
	public Integer getHole3() {
		return hole3;
	}

	/**
	 * @return the hole4
	 */
	public Integer getHole4() {
		return hole4;
	}

	/**
	 * @return the hole5
	 */
	public Integer getHole5() {
		return hole5;
	}

	/**
	 * @return the hole6
	 */
	public Integer getHole6() {
		return hole6;
	}

	/**
	 * @return the hole7
	 */
	public Integer getHole7() {
		return hole7;
	}

	/**
	 * @return the hole8
	 */
	public Integer getHole8() {
		return hole8;
	}

	/**
	 * @return the hole9
	 */
	public Integer getHole9() {
		return hole9;
	}

	/**
	 * @return the hole10
	 */
	public Integer getHole10() {
		return hole10;
	}

	/**
	 * @return the hole11
	 */
	public Integer getHole11() {
		return hole11;
	}

	/**
	 * @return the hole12
	 */
	public Integer getHole12() {
		return hole12;
	}

	/**
	 * @return the hole13
	 */
	public Integer getHole13() {
		return hole13;
	}

	/**
	 * @return the hole14
	 */
	public Integer getHole14() {
		return hole14;
	}

	/**
	 * @return the hole15
	 */
	public Integer getHole15() {
		return hole15;
	}

	/**
	 * @return the hole16
	 */
	public Integer getHole16() {
		return hole16;
	}

	/**
	 * @return the hole17
	 */
	public Integer getHole17() {
		return hole17;
	}

	/**
	 * @return the hole18
	 */
	public Integer getHole18() {
		return hole18;
	}

	/**
	 * @return the holeCode1
	 */
	public Integer getHoleCode1() {
		return holeCode1;
	}

	/**
	 * @return the holeCode2
	 */
	public Integer getHoleCode2() {
		return holeCode2;
	}

	/**
	 * @return the holeCode3
	 */
	public Integer getHoleCode3() {
		return holeCode3;
	}

	/**
	 * @return the holeCode4
	 */
	public Integer getHoleCode4() {
		return holeCode4;
	}

	/**
	 * @return the holeCode5
	 */
	public Integer getHoleCode5() {
		return holeCode5;
	}

	/**
	 * @return the holeCode6
	 */
	public Integer getHoleCode6() {
		return holeCode6;
	}

	/**
	 * @return the holeCode7
	 */
	public Integer getHoleCode7() {
		return holeCode7;
	}

	/**
	 * @return the holeCode8
	 */
	public Integer getHoleCode8() {
		return holeCode8;
	}

	/**
	 * @return the holeCode9
	 */
	public Integer getHoleCode9() {
		return holeCode9;
	}

	/**
	 * @return the holeCode10
	 */
	public Integer getHoleCode10() {
		return holeCode10;
	}

	/**
	 * @return the holeCode11
	 */
	public Integer getHoleCode11() {
		return holeCode11;
	}

	/**
	 * @return the holeCode12
	 */
	public Integer getHoleCode12() {
		return holeCode12;
	}

	/**
	 * @return the holeCode13
	 */
	public Integer getHoleCode13() {
		return holeCode13;
	}

	/**
	 * @return the holeCode14
	 */
	public Integer getHoleCode14() {
		return holeCode14;
	}

	/**
	 * @return the holeCode15
	 */
	public Integer getHoleCode15() {
		return holeCode15;
	}

	/**
	 * @return the holeCode16
	 */
	public Integer getHoleCode16() {
		return holeCode16;
	}

	/**
	 * @return the holeCode17
	 */
	public Integer getHoleCode17() {
		return holeCode17;
	}

	/**
	 * @return the holeCode18
	 */
	public Integer getHoleCode18() {
		return holeCode18;
	}

	/**
	 * @return the roundEnd
	 */
	public String getRoundEnd() {
		return roundEnd;
	}

	/**
	 * @return the totalScore
	 */
	public Integer getTotalScore() {
		return totalScore;
	}

	/**
	 * @return the accuSumUnderpar
	 */
	public Integer getAccuSumUnderpar() {
		return accuSumUnderpar;
	}

	/**
	 * @return the accuSumScore
	 */
	public Integer getAccuSumScore() {
		return accuSumScore;
	}

	/**
	 * @return the totalHoleCnt
	 */
	public Integer getTotalHoleCnt() {
		return totalHoleCnt;
	}

	/**
	 * @return the udparSum1
	 */
	public Integer getUdparSum1() {
		return udparSum1;
	}

	/**
	 * @return the udparSum2
	 */
	public Integer getUdparSum2() {
		return udparSum2;
	}

	/**
	 * @return the udparSum3
	 */
	public Integer getUdparSum3() {
		return udparSum3;
	}

	/**
	 * @return the udparSum4
	 */
	public Integer getUdparSum4() {
		return udparSum4;
	}

	/**
	 * @param gameId the gameId to set
	 */
	public void setGameId(String gameId) {
		this.gameId = gameId;
	}

	/**
	 * @param roundIdx the roundIdx to set
	 */
	public void setRoundIdx(Integer roundIdx) {
		this.roundIdx = roundIdx;
	}

	/**
	 * @param rankNo the rankNo to set
	 */
	public void setRankNo(String rankNo) {
		this.rankNo = rankNo;
	}

	/**
	 * @param startInOut the startInOut to set
	 */
	public void setStartInOut(String startInOut) {
		this.startInOut = startInOut;
	}

	/**
	 * @param rankUnderpar the rankUnderpar to set
	 */
	public void setRankUnderpar(Integer rankUnderpar) {
		this.rankUnderpar = rankUnderpar;
	}

	/**
	 * @param udparSumTot the udparSumTot to set
	 */
	public void setUdparSumTot(Integer udparSumTot) {
		this.udparSumTot = udparSumTot;
	}

	/**
	 * @param playerId the playerId to set
	 */
	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}

	/**
	 * @param startTimeId the startTimeId to set
	 */
	public void setStartTimeId(Integer startTimeId) {
		this.startTimeId = startTimeId;
	}

	/**
	 * @param playerName the playerName to set
	 */
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	/**
	 * @param hole1 the hole1 to set
	 */
	public void setHole1(Integer hole1) {
		this.hole1 = hole1;
	}

	/**
	 * @param hole2 the hole2 to set
	 */
	public void setHole2(Integer hole2) {
		this.hole2 = hole2;
	}

	/**
	 * @param hole3 the hole3 to set
	 */
	public void setHole3(Integer hole3) {
		this.hole3 = hole3;
	}

	/**
	 * @param hole4 the hole4 to set
	 */
	public void setHole4(Integer hole4) {
		this.hole4 = hole4;
	}

	/**
	 * @param hole5 the hole5 to set
	 */
	public void setHole5(Integer hole5) {
		this.hole5 = hole5;
	}

	/**
	 * @param hole6 the hole6 to set
	 */
	public void setHole6(Integer hole6) {
		this.hole6 = hole6;
	}

	/**
	 * @param hole7 the hole7 to set
	 */
	public void setHole7(Integer hole7) {
		this.hole7 = hole7;
	}

	/**
	 * @param hole8 the hole8 to set
	 */
	public void setHole8(Integer hole8) {
		this.hole8 = hole8;
	}

	/**
	 * @param hole9 the hole9 to set
	 */
	public void setHole9(Integer hole9) {
		this.hole9 = hole9;
	}

	/**
	 * @param hole10 the hole10 to set
	 */
	public void setHole10(Integer hole10) {
		this.hole10 = hole10;
	}

	/**
	 * @param hole11 the hole11 to set
	 */
	public void setHole11(Integer hole11) {
		this.hole11 = hole11;
	}

	/**
	 * @param hole12 the hole12 to set
	 */
	public void setHole12(Integer hole12) {
		this.hole12 = hole12;
	}

	/**
	 * @param hole13 the hole13 to set
	 */
	public void setHole13(Integer hole13) {
		this.hole13 = hole13;
	}

	/**
	 * @param hole14 the hole14 to set
	 */
	public void setHole14(Integer hole14) {
		this.hole14 = hole14;
	}

	/**
	 * @param hole15 the hole15 to set
	 */
	public void setHole15(Integer hole15) {
		this.hole15 = hole15;
	}

	/**
	 * @param hole16 the hole16 to set
	 */
	public void setHole16(Integer hole16) {
		this.hole16 = hole16;
	}

	/**
	 * @param hole17 the hole17 to set
	 */
	public void setHole17(Integer hole17) {
		this.hole17 = hole17;
	}

	/**
	 * @param hole18 the hole18 to set
	 */
	public void setHole18(Integer hole18) {
		this.hole18 = hole18;
	}

	/**
	 * @param holeCode1 the holeCode1 to set
	 */
	public void setHoleCode1(Integer holeCode1) {
		this.holeCode1 = getHoleCode(holeCode1);
	}

	/**
	 * @param holeCode2 the holeCode2 to set
	 */
	public void setHoleCode2(Integer holeCode2) {
		this.holeCode2 = getHoleCode(holeCode2);
	}

	/**
	 * @param holeCode3 the holeCode3 to set
	 */
	public void setHoleCode3(Integer holeCode3) {
		this.holeCode3 = getHoleCode(holeCode3);
	}

	/**
	 * @param holeCode4 the holeCode4 to set
	 */
	public void setHoleCode4(Integer holeCode4) {
		this.holeCode4 = getHoleCode(holeCode4);
	}

	/**
	 * @param holeCode5 the holeCode5 to set
	 */
	public void setHoleCode5(Integer holeCode5) {
		this.holeCode5 = getHoleCode(holeCode5);
	}

	/**
	 * @param holeCode6 the holeCode6 to set
	 */
	public void setHoleCode6(Integer holeCode6) {
		this.holeCode6 = getHoleCode(holeCode6);
	}

	/**
	 * @param holeCode7 the holeCode7 to set
	 */
	public void setHoleCode7(Integer holeCode7) {
		this.holeCode7 = getHoleCode(holeCode7);
	}

	/**
	 * @param holeCode8 the holeCode8 to set
	 */
	public void setHoleCode8(Integer holeCode8) {
		this.holeCode8 = getHoleCode(holeCode8);
	}

	/**
	 * @param holeCode9 the holeCode9 to set
	 */
	public void setHoleCode9(Integer holeCode9) {
		this.holeCode9 = getHoleCode(holeCode9);
	}

	/**
	 * @param holeCode10 the holeCode10 to set
	 */
	public void setHoleCode10(Integer holeCode10) {
		this.holeCode10 = getHoleCode(holeCode10);
	}

	/**
	 * @param holeCode11 the holeCode11 to set
	 */
	public void setHoleCode11(Integer holeCode11) {
		this.holeCode11 = getHoleCode(holeCode11);
	}

	/**
	 * @param holeCode12 the holeCode12 to set
	 */
	public void setHoleCode12(Integer holeCode12) {
		this.holeCode12 = getHoleCode(holeCode12);
	}

	/**
	 * @param holeCode13 the holeCode13 to set
	 */
	public void setHoleCode13(Integer holeCode13) {
		this.holeCode13 = getHoleCode(holeCode13);
	}

	/**
	 * @param holeCode14 the holeCode14 to set
	 */
	public void setHoleCode14(Integer holeCode14) {
		this.holeCode14 = getHoleCode(holeCode14);
	}

	/**
	 * @param holeCode15 the holeCode15 to set
	 */
	public void setHoleCode15(Integer holeCode15) {
		this.holeCode15 = getHoleCode(holeCode15);
	}

	/**
	 * @param holeCode16 the holeCode16 to set
	 */
	public void setHoleCode16(Integer holeCode16) {
		this.holeCode16 = getHoleCode(holeCode16);
	}

	/**
	 * @param holeCode17 the holeCode17 to set
	 */
	public void setHoleCode17(Integer holeCode17) {
		this.holeCode17 = getHoleCode(holeCode17);
	}

	/**
	 * @param holeCode18 the holeCode18 to set
	 */
	public void setHoleCode18(Integer holeCode18) {
		this.holeCode18 = getHoleCode(holeCode18);
	}

	/**
	 * @param roundEnd the roundEnd to set
	 */
	public void setRoundEnd(String roundEnd) {
		this.roundEnd = roundEnd;
	}

	/**
	 * @param totalScore the totalScore to set
	 */
	public void setTotalScore(Integer totalScore) {
		this.totalScore = totalScore;
	}

	/**
	 * @param accuSumUnderpar the accuSumUnderpar to set
	 */
	public void setAccuSumUnderpar(Integer accuSumUnderpar) {
		this.accuSumUnderpar = accuSumUnderpar;
	}

	/**
	 * @param accuSumScore the accuSumScore to set
	 */
	public void setAccuSumScore(Integer accuSumScore) {
		this.accuSumScore = accuSumScore;
	}

	/**
	 * @param totalHoleCnt the totalHoleCnt to set
	 */
	public void setTotalHoleCnt(Integer totalHoleCnt) {
		this.totalHoleCnt = totalHoleCnt;
	}

	/**
	 * @param udparSum1 the udparSum1 to set
	 */
	public void setUdparSum1(Integer udparSum1) {
		this.udparSum1 = udparSum1;
	}

	/**
	 * @param udparSum2 the udparSum2 to set
	 */
	public void setUdparSum2(Integer udparSum2) {
		this.udparSum2 = udparSum2;
	}

	/**
	 * @param udparSum3 the udparSum3 to set
	 */
	public void setUdparSum3(Integer udparSum3) {
		this.udparSum3 = udparSum3;
	}

	/**
	 * @param udparSum4 the udparSum4 to set
	 */
	public void setUdparSum4(Integer udparSum4) {
		this.udparSum4 = udparSum4;
	}
	
	
	
	
	
	
	
	
	
	
}
