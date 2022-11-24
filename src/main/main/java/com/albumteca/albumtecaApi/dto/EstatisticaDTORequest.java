package com.albumteca.albumtecaApi.dto;

import com.albumteca.albumtecaApi.models.UsuarioModel;

public class EstatisticaDTORequest {

	String tipo;
	
	UsuarioModel usuario;
		
	String anoEscutado;
		
	public EstatisticaDTORequest()
	{
		
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
}
