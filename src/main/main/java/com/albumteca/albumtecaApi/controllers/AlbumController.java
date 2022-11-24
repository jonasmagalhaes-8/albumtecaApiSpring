package com.albumteca.albumtecaApi.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.albumteca.albumtecaApi.dto.AlbumDTO;
import com.albumteca.albumtecaApi.dto.EstatisticaDTORequest;
import com.albumteca.albumtecaApi.dto.EstatisticaDTOResponse;
import com.albumteca.albumtecaApi.dto.ResultDTO;
import com.albumteca.albumtecaApi.models.AlbumModel;
import com.albumteca.albumtecaApi.services.AlbumService;

@RestController
@RequestMapping(value = "/albuns")
public class AlbumController {

	@Autowired
	private AlbumService service;
	
	@PostMapping("/getestatisticas")
	public ResponseEntity<EstatisticaDTOResponse> contaEstatisticas(@RequestBody EstatisticaDTORequest dto)
	{ return ResponseEntity.ok().body(service.contaEstatisticasUser(dto)); }
			
	@PostMapping
	public ResponseEntity<ResultDTO> insert(@RequestBody AlbumModel album)
	{ return ResponseEntity.ok().body(service.insert(album)); }
	
	@PutMapping
	public ResponseEntity<ResultDTO> update(@RequestBody AlbumModel dto)
	{ return ResponseEntity.ok().body(service.update(dto)); }
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Integer id)
	{ 
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	@GetMapping(value = "/{iduser}")
	public ResponseEntity<List<AlbumDTO>> getAlbunsByUser (@PathVariable Integer iduser)
	{ return ResponseEntity.ok().body(service.getAlbunsByUser(iduser)); }
}