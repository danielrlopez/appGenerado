package com.asesofware.semilla.generador.dto;


import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;

import lombok.Data;

@Data
public class ArchivoDTO {
	
	private Integer identificador;
	private String nombre;
	
	private Integer usuarioCreador;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy/MM/dd", timezone = "America/New_York")
	private Date fecha;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "HH:mm:ss", timezone = "America/New_York")
	private Date hora;
	

}
