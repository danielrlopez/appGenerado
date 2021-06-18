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

import com.asesofware.semilla.generador.dto.ArchivoDTO;
import com.asesofware.semilla.generador.dto.ResponseDTO;
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
	
	@GetMapping(path = "/{id}")
	public ArchivoDTO buscarPorId(@PathVariable Integer id){
		return archivoService.buscarPorId(id);
	}
	
	@PostMapping(path = "/crear", consumes = "application/json",produces = "application/json")
	public ArchivoDTO crearArchivo(@RequestBody ArchivoDTO dto) {
		return archivoService.crearArchivo(dto);
	}
	
	
	// consuktar nuestro archivos por usuario creador 
	@GetMapping(path = "/todos/{usuarioCreador}")
	public ResponseDTO consultarTodosCreador(@PathVariable Integer usuarioCreador){
		return archivoService.consultarTodosCreador(usuarioCreador);
	}
	
	
	// consuktar archivos por nombre del usuario
	@GetMapping(path = "/usuario")
	public ResponseDTO consultarTodosNombre(@RequestParam String nombreUsuario){
		return archivoService.consultarTodosNombre(nombreUsuario);

	}
	

}
