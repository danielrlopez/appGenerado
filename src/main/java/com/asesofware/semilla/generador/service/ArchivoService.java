package com.asesofware.semilla.generador.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.asesofware.semilla.generador.dto.ArchivoDTO;
import com.asesofware.semilla.generador.dto.ResponseDTO;
import com.asesofware.semilla.generador.entity.ArchivoEntity;
import com.asesofware.semilla.generador.mapper.IArchivoMapper;
import com.asesofware.semilla.generador.repository.IArchivoRepository;

@Service
public class ArchivoService implements IArchivoService{
	@Autowired
	private IArchivoMapper mapperArchivo;
	
	@Autowired
	private IArchivoRepository archivoRepository;

	
	@Override
	public List<ArchivoEntity> getAll() {
		
		return archivoRepository.findAll();
	}

	@Override
	public ArchivoDTO buscarPorId(Integer id) {
		Optional<ArchivoEntity> archivoEntity = archivoRepository.findById(id);
		
		return mapperArchivo.entityToDto(archivoEntity.get());
	}

	@Override
	public ArchivoDTO crearArchivo(ArchivoDTO archivoDTO) {
	
		ArchivoEntity archivoEntity = mapperArchivo.dtoToEntity(archivoDTO);
		
		return mapperArchivo.entityToDto(archivoRepository.save(archivoEntity));
	}

	//consultar usuario creador por id
	
	@Override
	public ResponseDTO consultarTodosCreador(Integer usuarioCreador) {

		
		List<ArchivoDTO> lisArchivoDTOs= mapperArchivo.listEntityToDto(archivoRepository.findByUsuarioCreador(usuarioCreador));
		
		
		return new ResponseDTO(lisArchivoDTOs, true, "ok", HttpStatus.OK);
	}

	@Override
	public ResponseDTO consultarTodosNombre(String nombreUsuario) {
		List<ArchivoDTO> lisArchivoDTOs= mapperArchivo.listEntityToDto(archivoRepository.queryUsuarioCreadorNombre(nombreUsuario));
		return new ResponseDTO(lisArchivoDTOs, true, "ok", HttpStatus.OK);
	}
	
	

}
