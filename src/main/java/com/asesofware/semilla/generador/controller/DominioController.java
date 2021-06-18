package com.asesofware.semilla.generador.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asesofware.semilla.generador.dto.DominioDTO;
import com.asesofware.semilla.generador.dto.ResponseDTO;
import com.asesofware.semilla.generador.integracion.DominioIntegracion;
import com.asesofware.semilla.generador.integracion.IDominioCliente;



@RestController
@RequestMapping(path = "/api/v1/dominio")
public class DominioController {
	
	
	private static final Logger logger  = LoggerFactory.getLogger(DominioController.class);
	
	@Autowired
	private DominioIntegracion dominioService;
	
	@Autowired
	private IDominioCliente dominioCliente;
	
	
	@PostMapping(path = "/todos", consumes = "application/json",produces = "application/json")
	public ResponseDTO getDominio(@RequestBody DominioDTO dto ) {
		
		logger.info("ingreso getDominio dominioCliente: {}",dto);
		
		return dominioCliente.getDominio(dto);
	}

}