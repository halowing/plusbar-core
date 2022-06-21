package com.aircode.dtv.golf.plusbar.core.kpga.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(value = PropertyNamingStrategies.LowerCamelCaseStrategy.class)
public class KpgaCourseDTO implements Serializable {
	
	private static final long serialVersionUID = -5486035633384913107L;
	
	private String gameId            ;
	
	private String regionCode        ;
	private String gameGroupCode     ;
	private String golfclubId        ;
	private String courseId          ;
	private Integer gameCourseNo      ;
	
//	private String regionGroupCourseId;
	
	private String golfclubName      ;
	private String courseName        ;
	
//	private String golfclubCourseName;
	
//	private String gameStartDate     ;
//	private String gameEndDate       ;
//	private Integer gamePlayerCnt     ;
//	private Integer gameSubgroupCnt   ;
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
//	private Integer holeYard1         ;
//	private Integer holeYard2         ;
//	private Integer holeYard3         ;
//	private Integer holeYard4         ;
//	private Integer holeYard5         ;
//	private Integer holeYard6         ;
//	private Integer holeYard7         ;
//	private Integer holeYard8         ;
//	private Integer holeYard9         ;
//	private Integer holeYard10        ;
//	private Integer holeYard11        ;
//	private Integer holeYard12        ;
//	private Integer holeYard13        ;
//	private Integer holeYard14        ;
//	private Integer holeYard15        ;
//	private Integer holeYard16        ;
//	private Integer holeYard17        ;
//	private Integer holeYard18        ;
//	private Integer holeYardOut       ;
//	private Integer holeYardIn        ;
//	private Integer holeYardSum       ;
//	private Integer holeMeter1        ;
//	private Integer holeMeter2        ;
//	private Integer holeMeter3        ;
//	private Integer holeMeter4        ;
//	private Integer holeMeter5        ;
//	private Integer holeMeter6        ;
//	private Integer holeMeter7        ;
//	private Integer holeMeter8        ;
//	private Integer holeMeter9        ;
//	private Integer holeMeter10       ;
//	private Integer holeMeter11       ;
//	private Integer holeMeter12       ;
//	private Integer holeMeter13       ;
//	private Integer holeMeter14       ;
//	private Integer holeMeter15       ;
//	private Integer holeMeter16       ;
//	private Integer holeMeter17       ;
//	private Integer holeMeter18       ;
//	private Integer holeMeterOut      ;
//	private Integer holeMeterIn       ;
//	private Integer holeMeterSum      ;
	
	public String getRegionGroupCourseId() {
		return regionCode+"-"+gameGroupCode+"-"+golfclubId+"-"+courseId+"-"+gameCourseNo;
	}
	public String getGolfclubCourseName() {
		return golfclubName+" ("+courseName+")";
	}
	
	@Override
	public String toString() {
		return "KpgaCourseDTO [gameId=" + gameId + ", regionCode=" + regionCode + ", gameGroupCode=" + gameGroupCode
				+ ", golfclubId=" + golfclubId + ", courseId=" + courseId + ", gameCourseNo=" + gameCourseNo
				+ ", golfclubName=" + golfclubName + ", courseName=" + courseName + ", holePar1=" + holePar1
				+ ", holePar2=" + holePar2 + ", holePar3=" + holePar3 + ", holePar4=" + holePar4 + ", holePar5="
				+ holePar5 + ", holePar6=" + holePar6 + ", holePar7=" + holePar7 + ", holePar8=" + holePar8
				+ ", holePar9=" + holePar9 + ", holePar10=" + holePar10 + ", holePar11=" + holePar11 + ", holePar12="
				+ holePar12 + ", holePar13=" + holePar13 + ", holePar14=" + holePar14 + ", holePar15=" + holePar15
				+ ", holePar16=" + holePar16 + ", holePar17=" + holePar17 + ", holePar18=" + holePar18 + ", holeParIn="
				+ holeParIn + ", holeParOut=" + holeParOut + ", holeParSum=" + holeParSum + "]";
	}
	public String getGameId() {
		return gameId;
	}
	public String getCourseId() {
		return courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public Integer getHolePar1() {
		return holePar1;
	}
	public Integer getHolePar2() {
		return holePar2;
	}
	public Integer getHolePar3() {
		return holePar3;
	}
	public Integer getHolePar4() {
		return holePar4;
	}
	public Integer getHolePar5() {
		return holePar5;
	}
	public Integer getHolePar6() {
		return holePar6;
	}
	public Integer getHolePar7() {
		return holePar7;
	}
	public Integer getHolePar8() {
		return holePar8;
	}
	public Integer getHolePar9() {
		return holePar9;
	}
	public Integer getHolePar10() {
		return holePar10;
	}
	public Integer getHolePar11() {
		return holePar11;
	}
	public Integer getHolePar12() {
		return holePar12;
	}
	public Integer getHolePar13() {
		return holePar13;
	}
	public Integer getHolePar14() {
		return holePar14;
	}
	public Integer getHolePar15() {
		return holePar15;
	}
	public Integer getHolePar16() {
		return holePar16;
	}
	public Integer getHolePar17() {
		return holePar17;
	}
	public Integer getHolePar18() {
		return holePar18;
	}
	public Integer getHoleParIn() {
		return holeParIn;
	}
	public Integer getHoleParOut() {
		return holeParOut;
	}
	public Integer getHoleParSum() {
		return holeParSum;
	}
	public void setGameId(String gameId) {
		this.gameId = gameId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public void setHolePar1(Integer holePar1) {
		this.holePar1 = holePar1;
	}
	public void setHolePar2(Integer holePar2) {
		this.holePar2 = holePar2;
	}
	public void setHolePar3(Integer holePar3) {
		this.holePar3 = holePar3;
	}
	public void setHolePar4(Integer holePar4) {
		this.holePar4 = holePar4;
	}
	public void setHolePar5(Integer holePar5) {
		this.holePar5 = holePar5;
	}
	public void setHolePar6(Integer holePar6) {
		this.holePar6 = holePar6;
	}
	public void setHolePar7(Integer holePar7) {
		this.holePar7 = holePar7;
	}
	public void setHolePar8(Integer holePar8) {
		this.holePar8 = holePar8;
	}
	public void setHolePar9(Integer holePar9) {
		this.holePar9 = holePar9;
	}
	public void setHolePar10(Integer holePar10) {
		this.holePar10 = holePar10;
	}
	public void setHolePar11(Integer holePar11) {
		this.holePar11 = holePar11;
	}
	public void setHolePar12(Integer holePar12) {
		this.holePar12 = holePar12;
	}
	public void setHolePar13(Integer holePar13) {
		this.holePar13 = holePar13;
	}
	public void setHolePar14(Integer holePar14) {
		this.holePar14 = holePar14;
	}
	public void setHolePar15(Integer holePar15) {
		this.holePar15 = holePar15;
	}
	public void setHolePar16(Integer holePar16) {
		this.holePar16 = holePar16;
	}
	public void setHolePar17(Integer holePar17) {
		this.holePar17 = holePar17;
	}
	public void setHolePar18(Integer holePar18) {
		this.holePar18 = holePar18;
	}
	public void setHoleParIn(Integer holeParIn) {
		this.holeParIn = holeParIn;
	}
	public void setHoleParOut(Integer holeParOut) {
		this.holeParOut = holeParOut;
	}
	public void setHoleParSum(Integer holeParSum) {
		this.holeParSum = holeParSum;
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
	public Integer getGameCourseNo() {
		return gameCourseNo;
	}
	public void setGameCourseNo(Integer gameCourseNo) {
		this.gameCourseNo = gameCourseNo;
	}
	public String getGolfclubName() {
		return golfclubName;
	}
	public void setGolfclubName(String golfclubName) {
		this.golfclubName = golfclubName;
	}
}
