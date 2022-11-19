package com.albumteca.albumtecaApi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.albumteca.albumtecaApi.models.UsuarioModel;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, Integer>
{
	UsuarioModel findByEmail(String email);
	
	@Query(value = "SELECT * FROM PUBLIC.tb_usuario where email = :userEmail and senha = :userSenha", nativeQuery = true)
	UsuarioModel logar(String userEmail, String userSenha);
	
	@Query(value = "SELECT * FROM PUBLIC.tb_usuario where email = :userEmail and pergunta_seguranca = :userPerguntaSeguranca", nativeQuery = true)
	UsuarioModel novaSenha(String userEmail, String userPerguntaSeguranca);
}