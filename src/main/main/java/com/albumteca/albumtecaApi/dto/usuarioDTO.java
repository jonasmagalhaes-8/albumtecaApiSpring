package com.albumteca.albumtecaApi.dto;

public class usuarioDTO {

	Integer userId;

	public usuarioDTO()
	{
		
	}
	
	public usuarioDTO(Integer userId) {
		this.userId = userId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}	
}
