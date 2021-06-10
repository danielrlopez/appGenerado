package com.asesofware.semilla.generador.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.asesofware.semilla.generador.dto.ArchivoDTO;
import com.asesofware.semilla.generador.dto.UsuarioDTO;
import com.asesofware.semilla.generador.entity.UsuarioEntity;

@Mapper(componentModel = "spring")
public interface IUsuarioMapper {
	
	public UsuarioEntity dtoToEntity(UsuarioDTO usuarioDTO);
	public UsuarioDTO entityToDto (UsuarioEntity usuarioEntity);
	public List<UsuarioDTO> listEntityToDto(List<UsuarioEntity> archivoEntity);

}
