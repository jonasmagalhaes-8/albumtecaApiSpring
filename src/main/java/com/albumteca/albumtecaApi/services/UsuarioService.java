package com.albumteca.albumtecaApi.services;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.albumteca.albumtecaApi.dto.ResultDTO;
import com.albumteca.albumtecaApi.dto.UsuarioLoginDTO;
import com.albumteca.albumtecaApi.models.UsuarioModel;
import com.albumteca.albumtecaApi.repositories.UsuarioRepository;

@Service
public class UsuarioService
{
	@Autowired
	private UsuarioRepository repository;
		
	@Transactional
	public UsuarioLoginDTO insert(UsuarioModel model)
	{
		UsuarioLoginDTO usuarioId = new UsuarioLoginDTO(0);
		
		if(repository.findByEmail(model.getEmail())==null)
		usuarioId.setId(repository.save(model).getUsuarioId());
		
		return usuarioId;
	}

	@Transactional(readOnly = true)
	public UsuarioLoginDTO logar(UsuarioModel model)
	{
		UsuarioLoginDTO usuarioId = new UsuarioLoginDTO(0);
		
		UsuarioModel usuario = repository.logar(model.getEmail(), model.getSenha());
		
		if(usuario!=null)
		usuarioId.setId(usuario.getUsuarioId());
		
		return usuarioId;
	}
	
	@Transactional
	public ResultDTO updateSenha(UsuarioModel usuario)
	{
		UsuarioModel model = repository.novaSenha(usuario.getEmail(), usuario.getPerguntaSeguranca());
		
		ResultDTO sucesso = new ResultDTO(0);
		
		if(model!=null)
		{
			BeanUtils.copyProperties(usuario, model, "usuarioId");
			model = repository.save(model);
			sucesso.setResult(1);
		}
							
		return sucesso;
	}
}