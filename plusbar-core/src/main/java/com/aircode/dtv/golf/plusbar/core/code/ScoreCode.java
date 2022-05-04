package com.aircode.dtv.golf.plusbar.core.code;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum ScoreCode {
	
	BETTER,
	BIRDIE,
	PAR, 
	BOGEY, 
	
	@JsonProperty("BOGEY+")
	BOGEY_PLUS
}
