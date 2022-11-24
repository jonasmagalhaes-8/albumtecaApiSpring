package com.albumteca.albumtecaApi.dto;

import com.albumteca.albumtecaApi.models.AlbumModel;

public class AlbumDTO
{
	private Integer id;
	
	private String album;
	
	private String artista;
	
	private String genero;
	
	private Byte flagNacional;
	
	private Byte flagDestaque;
	
	private Integer mesEscutado;
	
	private Integer anoEscutado;

	public AlbumDTO(AlbumModel albumModel) {
		this.id = albumModel.getId();
		this.album = albumModel.getAlbum();
		this.artista = albumModel.getArtista();
		this.genero = albumModel.getGenero();
		this.flagNacional = albumModel.getFlagNacional();
		this.flagDestaque = albumModel.getFlagDestaque();
		this.mesEscutado = albumModel.getMesEscutado();
		this.anoEscutado = albumModel.getAnoEscutado();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Byte getFlagNacional() {
		return flagNacional;
	}

	public void setFlagNacional(Byte flagNacional) {
		this.flagNacional = flagNacional;
	}

	public Byte getFlagDestaque() {
		return flagDestaque;
	}

	public void setFlagDestaque(Byte flagDestaque) {
		this.flagDestaque = flagDestaque;
	}

	public int getMesEscutado() {
		return mesEscutado;
	}

	public void setMesEscutado(int mesEscutado) {
		this.mesEscutado = mesEscutado;
	}

	public Integer getAnoEscutado() {
		return anoEscutado;
	}

	public void setAnoEscutado(Integer anoEscutado) {
		this.anoEscutado = anoEscutado;
	}
}
