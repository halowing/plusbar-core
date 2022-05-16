package com.aircode.dtv.golf.plusbar.core.dto;

import java.io.Serializable;

import com.aircode.dtv.golf.plusbar.core.vo.ProviderVO;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ProviderDTO extends ProviderVO implements Serializable {

	private static final long serialVersionUID = -5298302214692445025L;
	
	public ProviderDTO () {}
	public ProviderDTO(ProviderVO vo){
		setProviderId(vo.getProviderId());
		setProviderName(vo.getProviderName());
		setApiKey(vo.getApiKey());
	}
}
