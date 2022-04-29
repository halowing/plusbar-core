package com.aircode.dtv.golf.plusbar.core.dto;

import java.io.Serializable;

import com.aircode.dtv.golf.plusbar.core.code.ScoreCode;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * 각 홀별 PAR 수와 득득점 스코어 상세 정보 
 * 
 * @author "sgkim@aircode.com"
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.USE_DEFAULTS)
public class HoleScoreDetailDTO extends HoleScoreDTO implements Serializable {
	

	private static final long serialVersionUID = 1347582256881251125L;

	private Integer holeIdx;
	
	private ScoreCode scoreCode;

	public Integer getHoleIdx() {
		return holeIdx;
	}

	public void setHoleIdx(Integer holeIdx) {
		this.holeIdx = holeIdx;
	}

	public ScoreCode getScoreCode() {
		return scoreCode;
	}

	public void setScoreCode(ScoreCode scoreCode) {
		this.scoreCode = scoreCode;
	}

	@Override
	public String toString() {
		return "HoleScoreDetail [holeIdx=" + holeIdx + ", scoreCode=" + scoreCode + ", toString()=" + super.toString()
				+ "]";
	}

}
