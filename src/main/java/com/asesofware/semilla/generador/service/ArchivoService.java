package com.asesofware.semilla.generador.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asesofware.semilla.generador.dto.ArchivoDTO;
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
	
	

}
