package com.asesofware.semilla.generador.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.asesofware.semilla.generador.dto.ResponseDTO;
import com.asesofware.semilla.generador.dto.UsuarioDTO;
import com.asesofware.semilla.generador.entity.UsuarioEntity;
import com.asesofware.semilla.generador.service.IUsuarioService;

@RestController
@RequestMapping(path = "/api/v1/usuario")

public class UsuarioController {
	
	//crear logs
	private static final Logger logger = LoggerFactory.getLogger(UsuarioController.class);
	
	@Autowired
	private IUsuarioService usuarioService;
	

	/// listar todos//
	
	@GetMapping(path = "/all")
	public ResponseDTO getAll(){
		return usuarioService.getAll();
	}
	
	// listar un usuario por ID
	// se tiene que coincidir el nombre del parametro
	@GetMapping(path = "/usuario/{id}")
	public ResponseDTO getUsuarioById(@PathVariable Integer id) {
		
		return usuarioService.getUsuarioById(id);
	}
	
	//sin poner el parametro por la URL desde getMapin 
	
	@GetMapping(path = "/usuario")
	public ResponseDTO getUsuarioParametroById(@RequestParam Integer id) {
		
		return usuarioService.getUsuarioById(id);
	}
	
	
	// crear usuarios 
	
	@PostMapping(path = "/crear", consumes = "application/json",produces = "application/json")
	
	public ResponseDTO createUser(@RequestBody UsuarioDTO entity) {
		
			return usuarioService.createUser(entity);
			
		
		
		
	}
	
	//editar usuarios 
	
	@PostMapping(path = "/editar", consumes = "application/json",produces = "application/json")
	
	public ResponseDTO editarUser(@RequestBody UsuarioDTO entity) {
		
			return usuarioService.updateUser(entity);
			
				
	}
	// eliminar usuario por ID
	
	@GetMapping(path = "/delete/{id}")
	public ResponseDTO eliminarUsuario(@PathVariable Integer id) {
		 logger.info("ingreso al metodo eliminarUsuario");
		 
		 logger.info("usuario a eliminar{}",id);
		return usuarioService.deleteUser(id);
		
		
	}
	
	
	
	
}
