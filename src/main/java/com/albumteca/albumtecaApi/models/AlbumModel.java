package com.albumteca.albumtecaApi.models;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_album")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class AlbumModel implements Serializable {
	
	private static final long serialVersion = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "album_generator")
	@SequenceGenerator(name = "album_generator", sequenceName = "public.tb_album_seq", allocationSize = 1)
	private Integer id;
	
	private String album;
	
	private String artista;
	
	private String genero;
	
	private Byte flagNacional;
	
	private Byte flagDestaque;
	
	private Integer mesEscutado;
	
	private Integer anoEscutado;
		
	private Integer usuarioId;
	
	public AlbumModel()
	{
		
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

	public Integer getAnoEscutado() {
		return anoEscutado;
	}

	public void setAnoEscutado(Integer anoEscutado) {
		this.anoEscutado = anoEscutado;
	}
	
	public Integer getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Integer usuarioId) {
		this.usuarioId = usuarioId;
	}

	public Integer getMesEscutado() {
		return mesEscutado;
	}

	public void setMesEscutado(Integer mesEscutado) {
		this.mesEscutado = mesEscutado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AlbumModel other = (AlbumModel) obj;
		return Objects.equals(id, other.id);
	}
}
