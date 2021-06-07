package com.asesofware.semilla.generador.entity;

import java.util.List;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "usuario")

public class UsuarioEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)// persistir objetos, columna generada automaticamente 
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellido")
	private String apellido;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "username")
	private String username;

	/// get y sets generados automaticamente// click derecho - source - generar get and sets ya son automaticos con @data
	
	// la relacion de uno a muchos en este caso simplemente con esta relacion ya consulta la relacion entre usuarios y los archivos que tiene
	//ojo con las relaciones 
	@OneToMany(mappedBy = "usuarioCreador")//poner el nombre de la relacion de la tabla 
	private List<ArchivoEntity> archivos;
	
	
	

}
