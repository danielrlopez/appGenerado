package com.asesofware.semilla.generador.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.asesofware.semilla.generador.dto.ArchivoDTO;
import com.asesofware.semilla.generador.entity.ArchivoEntity;

@Mapper(componentModel = "spring")//reconosca interfaz como bin para poder inyectar posteriormente 
public interface IArchivoMapper {
	
	//conversion 
	@Mappings({@Mapping(source = "id" , target = "identificador")})
	public ArchivoDTO entityToDto(ArchivoEntity archivoEntity);
	
	@Mappings({@Mapping(source = "identificador", target = "id")})
	public ArchivoEntity dtoToEntity(ArchivoDTO archivoDTO);
	
	public List<ArchivoDTO> listEntityToDto(List<ArchivoEntity> archivoEntity);
	public List<ArchivoEntity> listDtoToEntity(List<ArchivoDTO> archivoDTOs);
	

}
