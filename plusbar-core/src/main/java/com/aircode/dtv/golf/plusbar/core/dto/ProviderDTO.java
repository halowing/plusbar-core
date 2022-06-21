package com.aircode.dtv.golf.plusbar.core.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

import com.aircode.dtv.golf.plusbar.core.vo.ProviderVO;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ProviderDTO implements Serializable {
	
	@NotBlank(message = "접속자 ID는 필수 정보입니다.")
	private String providerId;
	
	@NotBlank(message = "접속자 명은 필수 정보 입니다.")
	private String providerName;
	
	private String apiKey;

	private static final long serialVersionUID = -5298302214692445025L;
	
	public ProviderDTO () {}
	public ProviderDTO(ProviderVO vo){
		setProviderId(vo.getProviderId());
		setProviderName(vo.getProviderName());
		setApiKey(vo.getApiKey());
	}
	@Override
	public String toString() {
		return "ProviderDTO [providerId=" + providerId + ", providerName=" + providerName + ", apiKey=" + apiKey + "]";
	}
	public String getProviderId() {
		return providerId;
	}
	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}
	public String getProviderName() {
		return providerName;
	}
	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}
	public String getApiKey() {
		return apiKey;
	}
	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}
	
	
}
