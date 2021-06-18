package com.asesofware.semilla.generador.service;

import java.util.List;

import com.asesofware.semilla.generador.dto.ArchivoDTO;
import com.asesofware.semilla.generador.dto.ResponseDTO;
import com.asesofware.semilla.generador.entity.ArchivoEntity;

public interface IArchivoService {
	
	public List<ArchivoEntity> getAll();
	public ArchivoDTO buscarPorId(Integer id);
	public ArchivoDTO crearArchivo(ArchivoDTO archivoDTO);
	
	public ResponseDTO consultarTodosCreador(Integer usuarioCreador);
	public ResponseDTO consultarTodosNombre(String nombreUsuario);
	

}
