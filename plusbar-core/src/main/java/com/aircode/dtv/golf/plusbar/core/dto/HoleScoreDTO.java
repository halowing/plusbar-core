package com.aircode.dtv.golf.plusbar.core.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * 각 홀별 PAR 수와 득득점 스코어 정보
 * 
 * @author "sgkim@aircode.com"
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.USE_DEFAULTS)
public class HoleScoreDTO implements Serializable {
	
	private static final long serialVersionUID = -7510047232475245801L;

	private int par;
	
	private String score;

	public int getPar() {
		return par;
	}

	public void setPar(int par) {
		this.par = par;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "HoleScore [par=" + par + ", score=" + score + "]";
	}
	
	

}
