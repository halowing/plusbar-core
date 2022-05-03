package com.aircode.dtv.golf.plusbar.core.kpga.dto.sk;

import java.io.Serializable;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 * 대회 코스 정보
 * 
 * KPGA SK API 연동 규격 
 * 
 * @author "aircode"
 *
 */
@JsonNaming(value = PropertyNamingStrategies.LowerCamelCaseStrategy.class)
public class SkCourseDTO implements Serializable {
	
	private static final long serialVersionUID = -5486035633384913107L;
	
	private String gameId            ;
	private Integer gameCourseNo      ;
	private String regionCode        ;
	private String gameGroupCode     ;
	private String golfclubId        ;
	private String courseId          ;
	private String golfclubName      ;
	private String courseName        ;
	private String gameStartDate     ;
	private String gameEndDate       ;
	private Integer gamePlayerCnt     ;
	private Integer gameSubgroupCnt   ;
	private Integer holePar1          ;
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
	private Integer holeParIn         ;
	private Integer holeParOut        ;
	private Integer holeParSum        ;
	private Integer holeYard1         ;
	private Integer holeYard2         ;
	private Integer holeYard3         ;
	private Integer holeYard4         ;
	private Integer holeYard5         ;
	private Integer holeYard6         ;
	private Integer holeYard7         ;
	private Integer holeYard8         ;
	private Integer holeYard9         ;
	private Integer holeYard10        ;
	private Integer holeYard11        ;
	private Integer holeYard12        ;
	private Integer holeYard13        ;
	private Integer holeYard14        ;
	private Integer holeYard15        ;
	private Integer holeYard16        ;
	private Integer holeYard17        ;
	private Integer holeYard18        ;
	private Integer holeYardOut       ;
	private Integer holeYardIn        ;
	private Integer holeYardSum       ;
	private Integer holeMeter1        ;
	private Integer holeMeter2        ;
	private Integer holeMeter3        ;
	private Integer holeMeter4        ;
	private Integer holeMeter5        ;
	private Integer holeMeter6        ;
	private Integer holeMeter7        ;
	private Integer holeMeter8        ;
	private Integer holeMeter9        ;
	private Integer holeMeter10       ;
	private Integer holeMeter11       ;
	private Integer holeMeter12       ;
	private Integer holeMeter13       ;
	private Integer holeMeter14       ;
	private Integer holeMeter15       ;
	private Integer holeMeter16       ;
	private Integer holeMeter17       ;
	private Integer holeMeter18       ;
	private Integer holeMeterOut      ;
	private Integer holeMeterIn       ;
	private Integer holeMeterSum      ;
	public String getGameId() {
		return gameId;
	}
	public void setGameId(String gameId) {
		this.gameId = gameId;
	}
	public Integer getGameCourseNo() {
		return gameCourseNo;
	}
	public void setGameCourseNo(Integer gameCourseNo) {
		this.gameCourseNo = gameCourseNo;
	}
	public String getRegionCode() {
		return regionCode;
	}
	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}
	public String getGameGroupCode() {
		return gameGroupCode;
	}
	public void setGameGroupCode(String gameGroupCode) {
		this.gameGroupCode = gameGroupCode;
	}
	public String getGolfclubId() {
		return golfclubId;
	}
	public void setGolfclubId(String golfclubId) {
		this.golfclubId = golfclubId;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getGolfclubName() {
		return golfclubName;
	}
	public void setGolfclubName(String golfclubName) {
		this.golfclubName = golfclubName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getGameStartDate() {
		return gameStartDate;
	}
	public void setGameStartDate(String gameStartDate) {
		this.gameStartDate = gameStartDate;
	}
	public String getGameEndDate() {
		return gameEndDate;
	}
	public void setGameEndDate(String gameEndDate) {
		this.gameEndDate = gameEndDate;
	}
	public Integer getGamePlayerCnt() {
		return gamePlayerCnt;
	}
	public void setGamePlayerCnt(Integer gamePlayerCnt) {
		this.gamePlayerCnt = gamePlayerCnt;
	}
	public Integer getGameSubgroupCnt() {
		return gameSubgroupCnt;
	}
	public void setGameSubgroupCnt(Integer gameSubgroupCnt) {
		this.gameSubgroupCnt = gameSubgroupCnt;
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
	public Integer getHoleParIn() {
		return holeParIn;
	}
	public void setHoleParIn(Integer holeParIn) {
		this.holeParIn = holeParIn;
	}
	public Integer getHoleParOut() {
		return holeParOut;
	}
	public void setHoleParOut(Integer holeParOut) {
		this.holeParOut = holeParOut;
	}
	public Integer getHoleParSum() {
		return holeParSum;
	}
	public void setHoleParSum(Integer holeParSum) {
		this.holeParSum = holeParSum;
	}
	public Integer getHoleYard1() {
		return holeYard1;
	}
	public void setHoleYard1(Integer holeYard1) {
		this.holeYard1 = holeYard1;
	}
	public Integer getHoleYard2() {
		return holeYard2;
	}
	public void setHoleYard2(Integer holeYard2) {
		this.holeYard2 = holeYard2;
	}
	public Integer getHoleYard3() {
		return holeYard3;
	}
	public void setHoleYard3(Integer holeYard3) {
		this.holeYard3 = holeYard3;
	}
	public Integer getHoleYard4() {
		return holeYard4;
	}
	public void setHoleYard4(Integer holeYard4) {
		this.holeYard4 = holeYard4;
	}
	public Integer getHoleYard5() {
		return holeYard5;
	}
	public void setHoleYard5(Integer holeYard5) {
		this.holeYard5 = holeYard5;
	}
	public Integer getHoleYard6() {
		return holeYard6;
	}
	public void setHoleYard6(Integer holeYard6) {
		this.holeYard6 = holeYard6;
	}
	public Integer getHoleYard7() {
		return holeYard7;
	}
	public void setHoleYard7(Integer holeYard7) {
		this.holeYard7 = holeYard7;
	}
	public Integer getHoleYard8() {
		return holeYard8;
	}
	public void setHoleYard8(Integer holeYard8) {
		this.holeYard8 = holeYard8;
	}
	public Integer getHoleYard9() {
		return holeYard9;
	}
	public void setHoleYard9(Integer holeYard9) {
		this.holeYard9 = holeYard9;
	}
	public Integer getHoleYard10() {
		return holeYard10;
	}
	public void setHoleYard10(Integer holeYard10) {
		this.holeYard10 = holeYard10;
	}
	public Integer getHoleYard11() {
		return holeYard11;
	}
	public void setHoleYard11(Integer holeYard11) {
		this.holeYard11 = holeYard11;
	}
	public Integer getHoleYard12() {
		return holeYard12;
	}
	public void setHoleYard12(Integer holeYard12) {
		this.holeYard12 = holeYard12;
	}
	public Integer getHoleYard13() {
		return holeYard13;
	}
	public void setHoleYard13(Integer holeYard13) {
		this.holeYard13 = holeYard13;
	}
	public Integer getHoleYard14() {
		return holeYard14;
	}
	public void setHoleYard14(Integer holeYard14) {
		this.holeYard14 = holeYard14;
	}
	public Integer getHoleYard15() {
		return holeYard15;
	}
	public void setHoleYard15(Integer holeYard15) {
		this.holeYard15 = holeYard15;
	}
	public Integer getHoleYard16() {
		return holeYard16;
	}
	public void setHoleYard16(Integer holeYard16) {
		this.holeYard16 = holeYard16;
	}
	public Integer getHoleYard17() {
		return holeYard17;
	}
	public void setHoleYard17(Integer holeYard17) {
		this.holeYard17 = holeYard17;
	}
	public Integer getHoleYard18() {
		return holeYard18;
	}
	public void setHoleYard18(Integer holeYard18) {
		this.holeYard18 = holeYard18;
	}
	public Integer getHoleYardOut() {
		return holeYardOut;
	}
	public void setHoleYardOut(Integer holeYardOut) {
		this.holeYardOut = holeYardOut;
	}
	public Integer getHoleYardIn() {
		return holeYardIn;
	}
	public void setHoleYardIn(Integer holeYardIn) {
		this.holeYardIn = holeYardIn;
	}
	public Integer getHoleYardSum() {
		return holeYardSum;
	}
	public void setHoleYardSum(Integer holeYardSum) {
		this.holeYardSum = holeYardSum;
	}
	public Integer getHoleMeter1() {
		return holeMeter1;
	}
	public void setHoleMeter1(Integer holeMeter1) {
		this.holeMeter1 = holeMeter1;
	}
	public Integer getHoleMeter2() {
		return holeMeter2;
	}
	public void setHoleMeter2(Integer holeMeter2) {
		this.holeMeter2 = holeMeter2;
	}
	public Integer getHoleMeter3() {
		return holeMeter3;
	}
	public void setHoleMeter3(Integer holeMeter3) {
		this.holeMeter3 = holeMeter3;
	}
	public Integer getHoleMeter4() {
		return holeMeter4;
	}
	public void setHoleMeter4(Integer holeMeter4) {
		this.holeMeter4 = holeMeter4;
	}
	public Integer getHoleMeter5() {
		return holeMeter5;
	}
	public void setHoleMeter5(Integer holeMeter5) {
		this.holeMeter5 = holeMeter5;
	}
	public Integer getHoleMeter6() {
		return holeMeter6;
	}
	public void setHoleMeter6(Integer holeMeter6) {
		this.holeMeter6 = holeMeter6;
	}
	public Integer getHoleMeter7() {
		return holeMeter7;
	}
	public void setHoleMeter7(Integer holeMeter7) {
		this.holeMeter7 = holeMeter7;
	}
	public Integer getHoleMeter8() {
		return holeMeter8;
	}
	public void setHoleMeter8(Integer holeMeter8) {
		this.holeMeter8 = holeMeter8;
	}
	public Integer getHoleMeter9() {
		return holeMeter9;
	}
	public void setHoleMeter9(Integer holeMeter9) {
		this.holeMeter9 = holeMeter9;
	}
	public Integer getHoleMeter10() {
		return holeMeter10;
	}
	public void setHoleMeter10(Integer holeMeter10) {
		this.holeMeter10 = holeMeter10;
	}
	public Integer getHoleMeter11() {
		return holeMeter11;
	}
	public void setHoleMeter11(Integer holeMeter11) {
		this.holeMeter11 = holeMeter11;
	}
	public Integer getHoleMeter12() {
		return holeMeter12;
	}
	public void setHoleMeter12(Integer holeMeter12) {
		this.holeMeter12 = holeMeter12;
	}
	public Integer getHoleMeter13() {
		return holeMeter13;
	}
	public void setHoleMeter13(Integer holeMeter13) {
		this.holeMeter13 = holeMeter13;
	}
	public Integer getHoleMeter14() {
		return holeMeter14;
	}
	public void setHoleMeter14(Integer holeMeter14) {
		this.holeMeter14 = holeMeter14;
	}
	public Integer getHoleMeter15() {
		return holeMeter15;
	}
	public void setHoleMeter15(Integer holeMeter15) {
		this.holeMeter15 = holeMeter15;
	}
	public Integer getHoleMeter16() {
		return holeMeter16;
	}
	public void setHoleMeter16(Integer holeMeter16) {
		this.holeMeter16 = holeMeter16;
	}
	public Integer getHoleMeter17() {
		return holeMeter17;
	}
	public void setHoleMeter17(Integer holeMeter17) {
		this.holeMeter17 = holeMeter17;
	}
	public Integer getHoleMeter18() {
		return holeMeter18;
	}
	public void setHoleMeter18(Integer holeMeter18) {
		this.holeMeter18 = holeMeter18;
	}
	public Integer getHoleMeterOut() {
		return holeMeterOut;
	}
	public void setHoleMeterOut(Integer holeMeterOut) {
		this.holeMeterOut = holeMeterOut;
	}
	public Integer getHoleMeterIn() {
		return holeMeterIn;
	}
	public void setHoleMeterIn(Integer holeMeterIn) {
		this.holeMeterIn = holeMeterIn;
	}
	public Integer getHoleMeterSum() {
		return holeMeterSum;
	}
	public void setHoleMeterSum(Integer holeMeterSum) {
		this.holeMeterSum = holeMeterSum;
	}
	@Override
	public String toString() {
		return "SkCourseDTO [gameId=" + gameId + ", gameCourseNo=" + gameCourseNo + ", regionCode=" + regionCode
				+ ", gameGroupCode=" + gameGroupCode + ", golfclubId=" + golfclubId + ", courseId=" + courseId
				+ ", golfclubName=" + golfclubName + ", courseName=" + courseName + ", gameStartDate=" + gameStartDate
				+ ", gameEndDate=" + gameEndDate + ", gamePlayerCnt=" + gamePlayerCnt + ", gameSubgroupCnt="
				+ gameSubgroupCnt + ", holePar1=" + holePar1 + ", holePar2=" + holePar2 + ", holePar3=" + holePar3
				+ ", holePar4=" + holePar4 + ", holePar5=" + holePar5 + ", holePar6=" + holePar6 + ", holePar7="
				+ holePar7 + ", holePar8=" + holePar8 + ", holePar9=" + holePar9 + ", holePar10=" + holePar10
				+ ", holePar11=" + holePar11 + ", holePar12=" + holePar12 + ", holePar13=" + holePar13 + ", holePar14="
				+ holePar14 + ", holePar15=" + holePar15 + ", holePar16=" + holePar16 + ", holePar17=" + holePar17
				+ ", holePar18=" + holePar18 + ", holeParIn=" + holeParIn + ", holeParOut=" + holeParOut
				+ ", holeParSum=" + holeParSum + ", holeYard1=" + holeYard1 + ", holeYard2=" + holeYard2
				+ ", holeYard3=" + holeYard3 + ", holeYard4=" + holeYard4 + ", holeYard5=" + holeYard5 + ", holeYard6="
				+ holeYard6 + ", holeYard7=" + holeYard7 + ", holeYard8=" + holeYard8 + ", holeYard9=" + holeYard9
				+ ", holeYard10=" + holeYard10 + ", holeYard11=" + holeYard11 + ", holeYard12=" + holeYard12
				+ ", holeYard13=" + holeYard13 + ", holeYard14=" + holeYard14 + ", holeYard15=" + holeYard15
				+ ", holeYard16=" + holeYard16 + ", holeYard17=" + holeYard17 + ", holeYard18=" + holeYard18
				+ ", holeYardOut=" + holeYardOut + ", holeYardIn=" + holeYardIn + ", holeYardSum=" + holeYardSum
				+ ", holeMeter1=" + holeMeter1 + ", holeMeter2=" + holeMeter2 + ", holeMeter3=" + holeMeter3
				+ ", holeMeter4=" + holeMeter4 + ", holeMeter5=" + holeMeter5 + ", holeMeter6=" + holeMeter6
				+ ", holeMeter7=" + holeMeter7 + ", holeMeter8=" + holeMeter8 + ", holeMeter9=" + holeMeter9
				+ ", holeMeter10=" + holeMeter10 + ", holeMeter11=" + holeMeter11 + ", holeMeter12=" + holeMeter12
				+ ", holeMeter13=" + holeMeter13 + ", holeMeter14=" + holeMeter14 + ", holeMeter15=" + holeMeter15
				+ ", holeMeter16=" + holeMeter16 + ", holeMeter17=" + holeMeter17 + ", holeMeter18=" + holeMeter18
				+ ", holeMeterOut=" + holeMeterOut + ", holeMeterIn=" + holeMeterIn + ", holeMeterSum=" + holeMeterSum
				+ "]";
	}

	

}
