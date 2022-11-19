package com.albumteca.albumtecaApi.services;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.albumteca.albumtecaApi.dto.AlbumDTO;
import com.albumteca.albumtecaApi.dto.EstatisticaDTORequest;
import com.albumteca.albumtecaApi.dto.EstatisticaDTOResponse;
import com.albumteca.albumtecaApi.dto.ResultDTO;
import com.albumteca.albumtecaApi.models.AlbumModel;
import com.albumteca.albumtecaApi.repositories.AlbumRepository;

@Service
public class AlbumService
{
	@Autowired
	private AlbumRepository repository;
	
	@Transactional(readOnly = true)
	public EstatisticaDTOResponse contaEstatisticasUser(EstatisticaDTORequest estatisticas)
	{
	    String ranking = "";
		
	    List<Object[]> list;
	    
	    int i=1;
	    
	    if(estatisticas.getTipo().equals("artista"))
	    {
	    	if(estatisticas.getAnoEscutado().equals("Todos"))
	    	list = repository.contaEstatisticasArtista(estatisticas.getUsuario().getUsuarioId());
	    	else
	    	list = repository.contaEstatisticasArtistaAno(estatisticas.getUsuario().getUsuarioId(), Integer.parseInt(estatisticas.getAnoEscutado()));	
	    }
	    else
	    {
	    	if(estatisticas.getAnoEscutado().equals("Todos"))
	    	list = repository.contaEstatisticasGenero(estatisticas.getUsuario().getUsuarioId());
	    	else
	    	list = repository.contaEstatisticasGeneroAno(estatisticas.getUsuario().getUsuarioId(), Integer.parseInt(estatisticas.getAnoEscutado()));	
	    }
	    
	    for (Object[] resultColumn : list)
	    {
	    	ranking += i+"º - " + resultColumn[0] + " - " + resultColumn[1] + "\n";
	    	i++;
	    }
	  		    
		return new EstatisticaDTOResponse(ranking);
	}
	
	@Transactional(readOnly = true)
	public List<AlbumDTO> getAlbunsByUser(Integer usuarioId)
	{ 
		List<AlbumModel> albuns = repository.getAlbunsByUser(usuarioId);
				
		return albuns.stream().map(x -> new AlbumDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional
	public ResultDTO insert(AlbumModel model)
	{
		AlbumModel album = repository.save(model);
		
		ResultDTO sucesso = new ResultDTO(0);
		
		if(album!=null)
		sucesso.setResult(1);
		
		return sucesso;
	}

	@Transactional
	public ResultDTO update(AlbumModel updatedModel)
	{
		AlbumModel album = repository.getReferenceById(updatedModel.getId());
		
		BeanUtils.copyProperties(updatedModel, album, "id");
				
		album = repository.save(album);
		
		ResultDTO sucesso = new ResultDTO(0);
		
		if(album!=null)
		sucesso.setResult(1);
		
		return sucesso;
	}

	public void delete(Integer id)
	{ repository.deleteById(id); }
}