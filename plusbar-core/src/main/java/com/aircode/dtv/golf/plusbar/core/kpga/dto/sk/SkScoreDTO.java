package com.aircode.dtv.golf.plusbar.core.kpga.dto.sk;

import java.io.Serializable;

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
public class SkScoreDTO implements Serializable {

	private static final long serialVersionUID = 3116201584856006474L;
	
	private String  gameId            ;
	private String  roundNo           ;
	private String  rankNo            ;			// 랭킹 , 순위 
	private String  startInOut        ;			// IN/OUT
	private Integer rankUnderpar      ;			// 누적 토탈 타수 , -6
	private Integer udparSumTot       ;			// 라운드 토탈 스코어, -6
	private String  memberId          ;
	private Integer startTimeId       ;			// 선수 조 번호
	private String  playerName        ;
	private Integer holePar1          ;			// 1홀 기준타 , 4
	private Integer holePar2          ;
	private Integer holePar3          ;
	private Integer holePar4          ;
	private Integer holePar5          ;
	private Integer holePar6          ;
	private Integer holePar7          ;
	private Integer holePar8          ;
	private Integer holePar9          ;
	private Integer holePar10         ;
	private Integer holePar11         ;
	private Integer holePar12         ;
	private Integer holePar13         ;
	private Integer holePar14         ;
	private Integer holePar15         ;
	private Integer holePar16         ;
	private Integer holePar17         ;
	private Integer holePar18         ;
	private Integer score1            ;			// 1홀 타수 , 3
	private Integer score2            ;
	private Integer score3            ;
	private Integer score4            ;
	private Integer score5            ;
	private Integer score6            ;
	private Integer score7            ;
	private Integer score8            ;
	private Integer score9            ;
	private Integer score10           ;
	private Integer score11           ;
	private Integer score12           ;
	private Integer score13           ;
	private Integer score14           ;
	private Integer score15           ;
	private Integer score16           ;
	private Integer score17           ;
	private Integer score18           ;
	private Integer udpar1            ;			// 1홀 스코어 , -1
	private Integer udpar2            ;
	private Integer udpar3            ;
	private Integer udpar4            ;
	private Integer udpar5            ;
	private Integer udpar6            ;
	private Integer udpar7            ;
	private Integer udpar8            ;
	private Integer udpar9            ;
	private Integer udpar10           ;
	private Integer udpar11           ;
	private Integer udpar12           ;
	private Integer udpar13           ;
	private Integer udpar14           ;
	private Integer udpar15           ;
	private Integer udpar16           ;
	private Integer udpar17           ;
	private Integer udpar18           ;
	private String roundEnd          ;			// 현재 종료홀 , F
	private Integer scoreSumTot       ;			// 라운드 토탈 타수, 3
	private Integer accuSumUnderpar   ;			// 누적 스코어    , -6
	private Integer accuSumScore      ;			// 누적 타수      , 65
	private Integer totalHoleCnt      ;			// 토탈홀카운트		, 18.0
	private Integer udparSum1         ;			// 1라운드 타수
	private Integer udparSum2         ;
	private Integer udparSum3         ;
	private Integer udparSum4         ;			// 0
	public String getGameId() {
		return gameId;
	}
	public void setGameId(String gameId) {
		this.gameId = gameId;
	}
	public String getRoundNo() {
		return roundNo;
	}
	public void setRoundNo(String roundNo) {
		this.roundNo = roundNo;
	}
	public String getRankNo() {
		return rankNo;
	}
	public void setRankNo(String rankNo) {
		this.rankNo = rankNo;
	}
	public String getStartInOut() {
		return startInOut;
	}
	public void setStartInOut(String startInOut) {
		this.startInOut = startInOut;
	}
	public Integer getRankUnderpar() {
		return rankUnderpar;
	}
	public void setRankUnderpar(Integer rankUnderpar) {
		this.rankUnderpar = rankUnderpar;
	}
	public Integer getUdparSumTot() {
		return udparSumTot;
	}
	public void setUdparSumTot(Integer udparSumTot) {
		this.udparSumTot = udparSumTot;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public Integer getStartTimeId() {
		return startTimeId;
	}
	public void setStartTimeId(Integer startTimeId) {
		this.startTimeId = startTimeId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public Integer getHolePar1() {
		return holePar1;
	}
	public void setHolePar1(Integer holePar1) {
		this.holePar1 = holePar1;
	}
	public Integer getHolePar2() {
		return holePar2;
	}
	public void setHolePar2(Integer holePar2) {
		this.holePar2 = holePar2;
	}
	public Integer getHolePar3() {
		return holePar3;
	}
	public void setHolePar3(Integer holePar3) {
		this.holePar3 = holePar3;
	}
	public Integer getHolePar4() {
		return holePar4;
	}
	public void setHolePar4(Integer holePar4) {
		this.holePar4 = holePar4;
	}
	public Integer getHolePar5() {
		return holePar5;
	}
	public void setHolePar5(Integer holePar5) {
		this.holePar5 = holePar5;
	}
	public Integer getHolePar6() {
		return holePar6;
	}
	public void setHolePar6(Integer holePar6) {
		this.holePar6 = holePar6;
	}
	public Integer getHolePar7() {
		return holePar7;
	}
	public void setHolePar7(Integer holePar7) {
		this.holePar7 = holePar7;
	}
	public Integer getHolePar8() {
		return holePar8;
	}
	public void setHolePar8(Integer holePar8) {
		this.holePar8 = holePar8;
	}
	public Integer getHolePar9() {
		return holePar9;
	}
	public void setHolePar9(Integer holePar9) {
		this.holePar9 = holePar9;
	}
	public Integer getHolePar10() {
		return holePar10;
	}
	public void setHolePar10(Integer holePar10) {
		this.holePar10 = holePar10;
	}
	public Integer getHolePar11() {
		return holePar11;
	}
	public void setHolePar11(Integer holePar11) {
		this.holePar11 = holePar11;
	}
	public Integer getHolePar12() {
		return holePar12;
	}
	public void setHolePar12(Integer holePar12) {
		this.holePar12 = holePar12;
	}
	public Integer getHolePar13() {
		return holePar13;
	}
	public void setHolePar13(Integer holePar13) {
		this.holePar13 = holePar13;
	}
	public Integer getHolePar14() {
		return holePar14;
	}
	public void setHolePar14(Integer holePar14) {
		this.holePar14 = holePar14;
	}
	public Integer getHolePar15() {
		return holePar15;
	}
	public void setHolePar15(Integer holePar15) {
		this.holePar15 = holePar15;
	}
	public Integer getHolePar16() {
		return holePar16;
	}
	public void setHolePar16(Integer holePar16) {
		this.holePar16 = holePar16;
	}
	public Integer getHolePar17() {
		return holePar17;
	}
	public void setHolePar17(Integer holePar17) {
		this.holePar17 = holePar17;
	}
	public Integer getHolePar18() {
		return holePar18;
	}
	public void setHolePar18(Integer holePar18) {
		this.holePar18 = holePar18;
	}
	public Integer getScore1() {
		return score1;
	}
	public void setScore1(Integer score1) {
		this.score1 = score1;
	}
	public Integer getScore2() {
		return score2;
	}
	public void setScore2(Integer score2) {
		this.score2 = score2;
	}
	public Integer getScore3() {
		return score3;
	}
	public void setScore3(Integer score3) {
		this.score3 = score3;
	}
	public Integer getScore4() {
		return score4;
	}
	public void setScore4(Integer score4) {
		this.score4 = score4;
	}
	public Integer getScore5() {
		return score5;
	}
	public void setScore5(Integer score5) {
		this.score5 = score5;
	}
	public Integer getScore6() {
		return score6;
	}
	public void setScore6(Integer score6) {
		this.score6 = score6;
	}
	public Integer getScore7() {
		return score7;
	}
	public void setScore7(Integer score7) {
		this.score7 = score7;
	}
	public Integer getScore8() {
		return score8;
	}
	public void setScore8(Integer score8) {
		this.score8 = score8;
	}
	public Integer getScore9() {
		return score9;
	}
	public void setScore9(Integer score9) {
		this.score9 = score9;
	}
	public Integer getScore10() {
		return score10;
	}
	public void setScore10(Integer score10) {
		this.score10 = score10;
	}
	public Integer getScore11() {
		return score11;
	}
	public void setScore11(Integer score11) {
		this.score11 = score11;
	}
	public Integer getScore12() {
		return score12;
	}
	public void setScore12(Integer score12) {
		this.score12 = score12;
	}
	public Integer getScore13() {
		return score13;
	}
	public void setScore13(Integer score13) {
		this.score13 = score13;
	}
	public Integer getScore14() {
		return score14;
	}
	public void setScore14(Integer score14) {
		this.score14 = score14;
	}
	public Integer getScore15() {
		return score15;
	}
	public void setScore15(Integer score15) {
		this.score15 = score15;
	}
	public Integer getScore16() {
		return score16;
	}
	public void setScore16(Integer score16) {
		this.score16 = score16;
	}
	public Integer getScore17() {
		return score17;
	}
	public void setScore17(Integer score17) {
		this.score17 = score17;
	}
	public Integer getScore18() {
		return score18;
	}
	public void setScore18(Integer score18) {
		this.score18 = score18;
	}
	public Integer getUdpar1() {
		return udpar1;
	}
	public void setUdpar1(Integer udpar1) {
		this.udpar1 = udpar1;
	}
	public Integer getUdpar2() {
		return udpar2;
	}
	public void setUdpar2(Integer udpar2) {
		this.udpar2 = udpar2;
	}
	public Integer getUdpar3() {
		return udpar3;
	}
	public void setUdpar3(Integer udpar3) {
		this.udpar3 = udpar3;
	}
	public Integer getUdpar4() {
		return udpar4;
	}
	public void setUdpar4(Integer udpar4) {
		this.udpar4 = udpar4;
	}
	public Integer getUdpar5() {
		return udpar5;
	}
	public void setUdpar5(Integer udpar5) {
		this.udpar5 = udpar5;
	}
	public Integer getUdpar6() {
		return udpar6;
	}
	public void setUdpar6(Integer udpar6) {
		this.udpar6 = udpar6;
	}
	public Integer getUdpar7() {
		return udpar7;
	}
	public void setUdpar7(Integer udpar7) {
		this.udpar7 = udpar7;
	}
	public Integer getUdpar8() {
		return udpar8;
	}
	public void setUdpar8(Integer udpar8) {
		this.udpar8 = udpar8;
	}
	public Integer getUdpar9() {
		return udpar9;
	}
	public void setUdpar9(Integer udpar9) {
		this.udpar9 = udpar9;
	}
	public Integer getUdpar10() {
		return udpar10;
	}
	public void setUdpar10(Integer udpar10) {
		this.udpar10 = udpar10;
	}
	public Integer getUdpar11() {
		return udpar11;
	}
	public void setUdpar11(Integer udpar11) {
		this.udpar11 = udpar11;
	}
	public Integer getUdpar12() {
		return udpar12;
	}
	public void setUdpar12(Integer udpar12) {
		this.udpar12 = udpar12;
	}
	public Integer getUdpar13() {
		return udpar13;
	}
	public void setUdpar13(Integer udpar13) {
		this.udpar13 = udpar13;
	}
	public Integer getUdpar14() {
		return udpar14;
	}
	public void setUdpar14(Integer udpar14) {
		this.udpar14 = udpar14;
	}
	public Integer getUdpar15() {
		return udpar15;
	}
	public void setUdpar15(Integer udpar15) {
		this.udpar15 = udpar15;
	}
	public Integer getUdpar16() {
		return udpar16;
	}
	public void setUdpar16(Integer udpar16) {
		this.udpar16 = udpar16;
	}
	public Integer getUdpar17() {
		return udpar17;
	}
	public void setUdpar17(Integer udpar17) {
		this.udpar17 = udpar17;
	}
	public Integer getUdpar18() {
		return udpar18;
	}
	public void setUdpar18(Integer udpar18) {
		this.udpar18 = udpar18;
	}
	public String getRoundEnd() {
		return roundEnd;
	}
	public void setRoundEnd(String roundEnd) {
		this.roundEnd = roundEnd;
	}
	public Integer getScoreSumTot() {
		return scoreSumTot;
	}
	public void setScoreSumTot(Integer scoreSumTot) {
		this.scoreSumTot = scoreSumTot;
	}
	public Integer getAccuSumUnderpar() {
		return accuSumUnderpar;
	}
	public void setAccuSumUnderpar(Integer accuSumUnderpar) {
		this.accuSumUnderpar = accuSumUnderpar;
	}
	public Integer getAccuSumScore() {
		return accuSumScore;
	}
	public void setAccuSumScore(Integer accuSumScore) {
		this.accuSumScore = accuSumScore;
	}
	public Integer getTotalHoleCnt() {
		return totalHoleCnt;
	}
	public void setTotalHoleCnt(Integer totalHoleCnt) {
		this.totalHoleCnt = totalHoleCnt;
	}
	public Integer getUdparSum1() {
		return udparSum1;
	}
	public void setUdparSum1(Integer udparSum1) {
		this.udparSum1 = udparSum1;
	}
	public Integer getUdparSum2() {
		return udparSum2;
	}
	public void setUdparSum2(Integer udparSum2) {
		this.udparSum2 = udparSum2;
	}
	public Integer getUdparSum3() {
		return udparSum3;
	}
	public void setUdparSum3(Integer udparSum3) {
		this.udparSum3 = udparSum3;
	}
	public Integer getUdparSum4() {
		return udparSum4;
	}
	public void setUdparSum4(Integer udparSum4) {
		this.udparSum4 = udparSum4;
	}
	@Override
	public String toString() {
		return "SkScoreDTO [gameId=" + gameId + ", roundNo=" + roundNo + ", rankNo=" + rankNo + ", startInOut="
				+ startInOut + ", rankUnderpar=" + rankUnderpar + ", udparSumTot=" + udparSumTot + ", memberId="
				+ memberId + ", startTimeId=" + startTimeId + ", playerName=" + playerName + ", holePar1=" + holePar1
				+ ", holePar2=" + holePar2 + ", holePar3=" + holePar3 + ", holePar4=" + holePar4 + ", holePar5="
				+ holePar5 + ", holePar6=" + holePar6 + ", holePar7=" + holePar7 + ", holePar8=" + holePar8
				+ ", holePar9=" + holePar9 + ", holePar10=" + holePar10 + ", holePar11=" + holePar11 + ", holePar12="
				+ holePar12 + ", holePar13=" + holePar13 + ", holePar14=" + holePar14 + ", holePar15=" + holePar15
				+ ", holePar16=" + holePar16 + ", holePar17=" + holePar17 + ", holePar18=" + holePar18 + ", score1="
				+ score1 + ", score2=" + score2 + ", score3=" + score3 + ", score4=" + score4 + ", score5=" + score5
				+ ", score6=" + score6 + ", score7=" + score7 + ", score8=" + score8 + ", score9=" + score9
				+ ", score10=" + score10 + ", score11=" + score11 + ", score12=" + score12 + ", score13=" + score13
				+ ", score14=" + score14 + ", score15=" + score15 + ", score16=" + score16 + ", score17=" + score17
				+ ", score18=" + score18 + ", udpar1=" + udpar1 + ", udpar2=" + udpar2 + ", udpar3=" + udpar3
				+ ", udpar4=" + udpar4 + ", udpar5=" + udpar5 + ", udpar6=" + udpar6 + ", udpar7=" + udpar7
				+ ", udpar8=" + udpar8 + ", udpar9=" + udpar9 + ", udpar10=" + udpar10 + ", udpar11=" + udpar11
				+ ", udpar12=" + udpar12 + ", udpar13=" + udpar13 + ", udpar14=" + udpar14 + ", udpar15=" + udpar15
				+ ", udpar16=" + udpar16 + ", udpar17=" + udpar17 + ", udpar18=" + udpar18 + ", roundEnd=" + roundEnd
				+ ", scoreSumTot=" + scoreSumTot + ", accuSumUnderpar=" + accuSumUnderpar + ", accuSumScore="
				+ accuSumScore + ", totalHoleCnt=" + totalHoleCnt + ", udparSum1=" + udparSum1 + ", udparSum2="
				+ udparSum2 + ", udparSum3=" + udparSum3 + ", udparSum4=" + udparSum4 + "]";
	}

	
	
}
