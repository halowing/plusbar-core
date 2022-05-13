package com.aircode.dtv.golf.plusbar.core.vo;


public class ProviderVO {
	
	private String providerId;
	
	private String providerName;
	
	private String apiKey;
	
	
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
	@Override
	public String toString() {
		return "ApiKeyEntity [providerId=" + providerId + ", providerName=" + providerName + ", apiKey=" + apiKey + "]";
	}
	
	
}
