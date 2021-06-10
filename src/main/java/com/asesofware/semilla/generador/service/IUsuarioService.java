package com.asesofware.semilla.generador.service;

import java.util.List;

import com.asesofware.semilla.generador.dto.ResponseDTO;
import com.asesofware.semilla.generador.dto.UsuarioDTO;
import com.asesofware.semilla.generador.entity.UsuarioEntity;

public interface IUsuarioService {
	//consultar todos los usuarios
	public ResponseDTO getAll();
	
	//consutar un usuario por ID
	
	public ResponseDTO getUsuarioById(Integer id);
	
	// devolver un usuario y recibe una entidad de tipo usuario 
	public ResponseDTO createUser(UsuarioDTO usuarioDTO);
	
	public ResponseDTO updateUser(UsuarioDTO usuarioDTO);
	
	public ResponseDTO deleteUser(Integer id);
	

}
