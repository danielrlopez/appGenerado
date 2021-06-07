package com.asesofware.semilla.generador.service;

import java.util.List;

import com.asesofware.semilla.generador.entity.UsuarioEntity;

public interface IUsuarioService {
	//consultar todos los usuarios
	public List<UsuarioEntity> getAll();
	
	//consutar un usuario por ID
	
	public UsuarioEntity getUsuarioById(Integer id);
	
	// devolver un usuario y recibe una entidad de tipo usuario 
	public UsuarioEntity createUser(UsuarioEntity usuarioEntity);
	
	public UsuarioEntity updateUser(UsuarioEntity usuarioEntity);
	
	public void deleteUser(Integer id);
	

}
