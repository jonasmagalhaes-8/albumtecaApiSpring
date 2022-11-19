package com.albumteca.albumtecaApi.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.albumteca.albumtecaApi.models.AlbumModel;

@Repository
public interface AlbumRepository extends JpaRepository<AlbumModel, Integer>
{
		
	@Query(value = "SELECT genero, count(genero) as qt, usuario_id FROM PUBLIC.tb_album where usuario_id = :userId GROUP BY genero, usuario_id order by qt DESC", nativeQuery = true)
	public List<Object[]> contaEstatisticasGenero(@Param("userId") Integer userId);
	
	@Query(value = "SELECT artista, count(artista) as qt, usuario_id FROM PUBLIC.tb_album where usuario_id = :userId GROUP BY artista, usuario_id order by qt DESC", nativeQuery = true)
	public List<Object[]> contaEstatisticasArtista(@Param("userId") Integer userId);
	
	@Query(value = "SELECT genero, count(genero) as qt, usuario_id FROM PUBLIC.tb_album where usuario_id = :userId AND ano_escutado = :anoEscutado GROUP BY genero, usuario_id order by qt DESC", nativeQuery = true)
	public List<Object[]> contaEstatisticasGeneroAno(@Param("userId") Integer userId, @Param("anoEscutado") int anoEscutado);
	
	@Query(value = "SELECT artista, count(artista) as qt, usuario_id FROM PUBLIC.tb_album where usuario_id = :userId AND ano_escutado = :anoEscutado GROUP BY artista, usuario_id order by qt DESC", nativeQuery = true)
	public List<Object[]> contaEstatisticasArtistaAno(@Param("userId") Integer userId, @Param("anoEscutado") int anoEscutado);
	
	@Query(value = "SELECT * FROM PUBLIC.tb_album where usuario_id = :userId order by id", nativeQuery = true)
	public List<AlbumModel> getAlbunsByUser(@Param("userId") Integer userId);
}