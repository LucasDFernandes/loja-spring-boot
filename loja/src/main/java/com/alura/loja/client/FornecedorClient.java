package com.alura.loja.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alura.loja.controller.dto.InfoFornecedorDTO;
import com.alura.loja.controller.dto.ItemDaCompraDTO;
import com.alura.loja.dto.InfoPedidoDTO;

@FeignClient("fornecedor")
public interface FornecedorClient {

	@RequestMapping("/info/{estado}")
	InfoFornecedorDTO getInfoPorEstado(@PathVariable String estado);

	@RequestMapping(method = RequestMethod.POST, value = "/pedido")
	InfoPedidoDTO realizaCompra(List<ItemDaCompraDTO> itens);

}
