package com.albumteca.albumtecaApi.dto;

public class EstatisticaDTORequest {

	String tipo;
	
	Integer usuario;
		
	String anoEscutado;
		
	public EstatisticaDTORequest()
	{
		
	}
	
	public Integer getUsuario() {
		return usuario;
	}

	public void setUsuario(Integer usuario) {
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
