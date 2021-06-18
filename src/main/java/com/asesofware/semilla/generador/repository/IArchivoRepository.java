package com.asesofware.semilla.generador.repository;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.asesofware.semilla.generador.dto.ArchivoDTO;
import com.asesofware.semilla.generador.entity.ArchivoEntity;

public interface IArchivoRepository extends JpaRepository<ArchivoEntity, Integer> {
	
	List<ArchivoEntity> findByUsuarioCreador(Integer usuarioCreador);
	
	@Query("SELECT t FROM ArchivoEntity t WHERE t.usuarioCreador = ?1")
	List<ArchivoEntity> queryUsuarioCreador(Integer usuarioCreador);
	
	@Query("SELECT t FROM ArchivoEntity t , UsuarioEntity u WHERE t.usuarioCreador = u.id AND u.nombre like %?1%")
	List<ArchivoEntity> queryUsuarioCreadorNombre(String nombreUsuario);
	
	// Nativa
		@Query(nativeQuery = true , value = "Select * from archivos  where usuario_creador = :id")
		List<ArchivoEntity> queryUsuarioCreadorNativo(@Param("id") Integer usuarioCreador);
		



	//@Query("SELECT new com.asesoftware.semilla.generador.dto.ArchivoDTO(t.id,t.nombre,t.usuarioCreador,t.fecha, t.hora,u.nombre)"
	//		+ " FROM ArchivoEntity t , UsuarioEntity u "
	//		+ "WHERE t.usuarioCreador = u.id AND u.nombre like %?1%")
	//List<ArchivoDTO> queryUsuarioCreadorDTO(String nombreUsuario);
	
	
	
	
}
