package com.asesofware.semilla.generador.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.asesofware.semilla.generador.entity.UsuarioEntity;
import com.asesofware.semilla.generador.service.IUsuarioService;

@RestController
@RequestMapping(path = "/api/v1/usuario")

public class UsuarioController {
	
	@Autowired
	private IUsuarioService usuarioService;
	

	/// listar todos//
	
	@GetMapping(path = "/all")
	public List<UsuarioEntity> getAll(){
		return usuarioService.getAll();
	}
	
	// listar un usuario por ID
	// se tiene que coincidir el nombre del parametro
	@GetMapping(path = "/usuario/{id}")
	public UsuarioEntity getUsuarioById(@PathVariable Integer id) {
		
		return usuarioService.getUsuarioById(id);
	}
	
	//sin poner el parametro por la URL desde getMapin 
	
	@GetMapping(path = "/usuario")
	public UsuarioEntity getUsuarioParametroById(@RequestParam Integer id) {
		
		return usuarioService.getUsuarioById(id);
	}
	
	
	// crear usuarios 
	
	@PostMapping(path = "/crear", consumes = "application/json",produces = "application/json")
	
	public UsuarioEntity createUser(@RequestBody UsuarioEntity entity) {
		
		try {
			return usuarioService.createUser(entity);
			
		}catch (Exception e) {
			return null;
		}
		
		
	}
	
	//editar usuarios 
	
	@PostMapping(path = "/editar", consumes = "application/json",produces = "application/json")
	
	public UsuarioEntity editarUser(@RequestBody UsuarioEntity entity) {
		
			return usuarioService.updateUser(entity);
			
				
	}
	// eliminar usuario por ID
	
	@GetMapping(path = "/delete/{id}")
	public void eliminarUsuario(@PathVariable Integer id) {
		
		usuarioService.deleteUser(id);
		
		
	}
	
	
	
	
}
