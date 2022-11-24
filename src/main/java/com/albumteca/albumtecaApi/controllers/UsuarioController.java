package com.albumteca.albumtecaApi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.albumteca.albumtecaApi.dto.ResultDTO;
import com.albumteca.albumtecaApi.dto.UsuarioLoginDTO;
import com.albumteca.albumtecaApi.models.UsuarioModel;
import com.albumteca.albumtecaApi.services.UsuarioService;

@RestController
@CrossOrigin
@RequestMapping(value = "/usuarios")
public class UsuarioController
{
	@Autowired
	private UsuarioService service;
	
	@PostMapping("/logar")
	public ResponseEntity<UsuarioLoginDTO> logar(@RequestBody UsuarioModel usuario)
	{ return ResponseEntity.ok().body(service.logar(usuario)); }
			
	@PostMapping
	public ResponseEntity<UsuarioLoginDTO> insert(@RequestBody UsuarioModel usuario)
	{ return ResponseEntity.ok().body(service.insert(usuario)); }
	
	@PutMapping("/updatesenha")
	public ResponseEntity<ResultDTO> updateSenha(@RequestBody UsuarioModel usuario)
	{ return ResponseEntity.ok().body(service.updateSenha(usuario)); }
	
}