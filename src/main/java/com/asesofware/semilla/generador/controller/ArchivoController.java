package com.asesofware.semilla.generador.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asesofware.semilla.generador.entity.ArchivoEntity;
import com.asesofware.semilla.generador.service.IArchivoService;

@RestController
@RequestMapping(path = "/api/v1/archivo")

public class ArchivoController {
	@Autowired
	private IArchivoService archivoService;
	
	@GetMapping(path = "/todos")
	public List<ArchivoEntity> consultarTodos(){
		return archivoService.getAll();
	}
	
	
	

}
