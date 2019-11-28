package com.alura.loja.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.alura.loja.controller.dto.CompraDTO;
import com.alura.loja.controller.dto.InfoFornecedorDTO;

@Service
public class CompraService {

	@Autowired
	private RestTemplate client;

	public void realizaCompra(CompraDTO compra) {
		ResponseEntity<InfoFornecedorDTO> exchange = client.exchange(
				"http://localhost:8081/info/" + compra.getEndereco().getEstado(), HttpMethod.GET, null,
				InfoFornecedorDTO.class);
		System.out.println(exchange);
	}

}
