package com.albumteca.albumtecaApi.dto;

import com.albumteca.albumtecaApi.models.UsuarioModel;

public class estatisticaDTO {

	String tipo;
	
	UsuarioModel usuario;
		
	String anoEscutado;
	
	String ranking;
	
	public estatisticaDTO()
	{
		
	}
	
	public estatisticaDTO(String ranking) {
		super();
		this.ranking = ranking;
	}

	public UsuarioModel getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioModel usuario) {
		this.usuario = usuario;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getAnoEscutado() {
		return anoEscutado;
	}

	public void setAnoEscutado(String anoEscutado) {
		this.anoEscutado = anoEscutado;
	}

	public String getRanking() {
		return ranking;
	}

	public void setRanking(String ranking) {
		this.ranking = ranking;
	}		
}
