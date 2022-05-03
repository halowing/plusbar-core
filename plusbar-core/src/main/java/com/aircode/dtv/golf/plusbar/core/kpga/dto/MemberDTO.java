package com.aircode.dtv.golf.plusbar.core.kpga.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(value = PropertyNamingStrategies.LowerCamelCaseStrategy.class)
public class MemberDTO implements Serializable {
	
	private static final long serialVersionUID = 5780925786548926848L;
	
	private String memberId;   					// "00056189",
	private String memberState;   				// "N",
	private String classType;  		 			// "TP",
	private String userName;   					// "김주형",
	
	@JsonAlias("uerEnName")
	private String enName;   					// null,
	private String enLastName;   				// "KIM",
	private String enFirstName;   				// "Joohyung",
	
	@JsonAlias("image")
	private String profilePhoto1;   			// "00056189.jpg",
	private String firstAdmissionDate; 			// "2020.03.25",  	// 최초 입회
	private String isClasspro;   				// "",
	private String proTourProAdmissionDate;   	// "2020",
	private String proTourProNo;   				// "2156",
	private String classProNo;   // "",
	
	@JsonAlias("countryCode")
	private String nationCode;   // "KOR",
	private String profileHome;   // "",
	private String isProfileDobExp;   // "",
	private String profileDob;   // "20020621",
	private String birthYear;   // "2002",
	private String birthMonth;   // "06",
	private String birthDay;	// "19910101"
	
	@JsonAlias("height")
	private String profileHeight;   // "180",
	
	@JsonAlias("weight")
	private String profileWeight;   // "100",
	private String workplaceAddress;   // "",
	private String workplaceDtlAddress;   // "",
	
	@JsonAlias("team")
	private String workplaceName;   // "",
	private String tourProAdmissionDate;   // "2020.03.25", 	// 투어프로 입회
	private String playerContract;   // "CJ대한통운, Titleist",
	private String isSrixon;   // null,
	private String tourId;   // "11",
	
	@JsonAlias("country")
	private String nationCodeValue;   // "한국",
	private String debut;   // "2020",							// 코리안투어 데뷔
	private Integer winCnt;   // 2,
	private String mgBallName;   // "Titleist ",
	private String mgBallCode;   // "",
	private String mgBallSe;   // "Prov1x",
	private String mgBallScode;   // ""
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberState() {
		return memberState;
	}
	public void setMemberState(String memberState) {
		this.memberState = memberState;
	}
	public String getClassType() {
		return classType;
	}
	public void setClassType(String classType) {
		this.classType = classType;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEnName() {
		return enName;
	}
	public void setEnName(String enName) {
		this.enName = enName;
	}
	public String getEnLastName() {
		return enLastName;
	}
	public void setEnLastName(String enLastName) {
		this.enLastName = enLastName;
	}
	public String getEnFirstName() {
		return enFirstName;
	}
	public void setEnFirstName(String enFirstName) {
		this.enFirstName = enFirstName;
	}
	public String getProfilePhoto1() {
		return profilePhoto1;
	}
	public void setProfilePhoto1(String profilePhoto1) {
		this.profilePhoto1 = profilePhoto1;
	}
	public String getFirstAdmissionDate() {
		return firstAdmissionDate;
	}
	public void setFirstAdmissionDate(String firstAdmissionDate) {
		this.firstAdmissionDate = firstAdmissionDate;
	}
	public String getIsClasspro() {
		return isClasspro;
	}
	public void setIsClasspro(String isClasspro) {
		this.isClasspro = isClasspro;
	}
	public String getProTourProAdmissionDate() {
		return proTourProAdmissionDate;
	}
	public void setProTourProAdmissionDate(String proTourProAdmissionDate) {
		this.proTourProAdmissionDate = proTourProAdmissionDate;
	}
	public String getProTourProNo() {
		return proTourProNo;
	}
	public void setProTourProNo(String proTourProNo) {
		this.proTourProNo = proTourProNo;
	}
	public String getClassProNo() {
		return classProNo;
	}
	public void setClassProNo(String classProNo) {
		this.classProNo = classProNo;
	}
	public String getNationCode() {
		return nationCode;
	}
	public void setNationCode(String nationCode) {
		this.nationCode = nationCode;
	}
	public String getProfileHome() {
		return profileHome;
	}
	public void setProfileHome(String profileHome) {
		this.profileHome = profileHome;
	}
	public String getIsProfileDobExp() {
		return isProfileDobExp;
	}
	public void setIsProfileDobExp(String isProfileDobExp) {
		this.isProfileDobExp = isProfileDobExp;
	}
	public String getProfileDob() {
		return profileDob;
	}
	public void setProfileDob(String profileDob) {
		this.profileDob = profileDob;
	}
	public String getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}
	public String getBirthMonth() {
		return birthMonth;
	}
	public void setBirthMonth(String birthMonth) {
		this.birthMonth = birthMonth;
	}
	public String getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	public String getProfileHeight() {
		return profileHeight;
	}
	public void setProfileHeight(String profileHeight) {
		this.profileHeight = profileHeight;
	}
	public String getProfileWeight() {
		return profileWeight;
	}
	public void setProfileWeight(String profileWeight) {
		this.profileWeight = profileWeight;
	}
	public String getWorkplaceAddress() {
		return workplaceAddress;
	}
	public void setWorkplaceAddress(String workplaceAddress) {
		this.workplaceAddress = workplaceAddress;
	}
	public String getWorkplaceDtlAddress() {
		return workplaceDtlAddress;
	}
	public void setWorkplaceDtlAddress(String workplaceDtlAddress) {
		this.workplaceDtlAddress = workplaceDtlAddress;
	}
	public String getWorkplaceName() {
		return workplaceName;
	}
	public void setWorkplaceName(String workplaceName) {
		this.workplaceName = workplaceName;
	}
	public String getTourProAdmissionDate() {
		return tourProAdmissionDate;
	}
	public void setTourProAdmissionDate(String tourProAdmissionDate) {
		this.tourProAdmissionDate = tourProAdmissionDate;
	}
	public String getPlayerContract() {
		return playerContract;
	}
	public void setPlayerContract(String playerContract) {
		this.playerContract = playerContract;
	}
	public String getIsSrixon() {
		return isSrixon;
	}
	public void setIsSrixon(String isSrixon) {
		this.isSrixon = isSrixon;
	}
	public String getTourId() {
		return tourId;
	}
	public void setTourId(String tourId) {
		this.tourId = tourId;
	}
	public String getNationCodeValue() {
		return nationCodeValue;
	}
	public void setNationCodeValue(String nationCodeValue) {
		this.nationCodeValue = nationCodeValue;
	}
	public String getDebut() {
		return debut;
	}
	public void setDebut(String debut) {
		this.debut = debut;
	}
	public Integer getWinCnt() {
		return winCnt;
	}
	public void setWinCnt(Integer winCnt) {
		this.winCnt = winCnt;
	}
	public String getMgBallName() {
		return mgBallName;
	}
	public void setMgBallName(String mgBallName) {
		this.mgBallName = mgBallName;
	}
	public String getMgBallCode() {
		return mgBallCode;
	}
	public void setMgBallCode(String mgBallCode) {
		this.mgBallCode = mgBallCode;
	}
	public String getMgBallSe() {
		return mgBallSe;
	}
	public void setMgBallSe(String mgBallSe) {
		this.mgBallSe = mgBallSe;
	}
	public String getMgBallScode() {
		return mgBallScode;
	}
	public void setMgBallScode(String mgBallScode) {
		this.mgBallScode = mgBallScode;
	}
	@Override
	public String toString() {
		return "MemberDTO [memberId=" + memberId + ", memberState=" + memberState + ", classType=" + classType
				+ ", userName=" + userName + ", enName=" + enName + ", enLastName=" + enLastName + ", enFirstName="
				+ enFirstName + ", profilePhoto1=" + profilePhoto1 + ", firstAdmissionDate=" + firstAdmissionDate
				+ ", isClasspro=" + isClasspro + ", proTourProAdmissionDate=" + proTourProAdmissionDate
				+ ", proTourProNo=" + proTourProNo + ", classProNo=" + classProNo + ", nationCode=" + nationCode
				+ ", profileHome=" + profileHome + ", isProfileDobExp=" + isProfileDobExp + ", profileDob=" + profileDob
				+ ", birthYear=" + birthYear + ", birthMonth=" + birthMonth + ", birthDay=" + birthDay
				+ ", profileHeight=" + profileHeight + ", profileWeight=" + profileWeight + ", workplaceAddress="
				+ workplaceAddress + ", workplaceDtlAddress=" + workplaceDtlAddress + ", workplaceName=" + workplaceName
				+ ", tourProAdmissionDate=" + tourProAdmissionDate + ", playerContract=" + playerContract
				+ ", isSrixon=" + isSrixon + ", tourId=" + tourId + ", nationCodeValue=" + nationCodeValue + ", debut="
				+ debut + ", winCnt=" + winCnt + ", mgBallName=" + mgBallName + ", mgBallCode=" + mgBallCode
				+ ", mgBallSe=" + mgBallSe + ", mgBallScode=" + mgBallScode + "]";
	}
	
	
	
	
}
