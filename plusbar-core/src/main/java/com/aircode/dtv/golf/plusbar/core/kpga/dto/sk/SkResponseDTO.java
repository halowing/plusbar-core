package com.aircode.dtv.golf.plusbar.core.kpga.dto.sk;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(value = PropertyNamingStrategies.LowerCamelCaseStrategy.class)
public class SkResponseDTO<T> {

	private Integer code;
	private String message;
	private List<T> data;
	
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<T> getData() {
		return data;
	}
	public void setData(List<T> data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "SkResponseDTO [code=" + code + ", message=" + message + ", data=" + data + "]";
	}
	
	
}
