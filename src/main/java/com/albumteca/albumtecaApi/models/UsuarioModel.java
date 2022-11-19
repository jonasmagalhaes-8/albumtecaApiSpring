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
@Table(name = "tb_usuario")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class UsuarioModel implements Serializable {
	
	private static final long serialVersion = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario_generator")
	@SequenceGenerator(name = "usuario_generator", sequenceName = "public.tb_usuario_seq", allocationSize = 1)
	private Integer usuarioId;
	
	private String email;
	
	private String senha;
	
	private String perguntaSeguranca;
	
	public Integer getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Integer usuarioId) {
		this.usuarioId = usuarioId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getPerguntaSeguranca() {
		return perguntaSeguranca;
	}

	public void setPerguntaSeguranca(String perguntaSeguranca) {
		this.perguntaSeguranca = perguntaSeguranca;
	}

	@Override
	public int hashCode() {
		return Objects.hash(usuarioId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsuarioModel other = (UsuarioModel) obj;
		return Objects.equals(usuarioId, other.usuarioId);
	}
}
