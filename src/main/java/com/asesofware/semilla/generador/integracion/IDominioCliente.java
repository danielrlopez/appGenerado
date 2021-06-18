package com.asesofware.semilla.generador.integracion;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.asesofware.semilla.generador.dto.DominioDTO;
import com.asesofware.semilla.generador.dto.ResponseDTO;



@FeignClient(name = "dominio",url = "${url.dominio.integracion}")
public interface IDominioCliente {

	@PostMapping("/api/dominios")
	public ResponseDTO getDominio(@RequestBody DominioDTO dominioDTO);
	
}
