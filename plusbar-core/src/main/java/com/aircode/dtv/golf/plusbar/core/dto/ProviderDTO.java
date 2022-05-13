package com.aircode.dtv.golf.plusbar.core.dto;

import java.io.Serializable;

import com.aircode.dtv.golf.plusbar.core.vo.ProviderVO;

public class ProviderDTO extends ProviderVO implements Serializable {

	private static final long serialVersionUID = -5298302214692445025L;
	
	public ProviderDTO () {}
	public ProviderDTO(ProviderVO vo){
		setProviderId(vo.getProviderId());
		setProviderName(vo.getProviderName());
		setApiKey(vo.getApiKey());
	}
}
