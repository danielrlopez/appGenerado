package com.asesofware.semilla.generador.entity;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@Table(name = "archivos")
public class ArchivoEntity {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)// persistir objetos, columna generada automaticamente 
	@Column(name = "id")
	private Integer id;
	
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "usuario_creador")
	private Integer usuarioCreador;
	
	//conversion fecha de forma correcta 
	@Column(name = "fecha")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;
	
	@Column(name = "hora")
	@Temporal(TemporalType.TIME)
	private Date hora;
	

}
