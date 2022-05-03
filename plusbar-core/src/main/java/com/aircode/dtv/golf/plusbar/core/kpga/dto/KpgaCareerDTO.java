package com.aircode.dtv.golf.plusbar.core.kpga.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(value = PropertyNamingStrategies.LowerCamelCaseStrategy.class)
public class KpgaCareerDTO implements Serializable {

	private static final long serialVersionUID = -5550990295931548757L;
	
	private String memberId;
	private String winner;  			// 우승기록
	private String award;				// 수상경력
	private String national;			// 대표경력
	private String record;
	private String resume;
	private String individual;			// 개인이력
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getWinner() {
		return winner;
	}
	public void setWinner(String winner) {
		this.winner = winner;
	}
	public String getAward() {
		return award;
	}
	public void setAward(String award) {
		this.award = award;
	}
	public String getNational() {
		return national;
	}
	public void setNational(String national) {
		this.national = national;
	}
	public String getRecord() {
		return record;
	}
	public void setRecord(String record) {
		this.record = record;
	}
	public String getResume() {
		return resume;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}
	public String getIndividual() {
		return individual;
	}
	public void setIndividual(String individual) {
		this.individual = individual;
	}
	@Override
	public String toString() {
		return "KpgaCareerDTO [memberId=" + memberId + ", winner=" + winner + ", award=" + award + ", national="
				+ national + ", record=" + record + ", resume=" + resume + ", individual=" + individual + "]";
	}
	
	
}
