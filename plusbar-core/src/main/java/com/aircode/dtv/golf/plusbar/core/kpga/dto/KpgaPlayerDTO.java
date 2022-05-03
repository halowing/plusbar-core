package com.aircode.dtv.golf.plusbar.core.kpga.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(value = PropertyNamingStrategies.LowerCamelCaseStrategy.class)
public class KpgaPlayerDTO implements Serializable {

	private static final long serialVersionUID = 4945717672049066905L;
	
	private MemberDTO member;
	private ChartDTO chart;
	
	
	public MemberDTO getMember() {
		return member;
	}
	public void setMember(MemberDTO member) {
		this.member = member;
	}
	public ChartDTO getChart() {
		return chart;
	}
	public void setChart(ChartDTO chart) {
		this.chart = chart;
	}
	@Override
	public String toString() {
		return "KpgaPlayerDTO [member=" + member + ", chart=" + chart + "]";
	}
}
