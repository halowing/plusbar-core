package com.aircode.dtv.golf.plusbar.core.kpga.dto.sk;

import java.io.Serializable;

import com.aircode.dtv.golf.plusbar.core.kpga.dto.KpgaGameInfoDTO;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(value = PropertyNamingStrategies.LowerCamelCaseStrategy.class)
public class SkMstResponseDTO implements Serializable{

	private static final long serialVersionUID = -1553506395770457739L;
	
	private Integer code;
	private String message;
	private KpgaGameInfoDTO data;
	
	public Integer getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

	public KpgaGameInfoDTO getData() {
		return data;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setData(KpgaGameInfoDTO data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "SkMstResponseDTO [code=" + code + ", message=" + message + ", data=" + data + "]";
	}
	
	
	
}
