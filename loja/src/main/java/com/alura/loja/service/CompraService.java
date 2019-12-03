package com.alura.loja.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alura.loja.client.FornecedorClient;
import com.alura.loja.controller.dto.CompraDTO;
import com.alura.loja.controller.dto.InfoFornecedorDTO;
import com.alura.loja.domain.Compra;
import com.alura.loja.dto.InfoPedidoDTO;

@Service
public class CompraService {

	private static final Logger LOG = LoggerFactory.getLogger(CompraService.class);

	@Autowired
	private FornecedorClient fornecedorClient;

	public Compra realizaCompra(CompraDTO compra) {
		String estado = compra.getEndereco().getEstado();

		LOG.info("buscando informações do fornecedor de {}", estado);
		InfoFornecedorDTO infoPorEstado = fornecedorClient.getInfoPorEstado(estado);

		LOG.info("Realizando o pedido");
		InfoPedidoDTO pedido = fornecedorClient.realizaCompra(compra.getItens());
		return new Compra(pedido.getId(), pedido.getTempoDePreparo(), infoPorEstado.getEndereco());
	}

}
