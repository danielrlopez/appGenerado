package com.asesofware.semilla.generador.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asesofware.semilla.generador.entity.ArchivoEntity;

public interface IArchivoRepository extends JpaRepository<ArchivoEntity, Integer> {

}
