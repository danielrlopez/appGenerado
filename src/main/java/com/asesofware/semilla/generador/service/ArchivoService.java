package com.asesofware.semilla.generador.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asesofware.semilla.generador.entity.ArchivoEntity;
import com.asesofware.semilla.generador.repository.IArchivoRepository;

@Service
public class ArchivoService implements IArchivoService{
	
	@Autowired
	private IArchivoRepository archivoRepository;

	@Override
	public List<ArchivoEntity> getAll() {
		
		return archivoRepository.findAll();
	}
	
	

}
