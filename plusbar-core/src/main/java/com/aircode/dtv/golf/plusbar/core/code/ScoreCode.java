package com.aircode.dtv.golf.plusbar.core.code;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum ScoreCode {
	
	@JsonProperty("BOGEY+")
	BOGEY_PLUS, 
	BOGEY, 
	PAR, 
	BIRDIE, 
	BETTER

}
